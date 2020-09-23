package ncct.microbio.sequencingrun.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SequencingRunNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public SequencingRunNotFoundException(String exception) {
    super(exception);
  }
}
