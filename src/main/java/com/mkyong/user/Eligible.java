package com.mkyong.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELIGIBLE")
public class Eligible implements java.io.Serializable {

	private int eligibleId;
	private int cidCardNo;
	private int taxId;
	private int accountNumber;
	private int cardNumber;
	private String title;
	private String customerName;
	private String address0;
	private String address1;
	private String address2;
	private String address3;
	private int zipCode;
	private String campaignCode;
	private String campaignname;
	private String campaignStart;
	private String campaignEnd;
	private String itemCode;
	private String itemname;
	private String smsCode;
	private String subInventory;
	private String deliveryFlag;
	private String vipFlag;
	private String remarks;
	
	public Eligible() {
	}

	public Eligible(int eligibleId, int cidCardNo, int taxId, int accountNumber, int cardNumber, String title,
			String customerName, String address0, String address1, String address2, String address3, int zipCode,
			String campaignCode, String campaignname, String campaignStart, String campaignEnd, String itemCode,
			String itemname, String smsCode, String subInventory, String deliveryFlag, String vipFlag, String remarks) {
		super();
		this.eligibleId = eligibleId;
		this.cidCardNo = cidCardNo;
		this.taxId = taxId;
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.title = title;
		this.customerName = customerName;
		this.address0 = address0;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.zipCode = zipCode;
		this.campaignCode = campaignCode;
		this.campaignname = campaignname;
		this.campaignStart = campaignStart;
		this.campaignEnd = campaignEnd;
		this.itemCode = itemCode;
		this.itemname = itemname;
		this.smsCode = smsCode;
		this.subInventory = subInventory;
		this.deliveryFlag = deliveryFlag;
		this.vipFlag = vipFlag;
		this.remarks = remarks;
	}


	@Id
	@Column(name = "ELIGIBLE_ID")
	public int getEligibleId() {
		return eligibleId;
	}
	public void setEligibleId(int eligibleId) {
		this.eligibleId = eligibleId;
	}

	@Column(name = "CID_CARD_NO")
	public int getCidCardNo() {
		return cidCardNo;
	}
	public void setCidCardNo(int cidCardNo) {
		this.cidCardNo = cidCardNo;
	}
	@Column(name = "TAX_ID")
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	@Column(name = "ACCOUNT_NUMBER")
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Column(name = "CARD_NUMBER")
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "CUSTOMER_NAME")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name = "ADDRESS0")
	public String getAddress0() {
		return address0;
	}
	public void setAddress0(String address0) {
		this.address0 = address0;
	}
	@Column(name = "ADDRESS1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	@Column(name = "ADDRESS2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	@Column(name = "ADDRESS3")
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	@Column(name = "ZIP_CODE")
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Column(name = "CAMPAIGN_CODE")
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	@Column(name = "CAMPAIGN_NAME")
	public String getCampaignname() {
		return campaignname;
	}
	public void setCampaignname(String campaignname) {
		this.campaignname = campaignname;
	}
	@Column(name = "CAMPAIGN_START")
	public String getCampaignStart() {
		return campaignStart;
	}
	public void setCampaignStart(String campaignStart) {
		this.campaignStart = campaignStart;
	}
	@Column(name = "CAMPAIGN_END")
	public String getCampaignEnd() {
		return campaignEnd;
	}
	public void setCampaignEnd(String campaignEnd) {
		this.campaignEnd = campaignEnd;
	}
	@Column(name = "ITEM_CODE")
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	@Column(name = "ITEM_NAME")
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	@Column(name = "SMS_CODE")
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	@Column(name = "SUB_INVENTORY")
	public String getSubInventory() {
		return subInventory;
	}
	public void setSubInventory(String subInventory) {
		this.subInventory = subInventory;
	}
	@Column(name = "DELIVERY_FLAG")
	public String getDeliveryFlag() {
		return deliveryFlag;
	}
	public void setDeliveryFlag(String deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}
	@Column(name = "VIP_FLAG")
	public String getVipFlag() {
		return vipFlag;
	}
	public void setVipFlag(String vipFlag) {
		this.vipFlag = vipFlag;
	}
	@Column(name = "REMARKS")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
