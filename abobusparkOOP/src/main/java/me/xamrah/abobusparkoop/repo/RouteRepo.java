package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepo extends CrudRepository<Route, Long> {
}
