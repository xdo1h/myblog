package com.xiaohao.blog.service;

import com.xiaohao.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);
}
