package org.research.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comity {

    @Id
    private Long idComity;
    
    @ManyToOne
    private Article article;

    public Long getIdComity() {
        return idComity;
    }

    public void setIdComity(Long idComity) {
        this.idComity = idComity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
