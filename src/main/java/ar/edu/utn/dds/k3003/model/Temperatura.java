package ar.edu.utn.dds.k3003.model;

import ar.edu.utn.dds.k3003.facades.dtos.TemperaturaDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter

public class Temperatura {
    private  Integer heladeraId;
    private  LocalDateTime fechaMedicion;
    private  Integer temperatura;

    public Temperatura(Integer heladeraId, LocalDateTime fechaMedicion, Integer temperatura) {
        this.heladeraId = heladeraId;
        this.fechaMedicion = fechaMedicion;
        this.temperatura = temperatura;
    }
    public Temperatura(){

    }
}

