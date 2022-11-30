package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {
}
