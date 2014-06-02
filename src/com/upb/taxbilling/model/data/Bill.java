package com.upb.taxbilling.model.data;

import java.util.Date;

/**
 * Contains the information of a bill.
 * @author Allan Leon
 * @author Franco Montiel
 */
public class Bill {

	private int nit;
	private String name;
	private int billNumber;
	private int autorizationNumber;
	private Date emissionDate;
	private Double amount;
	private String controlCode;
	private Date limitEmissionDate;
	private Double iceAmount;
	private Double noTaxSaleAmount;
	private int taxpayerNIT;
	private String taxpayerName;

	/**
	 * Constructor with all the parameters of an electronic bill.
	 * @param nit
	 * @param name
	 * @param billNumber
	 * @param autorizationNumber
	 * @param emissionDate
	 * @param amount
	 * @param controlCode
	 * @param limitEmissionDate
	 * @param iceAmount
	 * @param noTaxSaleAmount
	 * @param taxpayerNIT
	 * @param taxpayerName
	 */
	public Bill(int nit, String name, int billNumber, int autorizationNumber,
			Date emissionDate, Double amount, String controlCode,
			Date limitEmissionDate, Double iceAmount, Double noTaxSaleAmount,
			int taxpayerNIT, String taxpayerName) {
		this.nit = nit;
		this.name = name;
		this.billNumber = billNumber;
		this.autorizationNumber = autorizationNumber;
		this.emissionDate = emissionDate;
		this.amount = amount;
		this.controlCode = controlCode;
		this.limitEmissionDate = limitEmissionDate;
		this.iceAmount = iceAmount;
		this.noTaxSaleAmount = noTaxSaleAmount;
		this.taxpayerNIT = taxpayerNIT;
		this.taxpayerName = taxpayerName;
	}

	/**
	 * Constructor without the optional parameters of an electronic bill.
	 * @param nit
	 * @param name
	 * @param billNumber
	 * @param autorizationNumber
	 * @param emissionDate
	 * @param amount
	 * @param controlCode
	 * @param limitEmissionDate
	 * @param taxpayerNIT
	 * @param taxpayerName
	 */
	public Bill(int nit, String name, int billNumber, int autorizationNumber,
			Date emissionDate, Double amount, String controlCode,
			Date limitEmissionDate, int taxpayerNIT, String taxpayerName) {
		this.nit = nit;
		this.name = name;
		this.billNumber = billNumber;
		this.autorizationNumber = autorizationNumber;
		this.emissionDate = emissionDate;
		this.amount = amount;
		this.controlCode = controlCode;
		this.limitEmissionDate = limitEmissionDate;
		this.iceAmount = 0.0;
		this.noTaxSaleAmount = 0.0;
		this.taxpayerNIT = taxpayerNIT;
		this.taxpayerName = taxpayerName;
	}
	
	/**
	 * Constructor with only the parameters of the bills' table.
	 * @param nit
	 * @param billNumber
	 * @param autorizationNumber
	 * @param emissionDate
	 * @param amount
	 * @param controlCode
	 */
	public Bill(int nit, int billNumber, int autorizationNumber,
			Date emissionDate, Double amount, String controlCode) {
		this.nit = nit;
		this.name = "";
		this.billNumber = billNumber;
		this.autorizationNumber = autorizationNumber;
		this.emissionDate = emissionDate;
		this.amount = amount;
		this.controlCode = controlCode;
		this.limitEmissionDate = new Date();
		this.iceAmount = 0.0;
		this.noTaxSaleAmount = 0.0;
		this.taxpayerNIT = 0;
		this.taxpayerName = "";
	}

	/**
	 * @return the nit
	 */
	public int getNit() {
		return nit;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the billNumber
	 */
	public int getBillNumber() {
		return billNumber;
	}

	/**
	 * @return the autorizationNumber
	 */
	public int getAutorizationNumber() {
		return autorizationNumber;
	}

	/**
	 * @return the emissionDate
	 */
	public Date getEmissionDate() {
		return emissionDate;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @return the controlCode
	 */
	public String getControlCode() {
		return controlCode;
	}

	/**
	 * @return the limitEmissionDate
	 */
	public Date getLimitEmissionDate() {
		return limitEmissionDate;
	}

	/**
	 * @return the iceAmount
	 */
	public Double getIceAmount() {
		return iceAmount;
	}

	/**
	 * @return the noTaxSaleAmount
	 */
	public Double getNoTaxSaleAmount() {
		return noTaxSaleAmount;
	}

	/**
	 * @return the taxpayerNIT
	 */
	public int getTaxpayerNIT() {
		return taxpayerNIT;
	}

	/**
	 * @return the taxpayerName
	 */
	public String getTaxpayerName() {
		return taxpayerName;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param billNumber the billNumber to set
	 */
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * @param autorizationNumber the autorizationNumber to set
	 */
	public void setAutorizationNumber(int autorizationNumber) {
		this.autorizationNumber = autorizationNumber;
	}

	/**
	 * @param emissionDate the emissionDate to set
	 */
	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @param controlCode the controlCode to set
	 */
	public void setControlCode(String controlCode) {
		this.controlCode = controlCode;
	}

	/**
	 * @param limitEmissionDate the limitEmissionDate to set
	 */
	public void setLimitEmissionDate(Date limitEmissionDate) {
		this.limitEmissionDate = limitEmissionDate;
	}

	/**
	 * @param iceAmount the iceAmount to set
	 */
	public void setIceAmount(Double iceAmount) {
		this.iceAmount = iceAmount;
	}

	/**
	 * @param noTaxSaleAmount the noTaxSaleAmount to set
	 */
	public void setNoTaxSaleAmount(Double noTaxSaleAmount) {
		this.noTaxSaleAmount = noTaxSaleAmount;
	}

	/**
	 * @param taxpayerNIT the taxpayerNIT to set
	 */
	public void setTaxpayerNIT(int taxpayerNIT) {
		this.taxpayerNIT = taxpayerNIT;
	}

	/**
	 * @param taxpayerName the taxpayerName to set
	 */
	public void setTaxpayerName(String taxpayerName) {
		this.taxpayerName = taxpayerName;
	}
}