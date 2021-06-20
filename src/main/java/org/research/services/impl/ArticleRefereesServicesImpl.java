package org.research.services.impl;


import java.util.List;

import org.research.beans.ArticleReferees;
import org.research.repository.ArticleRefereesRepository;
import org.research.services.interfaces.ArticleRefereesServices;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleRefereesServicesImpl implements ArticleRefereesServices {

    @Autowired
    private ArticleRefereesRepository repository;

    
    public void create(ArticleReferees object) {
        repository.save(object);
    }

    
    public void update(ArticleReferees object) {
        repository.save(object);
    }

    
    public void delete(ArticleReferees object) {
        repository.delete(object);
    }

    
    public ArticleReferees find(Long id) {
        return repository.findOne(id);
    }

    
    public List<ArticleReferees> getAll() {
        return repository.findAll();
    }
}
