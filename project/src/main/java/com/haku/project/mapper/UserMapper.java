package com.haku.project.mapper;


import com.haku.project.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.*;

import java.util.List;


public interface UserMapper extends Mapper<User> {

    //FIXME 特别注意，该接口不能被扫描到，否则会出错

    public List<User> queryAllUsers();

}