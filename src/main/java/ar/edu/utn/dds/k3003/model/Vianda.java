package ar.edu.utn.dds.k3003.model;

import ar.edu.utn.dds.k3003.facades.dtos.EstadoViandaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor

public class Vianda {
    private Long id;
    private String qr;
    private Long colaboradorID;
    private Long heladeraID;
    private EstadoViandaEnum estado;
    private LocalDateTime fechaElaboracion;

    public Vianda(String qr, Long heladeraID, EstadoViandaEnum estado, Long colaboradorID, LocalDateTime fechaElaboracion) {
        this.qr = qr;
        this.heladeraID = heladeraID;
        this.estado = estado;
        this.colaboradorID = colaboradorID;
        this.fechaElaboracion = fechaElaboracion;
    }
}
