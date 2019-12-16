package com.support.service;

import java.util.List;

import com.support.model.Support;

public interface SupportService {
    
    Support getSupport(Long id);

    Long saveSupport(Support support);

    List<Support> listAllSupports();

    void update(Long id, Support support);

    void delete(Long id);

    boolean isStupportUnique(Long id);

}
