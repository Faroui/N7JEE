package ma.n7.presentation;

import ma.n7.dao.DaoImpl2;
import ma.n7.dao.IDao;
import ma.n7.service.IService;
import ma.n7.service.ServiceImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Allahoma yassir wa3alimna yarab
        try{
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassName = sc.nextLine();
            Class daoClass = Class.forName(daoClassName);
            IDao dao=(IDao) daoClass.newInstance();
            String serviceClassName = sc.nextLine();
            Class serviceClass = Class.forName(serviceClassName);
            IService service=(IService) serviceClass.newInstance();
            Method m = serviceClass.getMethod("setDao", IDao.class);//creation d'une methode setDao QUI PREND COMME PARAMETRE UN OBJET DE TYPE IDao
            m.invoke(service, dao);//pour executer la methode setDao sur l'objet service et lui passer en parametre l'objet dao
            System.out.println("Résultat => " + service.calculer());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
