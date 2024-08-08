package gml.pokeapi.soap.Soap.endpoint;

import gml.pokeapi.soap.Soap.model.GetPokemonsRequest;
import gml.pokeapi.soap.Soap.model.GetPokemonsResponse;
import gml.pokeapi.soap.Soap.model.Result;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://gmlpt.com/pokemon";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonListRequest")
    @ResponsePayload
    public GetPokemonsResponse getPokemonList(@RequestPayload GetPokemonsRequest request) {
        GetPokemonsResponse response = new GetPokemonsResponse();
        // Lógica para obtener los datos de Pokémon
        response.setCount(100);  // Ejemplo de datos
        response.setNext("http://gmlpt.com/pokemon/next");
        response.setPrevious("http://gmlpt.com/pokemon/previous");

        List<Result> results = new ArrayList<>();
        for (int i = 0; i < request.getLimit(); i++) {
            Result result = new Result();
            result.setName("Pokemon" + (i + 1));
            result.setUrl("http://gmlpt.com/pokemon" + (i + 1));
            results.add(result);
        }
        response.getResults().addAll(results);
        return response;
    }
}
