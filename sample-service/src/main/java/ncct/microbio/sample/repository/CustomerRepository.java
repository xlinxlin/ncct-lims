package ncct.microbio.sample.repository;

import ncct.microbio.sample.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
