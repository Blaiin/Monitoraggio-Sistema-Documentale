package it.dmi.data.api.service;

import it.dmi.data.api.repositories.impl.TipoControlloRP;
import it.dmi.data.entities.TipoControllo;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@SuppressWarnings("unused")
@Stateless
public class TipoControlloService {

    @Inject
    private TipoControlloRP repository;

    private void create(TipoControllo tipoControllo) {
        repository.save(tipoControllo);
    }

    public TipoControllo getByID(Long id) {
        return repository.findByID(id);
    }

    public void update(TipoControllo tipoControllo) {
        repository.update(tipoControllo);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public List<TipoControllo> getAll() {
        return repository.findAll();
    }
}
