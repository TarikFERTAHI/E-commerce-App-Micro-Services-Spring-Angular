package ma.tarik.orderservice.web;
import ma.tarik.orderservice.entities.Order;
import ma.tarik.orderservice.entities.ProductItem;
import ma.tarik.orderservice.model.Customer;
import ma.tarik.orderservice.model.Product;
import ma.tarik.orderservice.repositories.OrderRepository;
import ma.tarik.orderservice.repositories.ProductItemRepository;
import ma.tarik.orderservice.services.CustomerRestClientService;
import ma.tarik.orderservice.services.InventoryRestClientService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;

    public OrderRestController(OrderRepository orderRepository, ProductItemRepository productItemRepository, CustomerRestClientService customerRestClientService, InventoryRestClientService inventoryRestClientService) {
        this.orderRepository = orderRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClientService = customerRestClientService;
        this.inventoryRestClientService = inventoryRestClientService;
    }
    @GetMapping("/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        Order order=orderRepository.findById(id).get();
        Customer customer=customerRestClientService.customerByID(order.getCustomerID());
        order.setCustomer(customer);
        order.getProductItems().forEach(pi->{
            Product product=inventoryRestClientService.productByID(pi.getProductId());
            pi.setProduct(product);
        });
        return order;
    }
}

