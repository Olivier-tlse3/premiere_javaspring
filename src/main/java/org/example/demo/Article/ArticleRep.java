package org.example.demo.Article;
import org.example.demo.User.User;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRep extends CrudRepository<Article, Integer> {


    Article getArticlesById(long id);

    Iterable<Article> getArticlesByAuthor(User author);
}
