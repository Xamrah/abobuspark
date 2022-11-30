package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Maintenance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepo extends CrudRepository <Maintenance, Long> {
}
