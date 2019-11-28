package cn.sp.appinfo.service;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserService {

    public DevUser login(String devCode,String devPassword);
}
