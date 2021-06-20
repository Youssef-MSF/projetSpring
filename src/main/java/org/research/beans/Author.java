package org.research.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Author{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAuthor;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    
    @ManyToOne
    @JoinColumn(name="idAffiliation")
    private Affiliation affiliation;

    public Author(Long idAuthor, String firstName, String lastName, int age, String email, String address) {
		super();
		this.idAuthor = idAuthor;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
	}
    
    public Author() {
    	super();
    }

	public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

	@Override
	public String toString() {
		return "Author [idAuthor=" + idAuthor + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", email=" + email + ", address=" + address + ", affiliation=" + affiliation + "]";
	}
    
    
}
