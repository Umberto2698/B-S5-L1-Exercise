package Lezione16.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Pizza {
    private int calories;
    private double price;
    private String name;
}
