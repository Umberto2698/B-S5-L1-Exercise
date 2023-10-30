package Lezione16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lezione16Application {

    public static void main(String[] args) {
        SpringApplication.run(Lezione16Application.class, args);

        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Lezione16Application.class);
        System.out.println(ctx.getBean("getMenu"));
        ctx.close();
    }
}
