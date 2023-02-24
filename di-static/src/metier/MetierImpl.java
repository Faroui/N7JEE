package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;//Couplage faible
    @Override
    public double calcul() {
        double temperature = dao.getData();
        double res = temperature;
        return res;
    }
    /*injecter dans la variables Dao
    * un objet d'une classe qui implémente l'interface IDao */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

