package auca.ac.rw.restfullApiAssignment.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import auca.ac.rw.restfullApiAssignment.modal.ecommerce.Product;
import auca.ac.rw.restfullApiAssignment.service.ProductService;

@RestController
@RequestMapping("/api/products")    
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping(value = "/addProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addNewProduct(@RequestBody Product product) {
        String saveProduct = productService.addNewProduct(product);

        if(saveProduct.equals("Product added successfully")){
            return new ResponseEntity<>(saveProduct, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(saveProduct, HttpStatus.CONFLICT);
        }
    }

    @GetMapping(value = "/allProducts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        
        if(products != null && !products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No products found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/getProduct/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        
        if(product.isPresent()) {
            return new ResponseEntity<>(product.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Product with id " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "/updateProduct/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        String updateProduct = productService.updateProduct(id, product);
        
        if(updateProduct.equals("Product updated successfully")) {
            return new ResponseEntity<>(updateProduct, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(updateProduct, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/deleteProduct/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        String deleteProduct = productService.deleteProduct(id);
        
        if(deleteProduct.equals("Product deleted successfully")) {
            return new ResponseEntity<>(deleteProduct, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(deleteProduct, HttpStatus.NOT_FOUND);
        }
    }
}
