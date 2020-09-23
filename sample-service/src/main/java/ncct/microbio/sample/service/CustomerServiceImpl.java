package ncct.microbio.sample.service;

import com.google.common.collect.Lists;
import ncct.microbio.sample.exception.SampleNotFoundException;
import ncct.microbio.sample.model.Customer;
import ncct.microbio.sample.model.SampleReceipt;
import ncct.microbio.sample.repository.CustomerRepository;
import ncct.microbio.sample.repository.SampleReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerRepository repository;

  public List<Customer> getAllCustomers() {
    return Lists.newArrayList(repository.findAll());
  }

  @Override
  public Customer getCustomerById(int id) {
    Optional<Customer> customer = repository.findById(id);
    //System.out.println(new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
    return customer.orElseThrow(() -> new SampleNotFoundException("Customer id " + id + " not found."));
  }
}
