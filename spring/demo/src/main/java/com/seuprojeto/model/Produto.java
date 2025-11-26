package com.seuprojeto.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double preco;
}
