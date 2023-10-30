package Lezione16.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Beverage {
    private int calories;
    private double price;
    private String name;
}
