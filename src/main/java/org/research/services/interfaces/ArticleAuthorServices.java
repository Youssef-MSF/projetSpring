package org.research.services.interfaces;

import org.research.beans.ArticleAuthor;

import java.util.List;

public interface ArticleAuthorServices {

    public void create(ArticleAuthor object);
    public void update(ArticleAuthor object);
    public void delete(ArticleAuthor object);
    public ArticleAuthor find(Long id);
    public List<ArticleAuthor> getAll();
}
