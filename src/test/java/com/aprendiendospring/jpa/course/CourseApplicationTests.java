package com.aprendiendospring.jpa.course;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CourseApplicationTests {
    @Autowired
    ProductRepository repo;
    
	@Test
	void contextLoads() {
	}

        @Test
        void anadeProducto() {
            Product p = new Product();
            p.setId(1);
            p.setName("Xbox One");
            p.setDescription("Para que juegues con amigos, ya sea online o pantalla dividida");
            p.setPrice(7999.99d);
            repo.save(p);
        }
        
        @Test
        void encuentraProducto() {
            Optional<Product> optProduct = repo.findById(1);
            if(optProduct.isPresent()) {
                assertNotNull(optProduct);
                assertEquals("Xbox One", optProduct.get().getName());
            }
        }
        
        @Test
        void updateProducto() {
            Product p = repo.findById(1).get();
            p.setPrice(9500d);
            repo.save(p);
        }
        
//        @Test
//        void deleteProduct() {
//            repo.deleteById(1);
//        }
        
        @Test
        void pruebaCuenta() {
            log.info("Cuenta de productos: "+repo.count());
        }
}
