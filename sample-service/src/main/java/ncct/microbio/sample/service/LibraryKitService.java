package ncct.microbio.sample.service;

//import ncct.microbio.sample.model.Flowcell;
import ncct.microbio.sample.model.LibraryKit;
//import ncct.microbio.sample.model.Sample;
import org.springframework.stereotype.Service;

@Service
public interface LibraryKitService {
  public abstract LibraryKit getLibraryKitById(int id);
}
