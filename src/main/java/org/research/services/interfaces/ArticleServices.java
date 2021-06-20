package org.research.services.interfaces;

import org.research.beans.Article;
import java.util.List;

public interface ArticleServices {
    public void create(Article object);
    public void update(Article object);
    public void delete(Article object);
    public Article find(Long id);
    public List<Article> getAll();
}
