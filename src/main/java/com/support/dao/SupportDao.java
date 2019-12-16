package com.support.dao;

import java.util.List;

import com.support.model.Support;

public interface SupportDao {
    
    Support getSupport(Long id);

    Long saveSupport(Support support);

    List<Support> listAllSupports();

    void updateSupport(Support support);

    void deleteSupport(Support support);

}
