package com.xiaohao.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohao.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {

    /**
     * 根据文章ID查询标签列表
     *
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);
}
