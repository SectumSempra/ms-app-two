package com.be.apptwo.common.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the job_history database table.
 */
@Entity
@Table(name = "job_history")
@NamedQuery(name = "JobHistory.findAll", query = "SELECT j FROM JobHistory j")
public class JobHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private JobHistoryPK id;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "start_date", insertable = false, updatable = false)
    private Timestamp startDate;

    @Column(name = "job_id")
    private String jobId;

    public JobHistory() {
    }

    public JobHistoryPK getId() {
        return this.id;
    }

    public void setId(JobHistoryPK id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

}
