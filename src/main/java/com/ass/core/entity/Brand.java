package com.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="brand_info")
public class Brand implements Serializable {
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name="brand_name")
	private String brandName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="brand_product")
	private List<Product> products;
	
	

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getBrand() {
		return brandName;
	}

	public void setBrand(String brand) {
		this.brandName = brand;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
