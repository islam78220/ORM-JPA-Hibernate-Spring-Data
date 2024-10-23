package ma.mundia.university.web;
import java.util.List;

import ma.mundia.university.entities.Product;
import ma.mundia.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> products() {
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }

}