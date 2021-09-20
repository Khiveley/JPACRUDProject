package com.skilldistillery.jpacrud.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sellerlistings")
public class SellerListings {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private String condition;
	@Column(name="condition_description")
	private String conditionDescription;
	@Column(name="card_number")
	private String cardNumber;
	private String series;
	@Column(name="image_url")
	private String imageUrl;
//	private int grade;
//	@Column(name="professional_grading_company")
//	private String professionalGradingCompany;
	private String rarity;
//	private String manufacturer;
//	@Column(name="year_manufactured")
//	private String yearManufactured;
//	@Column(name="ebay_comparable")
//	private Double ebayComparable;
//	@Column(name="mavin_estimated_value")
//	private Double mavinEstimatedValue;
//	@Column(name="game_series")
//	private String gameSeries;
	
//	@Column(name="create_date")
//	private LocalDateTime createDate;
//	@Column(name="last_modified_date")
//	private LocalDateTime lastModifiedDate;
//	private String language;
//	private Double price;
//	@Column(name="for_trade")
//	private String forTrade;
//	@Column(name="trade_for")
//	private String tradeFor;
	
	public SellerListings() {
	}
	
	
	
	
	public SellerListings(int id, String name, String type, String condition, String conditionDescription,
			String cardNumber, String series, String imageUrl, String rarity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.condition = condition;
		this.conditionDescription = conditionDescription;
		this.cardNumber = cardNumber;
		this.series = series;
		this.imageUrl = imageUrl;
		this.rarity = rarity;
	}




	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getConditionDescription() {
		return conditionDescription;
	}
	public void setConditionDescription(String conditionDescription) {
		this.conditionDescription = conditionDescription;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getImageUrl() {
	return imageUrl;
}
//	public int getGrade() {
//		return grade;
//	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	public String getProfessionalGradingCompany() {
//		return professionalGradingCompany;
//	}
//	public void setProfessionalGradingCompany(String professionalGradingCompany) {
//		this.professionalGradingCompany = professionalGradingCompany;
//	}
	public String getRarity() {
		return rarity;
}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
//	public String getManufacturer() {
//		return manufacturer;
//	}
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//	public String getYearManufactured() {
//		return yearManufactured;
//	}
//	public void setYearManufactured(String yearManufactured) {
//		this.yearManufactured = yearManufactured;
//	}
//	public Double getEbayComparable() {
//		return ebayComparable;
//	}
//	public void setEbayComparable(Double ebayComparable) {
//		this.ebayComparable = ebayComparable;
//	}
//	public Double getMavinEstimatedValue() {
//		return mavinEstimatedValue;
//	}
//	public void setMavinEstimatedValue(Double mavinEstimatedValue) {
//		this.mavinEstimatedValue = mavinEstimatedValue;
//	}
//	public String getGameSeries() {
//		return gameSeries;
//	}
//	public void setGameSeries(String gameSeries) {
//		this.gameSeries = gameSeries;
//	}
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
//	public LocalDateTime getCreateDate() {
//		return createDate;
//	}
//	public void setCreateDate(LocalDateTime createDate) {
//		this.createDate = createDate;
//	}
//	public LocalDateTime getLastModifiedDate() {
//		return lastModifiedDate;
//	}
//	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
//		this.lastModifiedDate = lastModifiedDate;
//	}
//	public String getLanguage() {
//		return language;
//	}
//	public void setLanguage(String language) {
//		this.language = language;
//	}
//	public Double getPrice() {
//		return price;
//	}
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//	public String getForTrade() {
//		return forTrade;
//	}
//	public void setForTrade(String forTrade) {
//		this.forTrade = forTrade;
//	}
//	public String getTradeFor() {
//		return tradeFor;
//	}
//	public void setTradeFor(String tradeFor) {
//		this.tradeFor = tradeFor;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "SellerListings [id=" + id + ", name=" + name + ", type=" + type + ", condition=" + condition
				+ ", conditionDescription=" + conditionDescription + ", cardNumber=" + cardNumber + ", series=" + series
				+ ", imageUrl=" + imageUrl + ", rarity=" + rarity + "]";
	}




	
	
}
