package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;
}
