package ma.tarik.orderservice.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.tarik.orderservice.enums.OrderStatus;
import ma.tarik.orderservice.model.Customer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private OrderStatus status;
    private Long customerID;
    @Transient
    @JsonProperty
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;


}
