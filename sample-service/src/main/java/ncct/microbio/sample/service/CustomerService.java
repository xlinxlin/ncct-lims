package ncct.microbio.sample.service;

import ncct.microbio.sample.model.Customer;
import ncct.microbio.sample.model.LibraryKit;
import ncct.microbio.sample.model.SampleReceipt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
  public abstract Customer getCustomerById(int id);

  public abstract List<Customer> getAllCustomers();


}
