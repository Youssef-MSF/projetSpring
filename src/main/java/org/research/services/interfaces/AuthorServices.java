package org.research.services.interfaces;

import org.research.beans.Author;

import java.util.List;

public interface AuthorServices {

    public void create(Author object);
    public void update(Author object);
    public void delete(Author object);
    public Author find(Long id);
    public List<Author> getAll();
}
