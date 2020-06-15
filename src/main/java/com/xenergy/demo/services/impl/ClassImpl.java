package com.xenergy.demo.services.impl;

import com.xenergy.demo.dao.ClassDao;
import com.xenergy.demo.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClassImpl{

    @Autowired
    private ClassDao classDao;

    public List<Class> findAll(){
        return classDao.findAll();
    }

    public Class findById(long id) {
        return classDao.findById(id);
    }
}
