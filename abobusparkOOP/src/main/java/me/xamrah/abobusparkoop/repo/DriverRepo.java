package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends CrudRepository <Driver, Long> {
}
