package com.lyzzz.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyzzz.blog.entity.Article;

import java.util.List;

/**
 * @location： BlogSystem\com.lyzzz.blog.dao
 * @creatTime: 2020/7/18  10:42
 * @author: Administrator
 * @remark:
 */
public interface ArticleMapper extends BaseMapper<Article> {

    List<Article> findByTag(Long id);

    List<Article> findByCategory(Long id);
}