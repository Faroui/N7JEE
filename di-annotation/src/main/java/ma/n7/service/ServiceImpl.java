package ma.n7.service;

import ma.n7.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")//Comme <bean id="service" class="ma.n7.service.ServiceImpl"/> il instancie la classe ServiceImpl et l'appelle "service"
public class ServiceImpl implements IService{
    @Autowired//Comme <property name="dao" ref="dao"/> il va chercher l'objet "dao" dans le contexte et l'injecte dans l'attribut dao
    private IDao dao;
    @Override
    public double calculer() {
        return dao.getData()*Math.random()*10;
    }

    /*public void setDao(IDao dao) {
        this.dao = dao;
    }*/
}
