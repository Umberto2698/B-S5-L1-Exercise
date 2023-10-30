package Lezione16;

import Lezione16.enteties.Beverage;
import Lezione16.enteties.Menu;
import Lezione16.enteties.Pizza;
import Lezione16.enteties.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza getBase() {
        return new Pizza(1000, 4.99, "Margherita");
    }

    @Bean
    Pizza getBismark() {
        return new Pizza(3000, 8.50, "Bismark");
    }

    @Bean
    Pizza getBaby() {
        return new Pizza(4000, 7.50, "Baby");
    }

    @Bean
    Pizza getDiavola() {
        return new Pizza(5000, 6.50, "Diavola");
    }

    @Bean
    Pizza getCoco() {
        return new Pizza(2500, 7.00, "Cocò");
    }

    @Bean
    Pizza getTonnoCiplla() {
        return new Pizza(2500, 8.00, "Tonno e cipolla");
    }

    @Bean
    Beverage getWater() {
        return new Beverage(0, 1.10, "Acqua naturale/frizzante");
    }

    @Bean
    Beverage getBirra() {
        return new Beverage(300, 4.00, "Ceres");
    }

    @Bean
    Beverage getCocaCola() {
        return new Beverage(100, 2.20, "CocaCola");
    }

    @Bean
    Topping getTonno() {
        return new Topping("Tonno");
    }

    @Bean
    Topping getPatatine() {
        return new Topping("Patatine fritte");
    }

    @Bean
    Topping getWurstel() {
        return new Topping("Wurstel");
    }

    @Bean
    Topping getCipolla() {
        return new Topping("Cipolla");
    }

    @Bean
    Topping getProsciutto() {
        return new Topping("Prosciutto cotto");
    }

    @Bean
    Topping getUovo() {
        return new Topping("Uovo");
    }

    @Bean
    Topping getFunghi() {
        return new Topping("Funghi");
    }

    @Bean
    Topping getSalamimno() {
        return new Topping("Salamino piccante");
    }

    @Bean
    Menu

}
