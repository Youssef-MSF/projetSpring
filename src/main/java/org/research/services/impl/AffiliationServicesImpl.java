package org.research.services.impl;

import org.research.beans.Affiliation;
import org.research.repository.AffiliationRepository;
import org.research.services.interfaces.AffiliationServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AffiliationServicesImpl implements AffiliationServices {

    @Autowired
    private AffiliationRepository repository;

    
    public void create(Affiliation object) {
        repository.save(object);
    }

    
    public void update(Affiliation object) {
        repository.save(object);
    }

    
    public void delete(Affiliation object) {
        repository.delete(object);
    }

    
    public Affiliation find(Long id) {
        return repository.findOne(id);
    }

    
    public List<Affiliation> getAll() {
        return repository.findAll();
    }
}
