demo project

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
	

