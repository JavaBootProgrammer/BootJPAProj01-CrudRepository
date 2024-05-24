# BootJpaProj01-CrudRepository
![UML](resource/JPA.png)


# **Code**

```Java
package com.jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJpaProj01CrudRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJpaProj01CrudRepositoryApplication.class, args);
    }

}
```

```Java
package com.jobs.entity;

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

```Java
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/retail_store
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
spring.datasource.hikari.minimum-idle=10
spring.datasource.hikari.maximum-pool-size=1000
```

## **_POM_**
```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
		</dependency>
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc11</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
    <build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## **_Logs_**
```
jsRepo  obj class name(InMemory Proxy class name)::class jdk.proxy2.$Proxy100
Proxy class implemented interfaces::[interface com.job.repository.IJobSeekerRepository, interface org.springframework.data.repository.Repository, interface org.springframework.transaction.interceptor.TransactionalProxy, interface org.springframework.aop.framework.Advised, interface org.springframework.core.DecoratingProxy]
Proxy class methods::[public final java.lang.Iterable jdk.proxy2.$Proxy100.findAllById(java.lang.Iterable), public final java.lang.Iterable jdk.proxy2.$Proxy100.saveAll(java.lang.Iterable), public final java.util.Optional jdk.proxy2.$Proxy100.findById(java.lang.Object), public final boolean jdk.proxy2.$Proxy100.existsById(java.lang.Object), public final void jdk.proxy2.$Proxy100.deleteById(java.lang.Object), public final void jdk.proxy2.$Proxy100.deleteAllById(java.lang.Iterable), public final void jdk.proxy2.$Proxy100.deleteAll(), public final void jdk.proxy2.$Proxy100.deleteAll(java.lang.Iterable), public final boolean jdk.proxy2.$Proxy100.equals(java.lang.Object), public final java.lang.String jdk.proxy2.$Proxy100.toString(), public final int jdk.proxy2.$Proxy100.hashCode(), public final int jdk.proxy2.$Proxy100.indexOf(org.aopalliance.aop.Advice), public final int jdk.proxy2.$Proxy100.indexOf(org.springframework.aop.Advisor), public final long jdk.proxy2.$Proxy100.count(), public final void jdk.proxy2.$Proxy100.delete(java.lang.Object), public final java.lang.Object jdk.proxy2.$Proxy100.save(java.lang.Object), public final boolean jdk.proxy2.$Proxy100.isFrozen(), public final java.lang.Iterable jdk.proxy2.$Proxy100.findAll(), private static java.lang.invoke.MethodHandles$Lookup jdk.proxy2.$Proxy100.proxyClassLookup(java.lang.invoke.MethodHandles$Lookup) throws java.lang.IllegalAccessException, public final java.lang.Class jdk.proxy2.$Proxy100.getDecoratedClass(), public final org.springframework.aop.TargetSource jdk.proxy2.$Proxy100.getTargetSource(), public final java.lang.Class jdk.proxy2.$Proxy100.getTargetClass(), public final java.lang.Class[] jdk.proxy2.$Proxy100.getProxiedInterfaces(), public final boolean jdk.proxy2.$Proxy100.isInterfaceProxied(java.lang.Class), public final int jdk.proxy2.$Proxy100.getAdvisorCount(), public final org.springframework.aop.Advisor[] jdk.proxy2.$Proxy100.getAdvisors(), public final boolean jdk.proxy2.$Proxy100.isProxyTargetClass(), public final void jdk.proxy2.$Proxy100.setTargetSource(org.springframework.aop.TargetSource), public final void jdk.proxy2.$Proxy100.setExposeProxy(boolean), public final boolean jdk.proxy2.$Proxy100.isExposeProxy(), public final void jdk.proxy2.$Proxy100.setPreFiltered(boolean), public final boolean jdk.proxy2.$Proxy100.isPreFiltered(), public final void jdk.proxy2.$Proxy100.addAdvisor(int,org.springframework.aop.Advisor) throws org.springframework.aop.framework.AopConfigException, public final void jdk.proxy2.$Proxy100.addAdvisor(org.springframework.aop.Advisor) throws org.springframework.aop.framework.AopConfigException, public final boolean jdk.proxy2.$Proxy100.removeAdvisor(org.springframework.aop.Advisor), public final void jdk.proxy2.$Proxy100.removeAdvisor(int) throws org.springframework.aop.framework.AopConfigException, public final boolean jdk.proxy2.$Proxy100.replaceAdvisor(org.springframework.aop.Advisor,org.springframework.aop.Advisor) throws org.springframework.aop.framework.AopConfigException, public final void jdk.proxy2.$Proxy100.addAdvice(org.aopalliance.aop.Advice) throws org.springframework.aop.framework.AopConfigException, public final void jdk.proxy2.$Proxy100.addAdvice(int,org.aopalliance.aop.Advice) throws org.springframework.aop.framework.AopConfigException, public final boolean jdk.proxy2.$Proxy100.removeAdvice(org.aopalliance.aop.Advice), public final java.lang.String jdk.proxy2.$Proxy100.toProxyConfigString()]
Hibernate: select next_val as id_val from js_id_seq for update
Hibernate: update js_id_seq set next_val= ? where next_val=?
Hibernate: insert into job_seeker_info (js_name,js_percentage,js_qlfy,js_id) values (?,?,?,?)
Job Seeker  obj saved(record inserted)  having the id value ::1002
```

## **Tables created**

![JOB_SEEKER_INFO_SEQ](resource/JOB_SEEKER_INFO.png)

![JOB_SEEKER_INFO_SEQ](resource/JOB_SEEKER_INFO_SEQ.png)



