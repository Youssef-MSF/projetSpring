package org.research.beans;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ArticleAuthorId  implements Serializable {

	private Long idArticle;
	private Long idAuthor;

	public ArticleAuthorId(Long idArticle, Long idAuthor) {
		this.idArticle = idArticle;
		this.idAuthor = idAuthor;
	}

	public ArticleAuthorId() {

	}

	public Long getIdArticle() {
		return idArticle;
	}
	
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	
	public Long getIdAuthor() {
		return idAuthor;
	}
	
	public void setIdAuthor(Long idAuthor) {
		this.idAuthor = idAuthor;
	}
}
