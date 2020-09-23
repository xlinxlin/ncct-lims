package ncct.microbio.sample.service;

import com.google.common.collect.Lists;
import ncct.microbio.sample.exception.SampleNotFoundException;
import ncct.microbio.sample.model.LibraryKit;
import ncct.microbio.sample.model.SampleReceipt;
import ncct.microbio.sample.repository.LibraryKitRepository;
import ncct.microbio.sample.repository.SampleReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleReceiptServiceImpl implements SampleReceiptService {
  @Autowired
  private SampleReceiptRepository repository;

  @Override
  public SampleReceipt getSampleReceiptById(int id) {
    Optional<SampleReceipt> sampleReceipt = repository.findById(id);
    //System.out.println(new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
    return sampleReceipt.orElseThrow(() -> new SampleNotFoundException("Sample receipt id " + id + " not found."));
  }

  @Override
  public List<SampleReceipt> getAllSampleReceipts(){
    return Lists.newArrayList(repository.findAll());
  }
}
