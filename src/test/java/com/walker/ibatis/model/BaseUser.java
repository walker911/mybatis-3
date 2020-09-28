package com.walker.ibatis.model;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/9/28
 */
public class BaseUser {

  private String remark;

  public BaseUser() {
  }

  public BaseUser(String remark) {
    this.remark = remark;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "BaseUser{" +
      "remark='" + remark + '\'' +
      '}';
  }
}
