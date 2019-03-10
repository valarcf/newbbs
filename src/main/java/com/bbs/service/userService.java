package com.bbs.service;


import com.bbs.dao.userDao;
import com.bbs.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by valar on 2019/1/5.
 */
@Service
public class userService {
    @Autowired
    private userDao userDao;
    public boolean login(String username, String password){
        user user = userDao.findByUserNameAndPw(username,password);
        if(null == user){
            return false;
        }else {
            return true;
        }
    }
    public boolean regist(String name,String pw,String sex,int age,String tel,String email){
        user user = new user();
        user.setUseraddress(null);
        user.setUserage(age);
        user.setUseremail(email);
        user.setUserlink(null);
        user.setUsername(name);
        user.setUserphone(Integer.parseInt(tel));
        user.setUserpw(pw);
        user.setUsersex(sex);
        user.setUsertitle(null);
        user.setUserSee(1);
        user isSave = userDao.save(user);
        if(isSave == null)
        return true;
        else return false;
    }

}
