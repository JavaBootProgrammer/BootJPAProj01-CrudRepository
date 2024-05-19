# BootJpaProj01-CrudRepository
![Alt text](JPA.png)


**Code**

```package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJpaProj01CrudRepositoryApplication.class, args);
	}

}
```


```//Entity class
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JOB_SEEKER_INFO")
@Data
public class JobSeeker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JS_ID")
	private Integer jobSeekerID;
	@Column(name = "JS_NAME", length = 20)
	private String jobSeekerName;
	@Column(name = "JS_QLFY", length = 20)
	private String jobSeekerQualification;
	@Column(name = "JS_PERCENTAGE")
	private Float jobSeekerPercentage;
	@Column(name = "JS_CONTACT_INFO")
	private Long mobileNo;

}
```

``` # MY SQL
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/retail_store
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
spring.datasource.hikari.minimum-idle=10
spring.datasource.hikari.maximum-pool-size=1000

```