package ncct.microbio.sample.repository;

import ncct.microbio.sample.model.SampleReceipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
//@CrossOrigin(origins = "http://localhost:4200")
public interface SampleReceiptRepository extends CrudRepository<SampleReceipt,Integer> {

}
