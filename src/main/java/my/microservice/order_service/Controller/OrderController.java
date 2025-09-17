package my.microservice.order_service.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final ProductClient productClient;

    public OrderController(ProductClient productClient){
        this.productClient = productClient;
    } 

    @GetMapping("/products")
    public List<Map<String, String>> getOrders(){
        List<Map<String,String>> products =  productClient.getProducts();
        return products;
    }
}
