package org.research.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ArticleReferees {

	@EmbeddedId
	private ArticleRefereesId id;
	
	@ManyToOne
	@MapsId("idArticle")
	private Article article;
	
	@ManyToOne
	@MapsId("idAuthor")
	private Author author;
	
	public ArticleReferees(Article article, Author author) {
		this.article = article;
		this.author = author;
	}

	public ArticleReferees() {
	}

	public ArticleRefereesId getId() {
		return id;
	}

	public void setId(ArticleRefereesId id) {
		this.id = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
