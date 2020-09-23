package ncct.microbio.sample.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SampleReceipt")
public class SampleReceipt implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="pk_sample_id")
  private Integer pkSampleId;

  @Column(name="qbic_barcode")
  private String qbicBarcode;

  @Column(name="secondary_name")
  private String secondaryName;

  @Column(name="sample_name")
  private String sampleName;

  @Column(name="sample_grouping")
  private String sampleGrouping;

  @Column(name="sample_source")
  private String sampleSource;

  @Column(name="sample_tissue")
  private String sampleTissue;

  @Column(name="condition_tag1")
  private String conditionTag1;

  @Column(name="condition_tag2")
  private String conditionTag2;

  @Column(name="analyte")
  private String analyte;

  @Column(name="elution_buffer")
  private String elutionBuffer;

  @Column(name="sample_volume")
  private Integer sampleVolume;

  @Column(name="purity")
  private Double purity;

  @Column(name="concentration")
  private Double concentration;

  @Column(name="total_volume")
  private Double totalVolume;

  @Column(name="method")
  private String method;

  @Column(name="rin_din")
  private Double rinDin;

  @Column(name="comment")
  private String comment;

  @Column(name="comment_mibi")
  private String commentMibi;

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /*
    @Column(name="fk_customer_id")
    private Integer fkCustomerId;
    */
  //@JsonProperty("fk_customer_id")
  //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "pk_customer_id")
  //@JsonIdentityReference(alwaysAsId = true)
  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=false)
  @JoinColumn(name="fk_customer_id",referencedColumnName = "pk_customer_id",nullable=false, updatable=false,insertable=false)
  @JsonBackReference
  private Customer customer;
  /*
  Infinite Recursion with Jackson JSON and Hibernate JPA issue
  https://stackoverflow.com/questions/3325387/infinite-recursion-with-jackson-json-and-hibernate-jpa-issue
   */


  @Column(name="plate_position")
  private String platePostion;

  public String getPlatePostion() {
    return platePostion;
  }

  public void setPlatePostion(String platePostion) {
    this.platePostion = platePostion;
  }

  public String getPlateTitle() {
    return plateTitle;
  }

  public void setPlateTitle(String plateTitle) {
    this.plateTitle = plateTitle;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Column(name="plate_title")
  private String plateTitle;

  @Column(name="total_amount")
  private Double totalAmount;

  public Integer getPkSampleId() {
    return pkSampleId;
  }

  public void setPkSampleId(Integer pkSampleId) {
    this.pkSampleId = pkSampleId;
  }

  public String getQbicBarcode() {
    return qbicBarcode;
  }

  public void setQbicBarcode(String qbicBarcode) {
    this.qbicBarcode = qbicBarcode;
  }

  public String getSampleGrouping() {
    return sampleGrouping;
  }

  public void setSampleGrouping(String sampleGrouping) {
    this.sampleGrouping = sampleGrouping;
  }

  public String getSampleSource() {
    return sampleSource;
  }

  public void setSampleSource(String sampleSource) {
    this.sampleSource = sampleSource;
  }

  public String getSampleTissue() {
    return sampleTissue;
  }

  public void setSampleTissue(String sampleTissue) {
    this.sampleTissue = sampleTissue;
  }

  public String getConditionTag1() {
    return conditionTag1;
  }

  public void setConditionTag1(String conditionTag1) {
    this.conditionTag1 = conditionTag1;
  }

  public String getConditionTag2() {
    return conditionTag2;
  }

  public void setConditionTag2(String conditionTag2) {
    this.conditionTag2 = conditionTag2;
  }

  public String getAnalyte() {
    return analyte;
  }

  public void setAnalyte(String analyte) {
    this.analyte = analyte;
  }

  public String getElutionBuffer() {
    return elutionBuffer;
  }

  public void setElutionBuffer(String elutionBuffer) {
    this.elutionBuffer = elutionBuffer;
  }

  public Integer getSampleVolume() {
    return sampleVolume;
  }

  public void setSampleVolume(Integer sampleVolume) {
    this.sampleVolume = sampleVolume;
  }

  public Double getPurity() {
    return purity;
  }

  public void setPurity(Double purity) {
    this.purity = purity;
  }

  public Double getConcentration() {
    return concentration;
  }

  public void setConcentration(Double concentration) {
    this.concentration = concentration;
  }

  public Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Double getRinDin() {
    return rinDin;
  }

  public void setRinDin(Double rinDin) {
    this.rinDin = rinDin;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getCommentMibi() {
    return commentMibi;
  }

  public void setCommentMibi(String commentMibi) {
    this.commentMibi = commentMibi;
  }

  /*
  public Integer getFkCustomerId() {
    return fkCustomerId;
  }

  public void setFkCustomerId(Integer fkCustomerId) {
    this.fkCustomerId = fkCustomerId;
  }
   */

  public String getSecondaryName() {
    return secondaryName;
  }

  public void setSecondaryName(String secondaryName) {
    this.secondaryName = secondaryName;
  }

  public String getSampleName() {
    return sampleName;
  }

  public void setSampleName(String sampleName) {
    this.sampleName = sampleName;
  }
}
