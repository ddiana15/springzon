package com.antsrl.springzon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Description")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
    @OneToOne(mappedBy = "Description")
    private Product product;
}
