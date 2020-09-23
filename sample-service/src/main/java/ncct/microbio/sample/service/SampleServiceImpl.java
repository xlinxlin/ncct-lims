package ncct.microbio.sample.service;

import ncct.microbio.sample.exception.SampleNotFoundException;
import ncct.microbio.sample.model.LibraryKit;
import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.repository.LibraryKitRepository;
import ncct.microbio.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleServiceImpl implements SampleService {

  @Autowired
  private SampleRepository repository;

  @Override
  public Sample getSampleById(int id) {
    Optional<Sample> sample = repository.findById(id);
    //System.out.println(new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
    return sample.orElseThrow(() -> new SampleNotFoundException("Sample id " + id + " not found."));
  }

  @Override
  public List<Sample> getSamplesByLibraryKitId(int id) {
    List<Sample> samples = repository.findByLibraryKit_LibraryKitId(id);
    System.out.println(samples.get(0).getLibraryKit().getLibraryKitName());
    return samples;
  }
}
