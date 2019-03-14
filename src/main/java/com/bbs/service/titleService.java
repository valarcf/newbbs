package com.bbs.service;


import com.bbs.dao.titleDao;
import com.bbs.dao.userDao;
import com.bbs.entity.title;
import com.bbs.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by valar on 2019/1/5.
 */
@Service
public class titleService {
    @Autowired
    private titleDao titleDao;

    public List<title> list(){
        List<title> titles = (List<title>) titleDao.findAll();

        return titles;
    }
    public Page<title> getSourceCode(int pageNumber, int pageSize){
        PageRequest request = this.buildPageRequest(pageNumber,pageSize);
        Page<title> sourceCodes= this.titleDao.findAll(request);
        return sourceCodes;
    }
    private PageRequest buildPageRequest(int pageNumber, int pagzSize) {
        return new PageRequest(pageNumber - 1, pagzSize, null);
    }
    public boolean newtitle(int userId , String email, String titText , String titName,String name){
        title title = new title();
        java.text.SimpleDateFormat simpleDateFormat = new  java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss");
        java.util.Date currentTime = new  java.util.Date();
        String time =  simpleDateFormat.format(currentTime).toString();
        title.setTitTime(time);
        title.setUsername(name);
        title.setTitSee(1);
        title.setEmail(email);
        title.setTitStyle("抽象");
        title.setTitText(titText);
        title.setTitName(titName);
        title.setUserId(userId);
        title isSave = titleDao.save(title);
        if(isSave == null)
        return false;
        else
        {
            System.out.println(title.getTitName());
            return true;
        }
    }

}
