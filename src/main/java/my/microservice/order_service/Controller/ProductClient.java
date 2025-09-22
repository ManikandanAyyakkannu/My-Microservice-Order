package my.microservice.order_service.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service", url = "https://my-microservice-products-git-maniia88-dev.apps.rm1.0a51.p1.openshiftapps.com")
public interface ProductClient {

    @GetMapping("/products")
    List<Map<String, String>> getProducts();

}
