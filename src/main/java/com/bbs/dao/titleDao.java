package com.bbs.dao;

import com.bbs.entity.title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by valar on 2019/1/5.
 */
@Repository
public interface titleDao extends JpaRepository<title,String>{

}
