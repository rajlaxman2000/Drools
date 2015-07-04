package com.sample;

import java.math.BigDecimal;

public class ItemCity {
	
	public enum City {
		Chicago, Boston
		}

	public enum Type {
		GROCERIES, MEDICINES, WATCHES, LUXURY_GOODS
		}

	private City purchaseCity;
	private BigDecimal sellPrice;
	private Type typeofItem;
	private BigDecimal localTax;
	
	/**
	 * @return the purchaseCity
	 */
	public City getPurchaseCity() {
		return purchaseCity;
	}
	/**
	 * @param purchaseCity the purchaseCity to set
	 */
	public void setPurchaseCity(City purchaseCity) {
		this.purchaseCity = purchaseCity;
	}
	/**
	 * @return the sellPrice
	 */
	public BigDecimal getSellPrice() {
		return sellPrice;
	}
	/**
	 * @param sellPrice the sellPrice to set
	 */
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	/**
	 * @return the typeofItem
	 */
	public Type getTypeofItem() {
		return typeofItem;
	}
	/**
	 * @param typeofItem the typeofItem to set
	 */
	public void setTypeofItem(Type typeofItem) {
		this.typeofItem = typeofItem;
	}
	/**
	 * @return the localTax
	 */
	public BigDecimal getLocalTax() {
		return localTax;
	}
	/**
	 * @param localTax the localTax to set
	 */
	public void setLocalTax(BigDecimal localTax) {
		this.localTax = localTax;
	}
		
}
