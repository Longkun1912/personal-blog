package com.personal.blog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {
    @Id
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
