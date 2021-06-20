package org.research.services.interfaces;

import org.research.beans.ArticleReferees;

import java.util.List;

public interface ArticleRefereesServices {

    public void create(ArticleReferees object);
    public void update(ArticleReferees object);
    public void delete(ArticleReferees object);
    public ArticleReferees find(Long id);
    public List<ArticleReferees> getAll();
}
