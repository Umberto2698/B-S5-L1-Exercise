package Lezione16.enteties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public abstract class Info {
    int calories;
    boolean price;
    String name;
}
