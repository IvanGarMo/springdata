
import com.aprendiendospring.jpa.course.CourseApplication;
import com.aprendiendospring.jpa.course.Product;
import com.aprendiendospring.jpa.course.ProductRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest(classes=CourseApplication.class)
@Slf4j
public class ProductSpTest {
    @Autowired
    private ProductRepository productRepository;
    
    @Test
    public void testFindAll() {
        List<Product> products = productRepository.findAllSP();
        printProducts("testFindAll()", products);
    }
    
    @Test
    public void testFindByPrice() {
        List<Product> products = productRepository.findAllByPriceSP(1000d);
        printProducts("testFindByPrice", products);
    }
    
    @Test
    public void testCountByPrice() {
        int noProducts = productRepository.countProductsByPriceSP(1000d);
        log.info("testCountByPrice()");
        log.info("Cuenta absoluta: "+noProducts);
        log.info("------------------------------");
    }
    
    private void printProducts(String methodName, List<Product> products) {
        log.info(methodName);
        products.forEach(p -> log.info(p.toString()));
        log.info("------------------------");
    }
}
