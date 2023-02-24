package org.example.presentation;
import org.example.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IService service = (IService) ctx.getBean("service");//donne moi un objet de type IService
        System.out.println("Résultat = " + service.calculer());
    }
}
