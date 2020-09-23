package ncct.microbio.sequencingrun.service;

import ncct.microbio.sequencingrun.model.SequencingRun;
import org.springframework.stereotype.Service;

@Service
public interface SequencingRunService {

  //public abstract SequencingRun addFeature(SequencingRun sequencingRun);

  public abstract SequencingRun getSequencingRunById(int id);

  //public abstract SequencingRun getFeatureByName(String name);

  //public abstract List<Feature> getFeatures();

  //public abstract Feature deleteFeatureById(int id);

  //public abstract Feature updateFeature(int id, Feature feature);

  //public abstract List<Feature> getFeaturesByNameMatch(String name);
}
