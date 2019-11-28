package cn.sp.appinfo.dao;

import cn.sp.appinfo.entity.DevUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DevUserDao {

    public DevUser getByDevCodeAndDevpassword(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
