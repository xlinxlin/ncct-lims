package ncct.microbio.sample.controller;

//import ncct.microbio.sample.model.Flowcell;
import ncct.microbio.sample.model.LibraryKit;
//import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.service.LibraryKitServiceImpl;
import ncct.microbio.sample.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/librarykits")
public class LibraryKitServiceController {

  @Autowired
  private LibraryKitServiceImpl service;

  /*
  @Autowired
  private SampleServiceImpl sampleService;
  */

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public LibraryKit getFlowcellById (@PathVariable int id) {
    //return service.getFeatureById(id);
    //System.out.println(service.getSequencingRunById(id));
    return service.getLibraryKitById(id);
  }

  /*
  @RequestMapping(value = "/samples/{id}", method = RequestMethod.GET)
  public Sample getSampleById (@PathVariable int id){
    return sampleService.getSampleById(id);
  }
  */
}
