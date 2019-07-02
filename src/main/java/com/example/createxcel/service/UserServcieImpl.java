package com.example.createxcel.service;

import com.example.createxcel.mapper.UserMapper;
import com.example.createxcel.pojo.User;
import com.example.createxcel.util.CreatExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServcieImpl implements UserServcie {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void CreatExcel() {

        List<User> users=userMapper.selectList(null);
        System.out.println("users  "+users);
        if(users!=null){
            CreatExcel.getHSSFWorkbook(users);
        }
        System.out.println("定时任务执行成功！！");
    }
}
