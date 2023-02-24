package pres;

import dao.DaoImpl;
import extension.IDaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*Injection des dépendance par instantiation Statique => new , Couplage Fort*/
        IDaoImpl2 dao = new IDaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        double res = metier.calcul();
        System.out.println("Résultat = " + res);
    }
}
