package org.research.services.impl;

import org.research.beans.Comity;
import org.research.repository.ComityRepository;
import org.research.services.interfaces.ComityServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComityServicesImpl implements ComityServices {

    @Autowired
    private ComityRepository repository;

    
    public void create(Comity object) {
        repository.save(object);
    }

    
    public void update(Comity object) {
        repository.save(object);
    }

    
    public void delete(Comity object) {
        repository.delete(object);
    }

    
    public Comity find(Long id) {
        return repository.findOne(id);
    }

    
    public List<Comity> getAll() {
        return repository.findAll();
    }
}
