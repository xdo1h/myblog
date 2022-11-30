package com.xiaohao.blog.service;

import com.xiaohao.blog.dao.pojo.SysUser;

public interface SysUserService {

    SysUser findUserById(Long id);
}
