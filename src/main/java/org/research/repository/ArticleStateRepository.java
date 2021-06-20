package org.research.repository;

import org.research.beans.ArticleState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleStateRepository extends JpaRepository<ArticleState,Long> {
}
