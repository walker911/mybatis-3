package com.walker.ibatis.mapper;

import com.walker.ibatis.model.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/9/27
 */
public interface ArticleMapper {

  List<Article> findByAuthorAndCreateTime(@Param("author") String author,
                                          @Param("createTime") String createTime);

  List<Article> findByAuthor(@Param("author") String author);
}
