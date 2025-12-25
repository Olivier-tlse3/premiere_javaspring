package org.example.demo.Opinion;

import org.example.demo.Article.Article;
import org.springframework.data.repository.CrudRepository;

public interface OpinionRep extends CrudRepository<Opinion, Long> {

    Opinion getOpinionById(long id);

    void deleteByArticle(Article article);

}
