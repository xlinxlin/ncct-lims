package ncct.microbio.sample.controller;

import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.model.SampleReceipt;
import ncct.microbio.sample.service.SampleReceiptServiceImpl;
import ncct.microbio.sample.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/samplereceipts")
public class SampleReceiptServiceController {

  @Autowired
  private SampleReceiptServiceImpl service;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public SampleReceipt getSampleReceiptById (@PathVariable int id){
    //System.out.println(service.getSampleReceiptById(id).getCustomer().getCity());
    return service.getSampleReceiptById(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<SampleReceipt> getAllSampleReceipts() {
    //System.out.println("test");

    //System.out.println(service.getAllSampleReceipts().get(0).toString());
    return service.getAllSampleReceipts();
  }

  /*
  @RequestMapping(value = "/librarykits/{id}", method = RequestMethod.GET)
  public List<Sample> getSamplesByLibraryKitId(@PathVariable int id){
    return sampleService.getSamplesByLibraryKitId(id);
  }
  */
}
