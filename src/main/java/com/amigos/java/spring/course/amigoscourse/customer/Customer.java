package com.amigos.java.spring.course.amigoscourse.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Customer {
    @Id
    Long id;

    @NotBlank
    String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank
    String password;

    @NotBlank(message = "No email")
    @Email(message = "Bad email")
    String email;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}