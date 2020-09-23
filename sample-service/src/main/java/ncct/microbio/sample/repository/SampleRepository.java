package ncct.microbio.sample.repository;

import ncct.microbio.sample.model.Sample;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends CrudRepository<Sample,Integer> {

  //@Query(value="select * from sample inner join library_kit on sample.library_kit_id = library_kit.library_kit_id where sample.library_kit_id = ?1", nativeQuery = true)
  //@Query("SELECT s, l FROM Sample s INNER JOIN c1.neighbors c2\n")
  public List<Sample> findByLibraryKit_LibraryKitId(Integer id);

}
