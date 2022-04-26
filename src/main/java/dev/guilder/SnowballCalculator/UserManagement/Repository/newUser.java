package dev.guilder.SnowballCalculator.UserManagement.Repository;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class newUser {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}