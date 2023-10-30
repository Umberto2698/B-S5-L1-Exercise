package Lezione16;

import Lezione16.enteties.Beverage;
import Lezione16.enteties.Menu;
import Lezione16.enteties.Pizza;
import Lezione16.enteties.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza getBase() {
        return new Pizza(1000, 4.99, "Margherita", null);
    }

    @Bean
    Pizza getBismark() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getPatatine());
        toppings.add(getUovo());
        toppings.add(getWurstel());
        return new Pizza(3000, 8.50, "Bismark", toppings);
    }

    @Bean
    Pizza getBaby() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getPatatine());
        toppings.add(getWurstel());
        return new Pizza(4000, 7.50, "Baby", toppings);
    }

    @Bean
    Pizza getDiavola() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getSalamimno());
        return new Pizza(5000, 6.50, "Diavola", toppings);
    }

    @Bean
    Pizza getCoco() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getUovo());
        toppings.add(getProsciutto());
        return new Pizza(2500, 7.00, "Cocò", toppings);
    }

    @Bean
    Pizza grtProsciuttoEFunghi() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getFunghi());
        toppings.add(getProsciutto());
        return new Pizza(2500, 7.00, "Cocò", toppings);
    }

    @Bean
    Pizza getTonnoCiplla() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getTonno());
        toppings.add(getCipolla());
        return new Pizza(2500, 8.00, "Tonno e cipolla", toppings);
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
    Menu getMenu() {
        List<Pizza> pizze = new ArrayList<>();
        List<Beverage> bevande = new ArrayList<>();
        pizze.add(getCoco());
        pizze.add(getBase());
        pizze.add(getBaby());
        pizze.add(getDiavola());
        pizze.add(getBismark());
        pizze.add(getDiavola());
        pizze.add(grtProsciuttoEFunghi());
        pizze.add(getTonnoCiplla());
        bevande.add(getWater());
        bevande.add(getCocaCola());
        bevande.add(getBirra());
        return new Menu(pizze, bevande);
    }

}
