package com.xenergy.demo.dao;

import com.xenergy.demo.entity.Class;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassDao extends PagingAndSortingRepository<Class, Long> {

    Class findById(long id);

    List<Class> findAll();
}
