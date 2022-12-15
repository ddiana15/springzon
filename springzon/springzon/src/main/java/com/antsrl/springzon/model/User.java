package com.antsrl.springzon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nickname;
    
    @OneToOne//(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
    private ShoppingCart cart;
    
}
