package com.antsrl.springzon.service;

import com.antsrl.springzon.entity.Product;
import com.antsrl.springzon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Product getBy(Long id){
        return productRepository.findProductById(id);
    }
    public Product add(Product product){
        return productRepository.save(product);
    }
    public Product update(Product product, Long id){
        if (productRepository.existsById(id)){
            product.setId(id);
            return productRepository.save(product);
        }
        return productRepository.findProductById(id);
    }
    public void delete(Long id){
        Product product = productRepository.findProductById(id);
        productRepository.delete(product);
    }
}
