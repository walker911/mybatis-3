package com.walker.ibatis.model;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/9/27
 */
public class Article {

  private Integer id;

  private String title;

  private String content;

  private String author;

  private Date createTime;

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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "Article{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", content='" + content + '\'' +
      ", author='" + author + '\'' +
      ", createTime=" + createTime +
      '}';
  }
}
