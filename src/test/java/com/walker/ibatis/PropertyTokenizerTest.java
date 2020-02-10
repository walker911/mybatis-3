package com.walker.ibatis;

import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.junit.jupiter.api.Test;

/**
 * @author walker
 * @date 2020/2/10
 */
public class PropertyTokenizerTest {

  @Test
  public void testPropertyTokenizer() {
    PropertyTokenizer tokenizer = new PropertyTokenizer("author.id");
    System.out.println("name: " + tokenizer.getName());
    System.out.println("children: " + tokenizer.getChildren());
  }
}
