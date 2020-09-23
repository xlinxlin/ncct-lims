package ncct.microbio.sample.service;

import ncct.microbio.sample.model.LibraryKit;
import ncct.microbio.sample.model.SampleReceipt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleReceiptService {
  public abstract SampleReceipt getSampleReceiptById(int id);

  public abstract List<SampleReceipt> getAllSampleReceipts();

}
