//Entity class
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JOB_SEEKER_INFO")
@Data
public class JobSeeker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="JS_ID")
	private Integer jsId;
	@Column(name="JS_NAME",length =20)
	private  String  jsName;
	@Column(name="JS_QLFY",length =20)
	private   String  qlfy;
	@Column(name="JS_PERCENTAGE")
	private   Float   percentage;
	@Column(name="JS_CONTACT_INFO")
	private   Long    mobileNo;
	

}
