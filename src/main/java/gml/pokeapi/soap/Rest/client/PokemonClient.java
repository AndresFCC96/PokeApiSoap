package gml.pokeapi.soap.Rest.client;

import gml.pokeapi.soap.Soap.model.GetPokemonsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokeapi-client", url = "https://pokeapi.co/api/v2")
public interface PokemonClient {

    @GetMapping("/pokemon")
    GetPokemonsResponse getPokemons(@RequestParam("limit") int limit, @RequestParam("offset") int offset);
}
