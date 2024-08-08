package gml.pokeapi.soap.Soap.model;

import lombok.*;

import java.util.List;

@Getter
@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetPokemonsResponse {
    private int count;
    private String next;
    private String previous;
    private List<Result> results;

}