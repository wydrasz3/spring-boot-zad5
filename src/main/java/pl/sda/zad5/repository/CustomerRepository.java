package pl.sda.zad5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zad5.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
