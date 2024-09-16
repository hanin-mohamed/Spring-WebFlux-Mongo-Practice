package com.springwebfluxmongo.product.service;
import com.springwebfluxmongo.product.entity.Product;
import com.springwebfluxmongo.product.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
    public Mono<Product> findById(Long id){
        return productRepo.findById(id);
    }
    public Flux<Product>findAll(){
        return productRepo.findAll();
    }
    public Flux<Product>findByName(String name){
        return productRepo.findByName(name);
    }
    public Mono<Product> insert(Product product){
        return productRepo.insert(product);
    }
    public Mono<Product> update(Product product){
        return productRepo.save(product);
    }
    public Mono<Void> delete(Long id){
        return productRepo.deleteById(id);
    }
}
