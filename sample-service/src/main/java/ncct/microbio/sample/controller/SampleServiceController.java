package ncct.microbio.sample.controller;

import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/samples")
public class SampleServiceController {
  @Autowired
  private SampleServiceImpl sampleService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Sample getSampleById (@PathVariable int id){
    return sampleService.getSampleById(id);
  }

  @RequestMapping(value = "/librarykits/{id}", method = RequestMethod.GET)
  public List<Sample> getSamplesByLibraryKitId(@PathVariable int id){
     return sampleService.getSamplesByLibraryKitId(id);
  }
}
