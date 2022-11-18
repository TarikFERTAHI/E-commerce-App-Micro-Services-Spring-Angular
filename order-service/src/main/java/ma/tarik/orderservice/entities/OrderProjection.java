package ma.tarik.orderservice.entities;

import ma.tarik.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullOrder", types = Order.class)
public interface OrderProjection {
    Long getId();

    Date getCreatedAt();

    Long getCustomerID();

    OrderStatus getStatus();

}
