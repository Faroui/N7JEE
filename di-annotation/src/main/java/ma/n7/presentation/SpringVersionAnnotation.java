package ma.n7.presentation;

import ma.n7.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringVersionAnnotation {

        public static void main(String[] args) {
            System.out.println("SpringVersionAnnotation");
            ApplicationContext context = new AnnotationConfigApplicationContext("ma.n7");
            IService service = context.getBean(IService.class);
            System.out.println("service.calculer() = " + service.calculer());
        }
}
