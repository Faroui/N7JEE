package ma.n7.extension;

import ma.n7.dao.IDao;
import ma.n7.service.IService;

public class ServiceImpl2 implements IService {
    private IDao dao;
    @Override
    public double calculer() {
        System.out.println("version 2 de calcule");
        return dao.getData()*Math.random()*20;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
