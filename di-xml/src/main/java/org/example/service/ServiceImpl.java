package org.example.service;


import org.example.dao.IDao;

public class ServiceImpl implements IService{
    private IDao dao;
    @Override
    public double calculer() {
        return dao.getData()*Math.random()*10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
