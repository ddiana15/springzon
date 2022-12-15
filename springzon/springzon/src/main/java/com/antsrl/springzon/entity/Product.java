package com.antsrl.springzon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome,categoria;
    @Column
    private double prezzo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id",referencedColumnName = "id")
    private Description description;
}
