package me.xamrah.abobusparkoop.repo;

import me.xamrah.abobusparkoop.domain.Shift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepo extends CrudRepository<Shift, Long> {
}
