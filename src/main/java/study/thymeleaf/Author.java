package study.thymeleaf;

import lombok.*;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class Author implements Serializable {
    private String name;
}
