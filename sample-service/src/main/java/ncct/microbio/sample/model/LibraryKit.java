package ncct.microbio.sample.model;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "LibraryKit")
public class LibraryKit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer libraryKitId;

  private String libraryKitName;

  private Integer barcodeKitId;

  /*
  @OneToOne
  @MapsId
  private Sample sample;
  */
  @OneToOne(fetch=FetchType.LAZY, mappedBy="libraryKit")
  private Sample sample;

  public void setLibraryKitId(int libraryKitId) {
    this.libraryKitId = libraryKitId;
  }

  public Integer getLibraryKitId() {
    return libraryKitId;
  }

  public void setLibraryKitName(String libraryKitName) {
    this.libraryKitName = libraryKitName;
  }

  public String getLibraryKitName() {
    return libraryKitName;
  }

  public void setBarcodeKitId(int barcodeKitId) {
    this.barcodeKitId = barcodeKitId;
  }

  public Integer getBarcodeKitId() {
    return barcodeKitId;
  }
}
