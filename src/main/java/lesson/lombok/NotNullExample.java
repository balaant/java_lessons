package lesson.lombok;

import lombok.NonNull;

public class NotNullExample {
    private String name;

    public NotNullExample(@NonNull String name) {
        this.name = name;
    }
}

