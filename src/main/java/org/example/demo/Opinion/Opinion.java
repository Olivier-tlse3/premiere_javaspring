package org.example.demo.Opinion;

import jakarta.persistence.*;
import org.example.demo.Article.Article;
import org.example.demo.User.User;

@Entity
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int opinion_id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private OpinionType type;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "article_id")
    private Article article;

    public Opinion() {}

    public int getId() {
        return opinion_id;
    }

    public OpinionType getType() {
        return type;
    }

    public void setType(OpinionType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
