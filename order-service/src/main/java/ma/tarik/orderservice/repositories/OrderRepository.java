package ma.tarik.orderservice.repositories;

import ma.tarik.orderservice.entities.Order;
import ma.tarik.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {
    @RestResource(path = "/byCustomerID")
    List<Order> findByCustomerID(@Param("customerID") Long customerID);
}
