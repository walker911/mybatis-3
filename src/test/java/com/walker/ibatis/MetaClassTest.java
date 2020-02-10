package com.walker.ibatis;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.junit.jupiter.api.Test;

/**
 * @author walker
 * @date 2020/2/4
 */
public class MetaClassTest {

  private class Author {
    private Integer id;
    private String name;
    private Integer age;
    private Article[] articles;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getAge() {
      return age;
    }

    public void setAge(Integer age) {
      this.age = age;
    }

    public Article[] getArticles() {
      return articles;
    }

    public void setArticles(Article[] articles) {
      this.articles = articles;
    }
  }

  private class Article {
    private Integer id;
    private String title;
    private String content;
    private Author author;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }

    public Author getAuthor() {
      return author;
    }

    public void setAuthor(Author author) {
      this.author = author;
    }
  }

  @Test
  public void testHasSetter() {
    // 为 Author 创建元信息对象
    MetaClass authorMeta = MetaClass.forClass(Author.class, new DefaultReflectorFactory());
    System.out.println("--------- Author ---------------");
    System.out.println("id -> " + authorMeta.hasSetter("id"));
    System.out.println("name -> " + authorMeta.hasSetter("name"));
    System.out.println("age -> " + authorMeta.hasSetter("age"));
    // 检查 Author 中是否包含 Article[] 的 setter
    System.out.println("articles -> " + authorMeta.hasSetter("articles"));
    System.out.println("articles[] -> " + authorMeta.hasSetter("articles[]"));
    System.out.println("title -> " + authorMeta.hasSetter("title"));

    // 为 Article 创建元信息对象
    MetaClass articleMeta = MetaClass.forClass(Article.class, new DefaultReflectorFactory());
    System.out.println("---------- Article -----------------");
    System.out.println("id -> " + articleMeta.hasSetter("id"));
    System.out.println("title -> " + articleMeta.hasSetter("title"));
    System.out.println("content -> " + articleMeta.hasSetter("content"));

    System.out.println("author.id -> " + articleMeta.hasSetter("author.id"));
    System.out.println("author.name -> " + articleMeta.hasSetter("author.name"));
  }
}
