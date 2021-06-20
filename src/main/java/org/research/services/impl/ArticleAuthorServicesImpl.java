package org.research.services.impl;



import java.util.List;

import org.research.beans.ArticleAuthor;
import org.research.repository.ArticleAuthorRepository;
import org.research.services.interfaces.ArticleAuthorServices;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleAuthorServicesImpl implements ArticleAuthorServices {

    @Autowired
    private ArticleAuthorRepository repository;

    
    public void create(ArticleAuthor object) {
        repository.save(object);
    }

    
    public void update(ArticleAuthor object) {
        repository.save(object);
    }

    
    public void delete(ArticleAuthor object) {
        repository.delete(object);
    }

    
    public ArticleAuthor find(Long id) {
        return repository.findOne(id);
    }

    
    public List<ArticleAuthor> getAll() {
        return repository.findAll();
    }
}
