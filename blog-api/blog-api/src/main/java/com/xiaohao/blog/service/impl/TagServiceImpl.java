package com.xiaohao.blog.service.impl;

import com.xiaohao.blog.dao.mapper.TagMapper;
import com.xiaohao.blog.dao.pojo.Article;
import com.xiaohao.blog.dao.pojo.Tag;
import com.xiaohao.blog.service.TagService;
import com.xiaohao.blog.vo.ArticleVo;
import com.xiaohao.blog.vo.TagVo;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;
    /**
     * @param articleId
     * @return
     */
    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copylist(tags);
    }

    private List<TagVo> copylist(List<Tag> tagList) {
        List<TagVo> tagVoList = new ArrayList<>();
        tagList.forEach(e -> {
            TagVo articleVo = copy(e);
            tagVoList.add(articleVo);
        });
        return tagVoList;
    }

    private TagVo copy(Tag article) {
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(article, tagVo);
        return tagVo;
    }
}
