package extension;

import dao.IDao;

public class IDaoImpl2 implements IDao {

    @Override
    public double getData() {
        /*
        Se Connecter à la base de données pour récupurer la température
        */
        System.out.println("version capteur ");
        double temperature = 56;
        return temperature;
    }
}

