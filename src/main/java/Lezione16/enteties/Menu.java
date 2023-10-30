package Lezione16.enteties;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Menu {
    private List<Pizza> pizze;
    private List<Beverage> bevande;

}
