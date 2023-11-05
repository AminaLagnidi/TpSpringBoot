package ma.projet.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Student extends User implements Serializable {
  private String firstname;
  private String lastname ;
  private String telephone;
  @ManyToOne
  private Filiere filiere;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public Filiere getFiliere() {
	return filiere;
}
public void setFiliere(Filiere filiere) {
	this.filiere = filiere;
}
  
}
