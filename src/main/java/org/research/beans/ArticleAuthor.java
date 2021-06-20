package org.research.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ArticleAuthor {

	@EmbeddedId
	private ArticleAuthorId id;
	
	@ManyToOne
	@MapsId("idArticle")
	private Article article;
	
	@ManyToOne
	@MapsId("idAuthor")
	private Author author;
	
	private String role;
	
	public ArticleAuthor(Article article, Author author, String role) {
		this.article = article;
		this.author = author;
		this.role = role;
	}

	public ArticleAuthor() {
	}

	public ArticleAuthorId getId() {
		return id;
	}

	public void setId(ArticleAuthorId id) {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
