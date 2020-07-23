package lesson.lombok;

import lombok.Builder;
import lombok.Singular;
import java.util.Set;

@Builder
public class BuilderExample {
    private String name;
    private int age;
    @Singular  // collection
    private Set<String> occupations;
}
