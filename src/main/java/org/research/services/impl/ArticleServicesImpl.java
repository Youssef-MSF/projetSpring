package org.research.services.impl;



import java.util.List;

import org.research.beans.Article;
import org.research.beans.Author;
import org.research.repository.ArticleRepository;
import org.research.repository.AuthorRepository;
import org.research.services.interfaces.ArticleServices;
import org.research.services.interfaces.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleServicesImpl implements ArticleServices {

    @Autowired
    public ArticleRepository dao;

    
    public void create(Article object) {
        dao.save(object);
    }

    
    public void update(Article object) {
        dao.save(object);
    }

    
    public void delete(Article object) {
        dao.delete(object);
    }

    
    public Article find(Long id) {
        return dao.findOne(id);
    }

    
    public List<Article> getAll() {
        return dao.findAll();
    }
}
