package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepo extends CrudRepository<Bus, Long> {
}
