package org.research.services.interfaces;

import org.research.beans.ArticleState;

import java.util.List;

public interface ArticleStateServices {

    public void create(ArticleState object);
    public void update(ArticleState object);
    public void delete(ArticleState object);
    public ArticleState find(Long id);
    public List<ArticleState> getAll();
}
