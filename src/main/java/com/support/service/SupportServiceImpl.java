package com.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.support.dao.SupportDao;
import com.support.model.Support;

@Service("supportService")
public class SupportServiceImpl implements SupportService {

    @Autowired
    private SupportDao supportDao;

    @Override
    public Support getSupport(Long id) {
        return supportDao.getSupport(id);
    }

    @Override
    public Long saveSupport(Support support) {
        return supportDao.saveSupport(support);
    }

    @Override
    public List<Support> listAllSupports() {
        return supportDao.listAllSupports();
    }

    @Override
    public void update(Long id, Support support) {
        Support supportUpdate = supportDao.getSupport(id);
        if (supportUpdate != null) {
            supportUpdate.setCompany(support.getCompany());
            supportUpdate.setUser(support.getUser());
            supportUpdate.setPhone(support.getPhone());
            supportUpdate.setEmail(support.getEmail());
            supportUpdate.setClassification(support.getClassification());
            supportUpdate.setDescription(support.getDescription());
            supportUpdate.setAnyDesk(support.getAnyDesk());
            supportUpdate.setAnswered(support.getAnswered());
            supportUpdate.setSupportAttendant(support.getSupportAttendant());
            supportUpdate.setResult(support.getResult());
        }
    }

    @Override
    public void delete(Long id) {
        Support supportDelete = supportDao.getSupport(id);
        if (supportDelete != null) {
            supportDao.deleteSupport(supportDelete);
        }

    }

    @Override
    public boolean isStupportUnique(Long id) {
        Support support = supportDao.getSupport(id);
        return (support == null || (id != null & !id.equals(support.getId())));
    }

}
