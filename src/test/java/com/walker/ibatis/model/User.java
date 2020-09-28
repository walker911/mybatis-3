package com.walker.ibatis.model;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/9/28
 */
public class User extends BaseUser {

  private Integer id;

  private String name;

  public User() {
  }

  public User(Integer id, String name, String remark) {
    super(remark);
    this.id = id;
    this.name = name;
  }

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

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}
