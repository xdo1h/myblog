package com.xiaohao.blog.service;

import com.xiaohao.blog.vo.Result;
import com.xiaohao.blog.vo.param.PageParams;

public interface ArticleService {

    Result listArticle(PageParams pageParams);
}
