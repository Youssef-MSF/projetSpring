package org.research.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Article {

    @Id
    private Long idArticle;
    private String title;
    private String resume;
    private File file;
    
    @OneToMany(mappedBy = "article")
    private List<Comity> committees = new ArrayList<Comity>();

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<Comity> getCommittees() {
        return committees;
    }

    public void setCommittees(List<Comity> committees) {
        this.committees = committees;
    }
}
