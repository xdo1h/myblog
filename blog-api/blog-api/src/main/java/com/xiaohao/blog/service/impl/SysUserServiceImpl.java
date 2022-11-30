package com.xiaohao.blog.service.impl;

import com.xiaohao.blog.dao.mapper.SysUserMapper;
import com.xiaohao.blog.dao.pojo.SysUser;
import com.xiaohao.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * @param id
     * @return
     */
    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("佚名");
        }
        return sysUser;
    }
}
