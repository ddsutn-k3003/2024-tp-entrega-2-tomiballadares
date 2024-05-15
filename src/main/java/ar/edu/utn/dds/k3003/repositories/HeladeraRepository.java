package ar.edu.utn.dds.k3003.repositories;

import ar.edu.utn.dds.k3003.model.Heladera;
import lombok.Getter;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

import java.util.concurrent.atomic.AtomicLong;
@Getter
public class HeladeraRepository {
    private static AtomicLong seqId = new AtomicLong();

    public Collection<Heladera> heladeras;

    public HeladeraRepository() {
        this.heladeras=new ArrayList<>();
    }
    public void guardar(Heladera heladera){

        if (Objects.isNull(heladera.getId())) {
            heladera.setId((int)seqId.getAndIncrement());
        }
        this.heladeras.add(heladera);

    }
    public Heladera findById (long id){
        //Optional<Heladera> heladeraEncontrada = heladeras.stream().filter(h-> h.getId().equals((int)id)).findFirst();
        Optional<Heladera> heladeraEncontrada = heladeras.stream()
                .filter(h -> h.getId() == (int) id)
                .findFirst();
        return heladeraEncontrada.orElseThrow(() -> new NoSuchElementException(
                String.format("No hay un heladera de id: %s", id)
        ));
    }
    public void remove(Heladera heladera){
        this.heladeras.remove(heladera);
    }
}
