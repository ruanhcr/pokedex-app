package com.ruru.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.ruru.pokedex.data.remote.responses.Pokemon
import com.ruru.pokedex.repository.PokemonRepository
import com.ruru.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
       return repository.getPokemonInfo(pokemonName)
    }
}