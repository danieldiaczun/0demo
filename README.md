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

insert into demo values (0, 50, 7, {ts '2012-09-17 18:47:52.69'}, 'osv')

========================================================================================================================================================
PRIMITIVE AND NUMERIC TYPES

integer int,					java.lang.Integer 					INTEGER
long long,						java.lang.Long 						BIGINT
short short,					java.lang.Short 					SMALLINT
float float,					java.lang.Float 					FLOAT
double double,					java.lang.Double 					DOUBLE
byte byte,						java.lang.Byte 						TINYINT
boolean boolean,				java.lang.Boolean 					BOOLEAN
big_decimal 					java.math.BigDecimal 				NUMERIC
big_integer 					java.math.BigInteger 				NUMERIC

CHARACTER TYPES

string 							java.lang.String 					VARCHAR
character char[], Character[], 	java.lang.String 					CHAR
yes_no boolean,					java.lang.Boolean 					CHAR(1), 'Y' or 'N'
true_false boolean,				java.lang.Boolean 					CHAR(1), 'T' or 'F'
class 							java.lang.Class 					VARCHAR
locale 							java.util.Locale 					VARCHAR
timezone 						java.util.TimeZone 					VARCHAR
currency 						java.util.Currency 					VARCHAR
========================================================================================================================================================
