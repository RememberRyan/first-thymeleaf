package ee.sdacademy.demofirstthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Ryan Alexander on 28/11/2018.
 */

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String lastname;
    // boolean not good for swtich cases
    private int gender;
    private Integer age;
}
