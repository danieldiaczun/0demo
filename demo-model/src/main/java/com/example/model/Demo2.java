package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.sun.istack.internal.NotNull;

@Entity
public class Demo2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	@Access(AccessType.PROPERTY)
	private String name;

//	@Formula("(select avg(b.AMOUNT) from BID b where b.ITEM_ID = ID)")
	@Formula("name || '...'")	
	private String derivedName;
	
	@Column(nullable = false)
	@ColumnTransformer(read = "edad / 10", write = "? * 10")
	private Integer edad;

	@Transient
	private String transientName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	@org.hibernate.annotations.CreationTimestamp
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, insertable = false, updatable = false)
	@Generated(GenerationTime.ALWAYS)
	private Date lastModified;

	@Column(nullable = false, insertable = false)
	@ColumnDefault("1.00")
	@Generated(GenerationTime.INSERT)
	private BigDecimal initialPrice;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AuctionType auctionType = AuctionType.HIGHEST_BID;

	@PostLoad
	private void onLoad() {
	    this.transientName = name + derivedName;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDerivedName() {
		return derivedName;
	}

	public void setDerivedName(String derivedName) {
		this.derivedName = derivedName;
	}

	public String getTransientName() {
		return transientName;
	}

	public void setTransientName(String transientName) {
		this.transientName = transientName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}
	
	public AuctionType getAuctionType() {
		return auctionType;
	}

	public void setAuctionType(AuctionType auctionType) {
		this.auctionType = auctionType;
	}
}
