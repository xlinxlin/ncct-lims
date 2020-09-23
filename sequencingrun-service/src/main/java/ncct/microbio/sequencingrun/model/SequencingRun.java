package ncct.microbio.sequencingrun.model;

import javax.persistence.*;

@Entity
@Table(name = "SequencingRun")
public class SequencingRun {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String runNumber;
  private String project;
  private String barcode;
  private String seqProtocol;
  private String runDate;
  private String machine;
  private String flowcell;
  private Integer clusters;
  private Integer obtainedClusters;
  private Double output;
  private Double obtainedOutput;
  private Double pf;
  private String runFolder;
  private String sampleBarcodeMap;
  private Double clusterDensity;
  private Double phix;
  private Double inputMolarity;
  private String remarks;

  public void setId(int id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setRunNumber(String runNumber) {
    this.runNumber = runNumber;
  }

  public String getRunNumber() {
    return runNumber;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public String getProject() {
    return project;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setSeqProtocol(String seqProtocol) {
    this.seqProtocol = seqProtocol;
  }

  public String getSeqProtocol() {
    return seqProtocol;
  }

  public void setRunDate(String runDate) {
    this.runDate = runDate;
  }

  public String getRunDate() {
    return runDate;
  }

  public void setMachine(String machine) {
    this.machine = machine;
  }

  public String getMachine() {
    return machine;
  }

  public void setFlowcell(String flowcell) {
    this.flowcell = flowcell;
  }

  public String getFlowcell() {
    return flowcell;
  }

  public void setClusters(int cluster) {
    this.clusters = cluster;
  }

  public Integer getClusters() {
    return clusters;
  }

  public void setObtainedClusters(int obtainedClusters) {
    this.obtainedClusters = obtainedClusters;
  }

  public Integer getObtainedClusters() {
    return obtainedClusters;
  }

  public void setOutput(Double output) {
    this.output = output;
  }

  public Double getOutput() {
    return output;
  }

  public void setObtainedOutput(Double obtainedOutput) {
    this.obtainedOutput = obtainedOutput;
  }

  public Double getObtainedOutput() {
    return obtainedOutput;
  }

  public void setPf(Double pf) {
    this.pf = pf;
  }

  public Double getPf() {
    return pf;
  }

  public void setRunFolder(String runFolder) {
    this.runFolder = runFolder;
  }

  public String getRunFolder() {
    return runFolder;
  }

  public void setSampleBarcodeMap(String sampleBarcodeMap) {
    this.sampleBarcodeMap = sampleBarcodeMap;
  }

  public String getSampleBarcodeMap() {
    return sampleBarcodeMap;
  }

  public void setClusterDensity(Double clusterDensity) {
    this.clusterDensity = clusterDensity;
  }

  public Double getClusterDensity() {
    return clusterDensity;
  }

  public void setPhix(Double phix) {
    this.phix = phix;
  }

  public Double getPhix() {
    return phix;
  }

  public void setInputMolarity(Double inputMolarity) {
    this.inputMolarity = inputMolarity;
  }

  public Double getInputMolarity() {
    return inputMolarity;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getRemarks() {
    return remarks;
  }
}
