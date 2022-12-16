package com.antsrl.springzon.repository;

import com.antsrl.springzon.entity.Shoppingcart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ShoppingcartRepository extends JpaRepository<Shoppingcart, Long> {
    public Shoppingcart findShoppingcartById(Long id);
   // @Query("insert into shop_product OPEN (?1, ?1)")
   // public void insert(Long prodid, Long cartid);

    @Modifying
    @Query(value = "insert into shop_product VALUES (:product_id,:shoppingcart_id)", nativeQuery = true)
    @Transactional
    void insert(@Param("product_id") Long product_id, @Param("shoppingcart_id") Long shoppingcart_id);
    @Modifying
    @Query(value = "delete from shop_product where shoppingcart_id=:product_id and product_id=:shoppingcart_id", nativeQuery = true)
    @Transactional
    void remove(@Param("product_id") Long product_id, @Param("shoppingcart_id") Long shoppingcart_id);

}
