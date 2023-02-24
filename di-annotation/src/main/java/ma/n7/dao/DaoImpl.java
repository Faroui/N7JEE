package ma.n7.dao;

import org.springframework.stereotype.Component;

@Component("dao") //chaque fois qu'on va instancier DaoImpl, on va l'appeler "dao" si en trouve @Component("dao")
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
