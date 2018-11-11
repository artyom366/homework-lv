package io.fourfinanceit.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LOAN_REQUEST")
public class LoanRequestDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private ClientDO client;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "REQUESTED_SUM")
    private Float requestedSum;

    @Column(name = "DURATION")
    private Integer duration;

    @Column(name = "STATUS")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientDO getClient() {
        return client;
    }

    public void setClient(ClientDO client) {
        this.client = client;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Float getRequestedSum() {
        return requestedSum;
    }

    public void setRequestedSum(Float requestedSum) {
        this.requestedSum = requestedSum;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
