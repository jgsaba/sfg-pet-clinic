package model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity{

    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;
}
