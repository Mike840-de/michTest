package com.michelin.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "public", name = "users")
public class User extends AbstractAuditingEntity{

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @Override
    public Object getId() {
        return null;
    }
}
