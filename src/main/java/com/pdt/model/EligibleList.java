package com.pdt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ELIGIBLE_LIST")
public class EligibleList {
	private String fileName;
	private Date uploadDate;
	private String recordAmount;
	
	@Id
	@Column(name = "FILE_NAME")
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "UPLOAD_DATE")
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	@Column(name = "RECORD_AMOUNT")
	public String getRecordAmount() {
		return recordAmount;
	}
	public void setRecordAmount(String recordAmount) {
		this.recordAmount = recordAmount;
	}
}
