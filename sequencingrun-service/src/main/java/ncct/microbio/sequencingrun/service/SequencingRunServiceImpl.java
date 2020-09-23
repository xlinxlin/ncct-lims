package ncct.microbio.sequencingrun.service;

import ncct.microbio.sequencingrun.exception.SequencingRunNotFoundException;
import ncct.microbio.sequencingrun.model.SequencingRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ncct.microbio.sequencingrun.repository.SequencingRunRepository;

import java.util.Optional;

@Service
public class SequencingRunServiceImpl implements SequencingRunService {

  @Autowired
  private SequencingRunRepository repository;

  @Override
  public SequencingRun getSequencingRunById(int id) {
    Optional<SequencingRun> sequencingRun = repository.findById(id);
    //System.out.println(new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
    return sequencingRun.orElseThrow(() -> new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
  }
}
