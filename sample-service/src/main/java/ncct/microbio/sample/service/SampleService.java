package ncct.microbio.sample.service;

import ncct.microbio.sample.model.LibraryKit;
import ncct.microbio.sample.model.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {

  public abstract Sample getSampleById(int id);

  public abstract List<Sample> getSamplesByLibraryKitId(int id);
}
