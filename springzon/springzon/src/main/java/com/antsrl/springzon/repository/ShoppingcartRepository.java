package com.antsrl.springzon.repository;

import com.antsrl.springzon.entity.Shoppingcart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingcartRepository extends JpaRepository<Shoppingcart, Long> {
    public Shoppingcart findShoppingcartById(Long id);
}
