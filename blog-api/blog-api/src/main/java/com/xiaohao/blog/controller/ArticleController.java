package com.xiaohao.blog.controller;

import com.xiaohao.blog.service.ArticleService;
import com.xiaohao.blog.vo.Result;
import com.xiaohao.blog.vo.param.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {

        return articleService.listArticle(pageParams);
    }
}
