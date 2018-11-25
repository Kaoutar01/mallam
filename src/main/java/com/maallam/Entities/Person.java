package com.maallam.Entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.jnlp.IntegrationService;

/**
 * @author kaout
 * @version 1.0
 * @created 25-nov.-2018 04:04:36
 */
@Document
public class Person {
	@Id
	private Integer id_person;
	private String p_email;
	private String p_Fname;
	private String p_Lname;
	private int p_tel;
	//public Addres m_Addres;
	//public Account m_Account;
	public Person(){

	}

	public void setId_person(Integer id_person) {
		this.id_person = id_person;
	}

	public void setP_email(String p_email) {
		this.p_email = p_email;
	}

	public void setP_Fname(String p_Fname) {
		this.p_Fname = p_Fname;
	}

	public void setP_Lname(String p_Lname) {
		this.p_Lname = p_Lname;
	}

	public void setP_tel(int p_tel) {
		this.p_tel = p_tel;
	}

	public int getId_person() {
		return id_person;
	}

	public String getP_email() {
		return p_email;
	}

	public String getP_Fname() {
		return p_Fname;
	}

	public String getP_Lname() {
		return p_Lname;
	}

	public int getP_tel() {
		return p_tel;
	}

	public Person(Integer id_person, String p_email, String p_Fname, String p_Lname, int p_tel) {
		this.id_person = id_person;
		this.p_email = p_email;
		this.p_Fname = p_Fname;
		this.p_Lname = p_Lname;
		this.p_tel = p_tel;
	}


	@Override
	public String toString() {
		return "Person{" +
				"id_person=" + id_person +
				", p_email=" + p_email +
				", p_Fname=" + p_Fname +
				", p_Lname=" + p_Lname +
				", p_tel=" + p_tel +
				'}';
	}

	public void finalize() throws Throwable {

	}
	public int delete(){
		return 0;
	}

	public int Login(){
		return 0;
	}

	public int logOff(){
		return 0;
	}

	public int retrive(){
		return 0;
	}

	public int Singin(){
		return 0;
	}

	public int Update(){
		return 0;
	}
}//end Person