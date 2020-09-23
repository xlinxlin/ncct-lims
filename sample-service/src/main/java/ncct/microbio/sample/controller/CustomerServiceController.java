package ncct.microbio.sample.controller;

import ncct.microbio.sample.model.Customer;
import ncct.microbio.sample.model.SampleReceipt;
import ncct.microbio.sample.service.CustomerServiceImpl;
import ncct.microbio.sample.service.SampleReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerServiceController {
  @Autowired
  private CustomerServiceImpl service;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Customer getCustomerById (@PathVariable int id){
    return service.getCustomerById(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Customer> getAllCustomers() {
    //System.out.println("test");

    //System.out.println(service.getAllSampleReceipts().get(0).toString());
    return service.getAllCustomers();
  }
}
