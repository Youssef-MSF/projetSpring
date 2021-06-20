package org.research.services.impl;



import java.util.List;

import org.research.beans.ArticleState;
import org.research.repository.ArticleStateRepository;
import org.research.services.interfaces.ArticleStateServices;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleStateServicesImpl implements ArticleStateServices {

    @Autowired
    private ArticleStateRepository repository;

    
    public void create(ArticleState object) {
        repository.save(object);
    }

    
    public void update(ArticleState object) {
        repository.save(object);
    }

    
    public void delete(ArticleState object) {
        repository.delete(object);
    }

    
    public ArticleState find(Long id) {
        return repository.findOne(id);
    }

    
    public List<ArticleState> getAll() {
        return repository.findAll();
    }
}
