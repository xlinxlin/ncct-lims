package ncct.microbio.sequencingrun.controller;

import ncct.microbio.sequencingrun.exception.SequencingRunNotFoundException;
import ncct.microbio.sequencingrun.model.SequencingRun;
import ncct.microbio.sequencingrun.service.SequencingRunServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sequencingruns")
public class SequencingRunServiceController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @Autowired
  private SequencingRunServiceImpl service;

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public void test (){
    System.out.println("hi");
    List<ServiceInstance> instances = discoveryClient.getInstances("configserver");
    System.out.println(instances.get(0).getUri().toString());
  }


  //System.out.println("hello world");
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public SequencingRun getSequencingRunById (@PathVariable int id) {
    //return service.getFeatureById(id);
    //System.out.println(service.getSequencingRunById(id));
    return service.getSequencingRunById(id);
  }
}
