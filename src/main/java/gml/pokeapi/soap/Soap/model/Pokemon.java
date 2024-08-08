package gml.pokeapi.soap.Soap.model;

import lombok.*;

@Getter
@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    private String name;
    private String url;

}