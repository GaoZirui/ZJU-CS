package com.EBuy.backend.config.interceptor;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token =  request.getHeader("token");
//        if (!(handler instanceof HandlerMethod))
//            return true;
//
//        if (StrUtil.isBlank(token))
//            throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "token错误, 请重新登录");
//
//        String userID;
//        try {
//            userID = JWT.decode(token).getAudience().get(0);
//        }
//        catch (JWTDecodeException j) {
//            throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "token错误, 请重新登录");
//        }
//
//        User user = userService.getById(Integer.parseInt(userID));
//        if (user == null)
//            throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "用户不存在, 请重新登录");
//
//        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
//        try {
//            jwtVerifier.verify(token);
//        }
//        catch (JWTVerificationException e) {
//            throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "token错误, 请重新登录");
//        }

        return true;
    }
}
