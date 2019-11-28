package cn.sp.appinfo.service.impl;

import cn.sp.appinfo.dao.DevUserDao;
import cn.sp.appinfo.entity.DevUser;
import cn.sp.appinfo.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserSerivceImpl implements DevUserService {

    @Resource
    private DevUserDao devUserDao;
    @Override
    public DevUser login(String devCode, String devPassword) {
        return devUserDao.getByDevCodeAndDevpassword(devCode,devPassword);
    }
}
