package com.ziangxue.dineandrateservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long personId;

    private String name;
    private String campus;
    private String email;
    private String username;

    public Person(Long personId, String name, String campus, String email, String username) {
        this.personId = personId;
        this.name = name;
        this.campus = campus;
        this.email = email;
        this.username = username;
    }
    
}