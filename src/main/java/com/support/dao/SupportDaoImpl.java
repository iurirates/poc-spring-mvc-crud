package com.support.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.support.model.Support;

@Repository("supportDao")
@Transactional
public class SupportDaoImpl extends AbstractDao<Long, Support> implements SupportDao {

    @Override
    public Support getSupport(Long id) {
        return getByKey(id);
    }

    @Override
    public Long saveSupport(Support support) {
        persist(support);
        return support.getId();
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Support> listAllSupports() {
        Criteria criteria = createEntityCriteria();
        return (List) criteria.list();
    }

    @Override
    public void updateSupport(Support support) {
        update(support);
    }

    @Override
    public void deleteSupport(Support support) {
        delete(support);
    }

}
