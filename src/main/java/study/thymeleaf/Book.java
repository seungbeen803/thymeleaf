package study.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class Book implements Serializable {
    private String name;
    private Author author;
    private int price;
    private boolean sale;
    private double saleAmount;
}
