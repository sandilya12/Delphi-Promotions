package com.promotions.delphi.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Client {
	

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "client_clinetId_seq")
    @SequenceGenerator(name = "client_clinetId_seq", sequenceName = "client_clinetId_seq", allocationSize=1)
    @Column(name = "clientId", updatable=false)
	Long clinetId;
	
    @Column(name = "clientName")
	String clientName;
	
    @Column(name = "clientDesc")
	String clientDesc;
	
    @Column(name = "Point_of_contact")
	String pointOfContact;
	
    @Column(name = "poc_email")
	String pocEmail;
    
    @Column(name = "poc_phoneNo")
	String pocPhoneNo;
    
    @Column(name = "client_address")
	String clientAddress;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Employee accountManager;
    
	public Long getClinetId() {
		return clinetId;
	}

	public void setClinetId(Long clinetId) {
		this.clinetId = clinetId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDesc() {
		return clientDesc;
	}

	public void setClientDesc(String clientDesc) {
		this.clientDesc = clientDesc;
	}

	public String getPointOfContact() {
		return pointOfContact;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	public String getPocEmail() {
		return pocEmail;
	}

	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}

	public String getPocPhoneNo() {
		return pocPhoneNo;
	}

	public void setPocPhoneNo(String pocPhoneNo) {
		this.pocPhoneNo = pocPhoneNo;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public Employee getAccountManager() {
		return accountManager;
	}

	public void setAccountManager(Employee accountManager) {
		this.accountManager = accountManager;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [clinetId=");
		builder.append(clinetId);
		builder.append(", clientName=");
		builder.append(clientName);
		builder.append(", clientDesc=");
		builder.append(clientDesc);
		builder.append(", pointOfContact=");
		builder.append(pointOfContact);
		builder.append(", pocEmail=");
		builder.append(pocEmail);
		builder.append(", pocPhoneNo=");
		builder.append(pocPhoneNo);
		builder.append(", clientAddress=");
		builder.append(clientAddress);
		builder.append(", accountManager=");
		builder.append(accountManager);
		builder.append("]");
		return builder.toString();
	}
    
}
