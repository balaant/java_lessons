package lesson.lombok;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(exclude = "id")
@EqualsAndHashCode(exclude = { "id" })
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    private String name;
    private int id;

    public ToStringExample(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
