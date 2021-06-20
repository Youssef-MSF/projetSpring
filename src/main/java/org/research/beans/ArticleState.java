package org.research.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArticleState {

    @Id
    private Long idState;

    public Long getIdState() {
        return idState;
    }

    public void setIdState(Long idState) {
        this.idState = idState;
    }
}
