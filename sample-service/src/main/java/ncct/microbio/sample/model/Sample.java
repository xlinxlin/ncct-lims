package ncct.microbio.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "Sample")
public class Sample {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="sample_id")
  private Integer sampleId;

  @Column(name="ont_barcode")
  private String ontBarcode;

  @Column(name="ext_barcode")
  private String extBarcode;

  @Column(name="qbic_barcode")
  private String qbicBarcode;

  /*
  @Column(name="flowcell_id")
  private Integer flowcellId;
  */

  /*
  @Column(name="barcode_kit_id")
  private Integer barcodeKitId;
  */

  /*
  @Column(name="library_kit_id")
  private Integer libraryKitId;
  */
  /*
  @OneToOne(mappedBy = "sample", cascade = CascadeType.ALL)
  private LibraryKit libraryKit;
   */

  @OneToOne()
  @JoinColumn(name="library_kit_id")
  private LibraryKit libraryKit;

  @OneToOne()
  @JoinColumn(name="barcode_kit_id")
  private BarcodeKit barcodeKit;

  @OneToOne()
  @JoinColumn(name="flowcell_id")
  private Flowcell flowcell;

  @Column(name="sample_name")
  private String sampleName;

  public void setSampleId(int sampleId) {
    this.sampleId = sampleId;
  }

  public Integer getSampleId() {
    return sampleId;
  }

  public void setOntBarcode(String ontBarcode) {
    this.ontBarcode = ontBarcode;
  }

  public String getOntBarcode() {
    return ontBarcode;
  }

  public void setExtBarcode(String extBarcode) {
    this.extBarcode = extBarcode;
  }

  public String getExtBarcode() {
    return extBarcode;
  }

  public void setQbicBarcode(String qbicBarcode) {
    this.qbicBarcode = qbicBarcode;
  }

  public String getQbicBarcode() {
    return qbicBarcode;
  }

  /*
  public void setFlowcellId(int flowcellId) {
    this.flowcellId = flowcellId;
  }

  public Integer getFlowcellId() {
    return flowcellId;
  }
  */

  /*
  public void setLibraryKitId(int libraryKitId) {
    this.libraryKitId = libraryKitId;
  }

  public Integer getLibraryKitId() {
    return libraryKitId;
  }
  */

  /*
  public void setBarcodeKitId(int barcodeKitId) {
    this.barcodeKitId = barcodeKitId;
  }

  public Integer getBarcodeKitId() {
    return barcodeKitId;
  }
  */

  public void setSampleName(String sampleName) {
    this.sampleName = sampleName;
  }

  public String getSampleName() {
    return sampleName;
  }

  public void setLibraryKit(LibraryKit libraryKit){
    this.libraryKit = libraryKit;
  }

  public LibraryKit getLibraryKit() {
    return libraryKit;
  }

  public void setBarcodeKit(BarcodeKit barcodeKit){
    this.barcodeKit = barcodeKit;
  }

  public BarcodeKit getBarcodeKit() {
    return barcodeKit;
  }

  public void setFlowcell(Flowcell flowcell){
    this.flowcell = flowcell;
  }

  public Flowcell getFlowcell() {
    return flowcell;
  }

  /*
  public Sample(String sampleName, String libraryKitName){
    this.sampleName = sampleName;
    this.libraryKitName = libraryKit.getLibraryKitName();
  }
  */
}

