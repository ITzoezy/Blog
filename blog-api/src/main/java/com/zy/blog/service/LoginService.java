package com.zy.blog.service;

import com.zy.blog.dao.pojo.SysUser;
import com.zy.blog.vo.Result;
import com.zy.blog.vo.params.LoginParams;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginService {
    //登录，验证用户
    Result login(LoginParams loginParams);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    Result register(LoginParams loginParams);
}
