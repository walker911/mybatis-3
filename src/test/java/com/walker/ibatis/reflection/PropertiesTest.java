package com.walker.ibatis.reflection;

import com.walker.ibatis.model.User;
import org.apache.ibatis.reflection.property.PropertyCopier;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/9/28
 */
public class PropertiesTest {

  @Test
  public void propertyCopier() {
    User user1 = new User(1, "user1", "remark1");
    User user2 = new User();
    PropertyCopier.copyBeanProperties(user1.getClass(), user1, user2);
    System.out.println(user2.getRemark());
  }
}
