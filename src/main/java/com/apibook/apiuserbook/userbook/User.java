package com.apibook.apiuserbook.userbook;

public class User {

	private Integer id;
	private Integer idBook;
	private String firstName;
	private String lastName;
	public User(Integer id, Integer idBook, String firstName, String lastName) {
		super();
		this.id = id;
		this.idBook = idBook;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdBook() {
		return idBook;
	}
	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", idBook=" + idBook + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
