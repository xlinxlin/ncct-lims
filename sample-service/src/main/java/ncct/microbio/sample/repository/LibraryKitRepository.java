package ncct.microbio.sample.repository;

//import ncct.microbio.sample.model.Flowcell;
import ncct.microbio.sample.model.LibraryKit;
//import ncct.microbio.sample.model.Sample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryKitRepository extends CrudRepository<LibraryKit,Integer> {
}
