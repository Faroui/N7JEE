package dao;
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se Connecter à la base de données pour récupurer la température
        */
        double temperature = Math.random()*40;
        return temperature;
    }
}


