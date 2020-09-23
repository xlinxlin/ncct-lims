package ncct.microbio.sequencingrun.repository;

import ncct.microbio.sequencingrun.model.SequencingRun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequencingRunRepository extends CrudRepository<SequencingRun,Integer> {

}
