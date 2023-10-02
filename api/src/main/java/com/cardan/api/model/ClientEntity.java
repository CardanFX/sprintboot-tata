package com.cardan.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Entity
@Table(name="clients")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
