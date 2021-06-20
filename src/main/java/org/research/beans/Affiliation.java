package org.research.beans;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affiliation {

    @Id
    private Long idAffiliation;
    private String nameAffiliation;
    
    @OneToMany(mappedBy = "affiliation")
    private List<Author> authors = new ArrayList<Author>();

    public Long getIdAffiliation() {
        return idAffiliation;
    }

    public void setIdAffiliation(Long idAffiliation) {
        this.idAffiliation = idAffiliation;
    }

    public String getNameAffiliation() {
        return nameAffiliation;
    }

    public void setNameAffiliation(String nameAffiliation) {
        this.nameAffiliation = nameAffiliation;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
