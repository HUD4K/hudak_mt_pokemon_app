package com.hudak.mthudakpokemon.view

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.hudak.mthudakpokemon.LocationProvider
import com.hudak.mthudakpokemon.PokemonViewModel
import com.hudak.mthudakpokemon.R
import com.hudak.mthudakpokemon.SharedPreferencesRepository
import com.hudak.mthudakpokemon.ViewModelFactory

class PokemonSearchFragment : Fragment() {

    private val LOCATION_PERMISSION_REQUEST_CODE = 1

    private lateinit var viewModel: PokemonViewModel
    private lateinit var locationProvider: LocationProvider
    private lateinit var nameTextView: TextView
    private lateinit var photoImageView: ImageView
    private lateinit var inputEditText: EditText
    private lateinit var sendButton: Button
    private lateinit var typeTextView: TextView
    private lateinit var locationTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = SharedPreferencesRepository(requireContext())
        viewModel = ViewModelProvider(this, ViewModelFactory(repository)).get(PokemonViewModel::class.java)
        locationProvider = LocationProvider(requireContext()) { location ->
            val latitude = String.format("%.1f", location.latitude)
            val longitude = String.format("%.1f", location.longitude)
            locationTextView.text = "Location: ($latitude, $longitude)"
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_page1, container, false)

        nameTextView = view.findViewById(R.id.pokemonName)
        photoImageView = view.findViewById(R.id.pokemonImage)
        inputEditText = view.findViewById(R.id.inputName)
        sendButton = view.findViewById(R.id.chooseBtn)
        typeTextView = view.findViewById(R.id.pokemonType)
        locationTextView = view.findViewById(R.id.location)

        sendButton.setOnClickListener {
            viewModel.loadPokemon(inputEditText.text.toString().lowercase())
        }

        viewModel.pokemon.observe(viewLifecycleOwner, Observer { pokemon ->
            if (pokemon != null) {
                nameTextView.text = pokemon.name!!.uppercase()
                typeTextView.text = pokemon.abilities!![0].ability!!.name
                Glide.with(this@PokemonSearchFragment)
                    .load(pokemon.sprites!!.other!!.officialArtwork!!.frontDefault)
                    .into(photoImageView)
            }
        })

        return view
    }

    override fun onResume() {
        super.onResume()
        if (ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
            &&
            ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestLocationPermission()
        } else {
            locationProvider.startLocationUpdates()
        }
    }


    private fun requestLocationPermission() {
        if (shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_FINE_LOCATION) ||
            shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_COARSE_LOCATION)) {
        }
        requestPermissions(
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION),
            LOCATION_PERMISSION_REQUEST_CODE
        )
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    locationProvider.startLocationUpdates()
                }
                return
            }
        }
    }

    override fun onPause() {
        super.onPause()
        locationProvider.stopLocationUpdates()
    }
}
