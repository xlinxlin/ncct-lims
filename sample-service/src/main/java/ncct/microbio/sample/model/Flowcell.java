package ncct.microbio.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "Flowcell")
public class Flowcell {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer flowcellId;

  private String flowcellName;

  private String machine;

  private Double output;

  private Integer cluster;

  @OneToOne(fetch=FetchType.LAZY, mappedBy="flowcell")
  private Sample sample;

  public void setFlowcellId(int flowcellId) {
    this.flowcellId = flowcellId;
  }

  public Integer getFlowcellId() {
    return flowcellId;
  }

  public void setFlowcellName(String flowcellName) {
    this.flowcellName = flowcellName;
  }

  public String getFlowcellName() {
    return flowcellName;
  }

  public void setMachine(String machine) {
    this.machine = machine;
  }

  public String getMachine() {
    return machine;
  }

  public void setOutput(double output) {
    this.output = output;
  }

  public Double getOutput() {
    return output;
  }

  public void setCluster(int cluster) {
    this.cluster = cluster;
  }

  public Integer getCluster() {
    return cluster;
  }
}
