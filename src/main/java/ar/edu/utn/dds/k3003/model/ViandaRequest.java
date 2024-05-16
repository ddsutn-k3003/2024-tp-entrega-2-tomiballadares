package ar.edu.utn.dds.k3003.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class ViandaRequest {
    private String qr;
    private Integer idHeladera;

    public ViandaRequest() {

    }
}
