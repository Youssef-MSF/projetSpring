package org.research.services.impl;

import org.research.beans.Author;
import org.research.repository.AuthorRepository;
import org.research.services.interfaces.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("authorServicesImpl")
@Transactional
public class AuthorServicesImpl implements AuthorServices {

    @Autowired
    public AuthorRepository dao;

    
    public void create(Author object) {
        dao.save(object);
    }

    
    public void update(Author object) {
        dao.save(object);
    }

    
    public void delete(Author object) {
        dao.delete(object);
    }

    
    public Author find(Long id) {
        return dao.findOne(id);
    }

    
    public List<Author> getAll() {
        return dao.findAll();
    }
}
