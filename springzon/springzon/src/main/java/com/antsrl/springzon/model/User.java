package com.antsrl.springzon.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nickname;
    
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "shopping_cart_id", nullable = false, unique = true, referencedColumnName = "id")
   // @JsonManagedReference
    private ShoppingCart cart;
    
}
