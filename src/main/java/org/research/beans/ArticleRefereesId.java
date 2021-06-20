package org.research.beans;

import java.io.Serializable;
import javax.persistence.Embeddable;


@SuppressWarnings("serial")
@Embeddable
public class ArticleRefereesId  implements Serializable {
	private Long idArticle;
	private Long idAuthor;

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
