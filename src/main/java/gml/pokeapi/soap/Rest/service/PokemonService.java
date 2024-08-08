package gml.pokeapi.soap.Rest.service;

import gml.pokeapi.soap.Rest.client.PokemonClient;
import gml.pokeapi.soap.Soap.model.GetPokemonsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonClient pokemonClient;

    @Autowired
    public PokemonService(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }

    public GetPokemonsResponse getPokemons(int limit, int offset) {
        return pokemonClient.getPokemons(limit, offset);
    }
}