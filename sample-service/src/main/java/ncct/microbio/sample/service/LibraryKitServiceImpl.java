package ncct.microbio.sample.service;

import ncct.microbio.sample.exception.SampleNotFoundException;
//import ncct.microbio.sample.model.Flowcell;
import ncct.microbio.sample.model.LibraryKit;
//import ncct.microbio.sample.model.Sample;
import ncct.microbio.sample.repository.LibraryKitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryKitServiceImpl implements LibraryKitService {

  @Autowired
  private LibraryKitRepository repository;

  @Override
  public LibraryKit getLibraryKitById(int id) {
    Optional<LibraryKit> libraryKit = repository.findById(id);
    //System.out.println(new SequencingRunNotFoundException("Sequencing run id " + id + " not found."));
    return libraryKit.orElseThrow(() -> new SampleNotFoundException("Library Kit id " + id + " not found."));
  }
}
