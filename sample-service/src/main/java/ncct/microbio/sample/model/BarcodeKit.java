
package ncct.microbio.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "BarcodeKit")
public class BarcodeKit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer barcodeKitId;

  private String barcodeKitName;

  @OneToOne(fetch=FetchType.LAZY, mappedBy="barcodeKit")
  private Sample sample;

  public void setBarcodeKitId(int barcodeKitId) {
    this.barcodeKitId = barcodeKitId;
  }

  public Integer getBarcodeKitId() {
    return barcodeKitId;
  }

  public void setBarcodeKitName(String barcodeKitName) {
    this.barcodeKitName = barcodeKitName;
  }

  public String getBarcodeKitName() {
    return barcodeKitName;
  }
}
