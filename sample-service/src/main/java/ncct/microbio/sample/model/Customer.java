package ncct.microbio.sample.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="pk_customer_id")
  private Integer pkCustomerId;

  @Column(name="institute")
  private String institute;

  @Column(name="department")
  private String department;

  @Column(name="address")
  private String address;

  @Column(name="zip_code")
  private String zipCode;

  @Column(name="city")
  private String city;

  @Column(name="country")
  private String country;

  @Column(name="name_of_head")
  private String nameOfHead;

  @Column(name="name")
  private String name;

  @Column(name="email")
  private String email;

  @Column(name="phone")
  private String phone;

  @Column(name="name_of_project")
  private String nameOfProject;

  @Column(name="dfg_proposal")
  private Integer dfgProposal;

  @Column(name="qbic_project_code")
  private String qbicProjectCode;


  /*
  public List<SampleReceipt> getSampleReceipts() {
    return sampleReceipts;
  }

  public void setSampleReceipts(List<SampleReceipt> sampleReceipts) {
    this.sampleReceipts = sampleReceipts;
  }
   */

  public Set<SampleReceipt> getSampleReceipts() {
    return sampleReceipts;
  }

  public void setSampleReceipts(Set<SampleReceipt> sampleReceipts) {
    this.sampleReceipts = sampleReceipts;
  }

  //@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL,orphanRemoval = true)
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true)
  @JoinColumn(name="fk_customer_id",referencedColumnName = "pk_customer_id",nullable=false, updatable=false,insertable=false)
  @JsonManagedReference
  //@OneToMany(fetch = FetchType.EAGER)
  //@JoinColumn(name="fk_customer_id")
  //private List<SampleReceipt> sampleReceipts = new ArrayList<SampleReceipt>();
  private Set<SampleReceipt> sampleReceipts = new HashSet<SampleReceipt>();


  public Integer getPkCustomerId() {
    return pkCustomerId;
  }

  public void setPkCustomerId(Integer pkCustomerId) {
    this.pkCustomerId = pkCustomerId;
  }

  public String getInstitute() {
    return institute;
  }

  public void setInstitute(String institute) {
    this.institute = institute;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getNameOfHead() {
    return nameOfHead;
  }

  public void setNameOfHead(String nameOfHead) {
    this.nameOfHead = nameOfHead;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getNameOfProject() {
    return nameOfProject;
  }

  public void setNameOfProject(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }

  public Integer getDfgProposal() {
    return dfgProposal;
  }

  public void setDfgProposal(Integer dfgProposal) {
    this.dfgProposal = dfgProposal;
  }

  public String getQbicProjectCode() {
    return qbicProjectCode;
  }

  public void setQbicProjectCode(String qbicProjectCode) {
    this.qbicProjectCode = qbicProjectCode;
  }
}
