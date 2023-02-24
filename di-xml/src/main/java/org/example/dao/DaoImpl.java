package org.example.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se Connecter à la base de données pour récupurer la température
        */
        double temperature = 56;
        return temperature;
    }
}
