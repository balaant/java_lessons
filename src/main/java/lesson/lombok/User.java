package lesson.lombok;

import lombok.*;

import java.io.Serializable;



@NoArgsConstructor//<--- THIS is it
public class User implements Serializable {

    @Getter @Setter private  Long id;

    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private int age;

}