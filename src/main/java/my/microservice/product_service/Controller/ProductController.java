package my.microservice.product_service.Controller;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{

    @GetMapping("/products")
    public List<Map<String, String>> getProducts(){
        return List.of(
            Map.of("id","1","name","Laptop","price","50000"),
            Map.of("id","2","name","Smartphone","price","30000")
        );
    }

}