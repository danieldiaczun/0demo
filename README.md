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

DATE AND TIME TYPES

date 							java.util.Date, java.sql.Date 		DATE
time 							java.util.Date,	java.sql.Time 		TIME
timestamp 						java.util.Date,	java.sql.Timestamp 	TIMESTAMP
calendar 						java.util.Calendar 					TIMESTAMP
calendar_date 					java.util.Calendar					DATE
duration 						java.time.Duration 					BIGINT
instant 						java.time.Instant 					TIMESTAMP
localdatetime 					java.time.LocalDateTime 			TIMESTAMP
localdate 						java.time.LocalDate 				DATE
localtime 						java.time.LocalTime 				TIME
offsetdatetime 					java.time.OffsetDateTime 			TIMESTAMP
offsettime 						java.time.OffsetTime 				TIME
zoneddatetime 					java.time.ZonedDateTime 			TIMESTAMP

BINARY AND LARGE VALUE TYPES

binary byte[], 					java.lang.Byte[] 					VARBINARY
text 							java.lang.String 					CLOB
clob 							java.sql.Clob 						CLOB
blob 							java.sql.Blob 						BLOB
serializable 					java.io.Serializable 				VARBINARY
========================================================================================================================================================
