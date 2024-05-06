package com.EBuy.backend.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.EBuy.backend.entity.User;
import com.EBuy.backend.service.UserService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;

@Component
public class TokenUtils {
    private static UserService staticUserService;

    @Resource
    private UserService userService;

    @PostConstruct
    public void setUserService() {
        staticUserService = userService;
    }

    public static String genToken(String userID, String sign) {
//        return JWT.create().withAudience(userID)
//                .withExpiresAt(DateUtil.offsetHour(new Date(), 2))
//                .sign(Algorithm.HMAC256(sign));
    }

    public static User getCurrentUser() {
//        try {
//            HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
//            String token = request.getHeader("token");
//            if (StrUtil.isNotBlank(token)) {
//                String userID = JWT.decode(token).getAudience().get(0);
//                return staticUserService.getById(Integer.parseInt(userID));
//            }
//        }
//        catch (Exception e) {
//            throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "token错误, 请重新登录");
//        }
//        throw new ServiceException(Constants.CODE_PERMISSION_ERROR, "token错误, 请重新登录");
        return null;
    }
}
