# BootJpaProj01-CrudRepository
![UML](resource/JPA.png)


# **Code**

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
# **Logs**

```2024-05-18T21:00:26.895-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-05-18T21:00:27.198-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@594131f2
2024-05-18T21:00:27.199-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-05-18T21:00:27.783-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2024-05-18T21:00:27.816-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-05-18T21:00:27.935-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [           main] n.BootJpaProj01CrudRepositoryApplication : Started BootJpaProj01CrudRepositoryApplication in 2.251 seconds (process running for 2.568)
2024-05-18T21:00:27.940-04:00  INFO 313746 --- [BootJpaProj01-CrudRepository] [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'```
```

# **JPA Created Tables**
![UML](resource/JOB_SEEKER_INFO.png)

![UML](resource/JOB_SEEKER_INFO_SEQ.png)
