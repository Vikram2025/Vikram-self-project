package in.vikram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;

@Entity

public class Student {
//	@GenericGenerator(name="gen1",strategy="increment")
//	@GeneratedValue(generator="gen1")
	@Id
	@GenericGenerator(name="gen1",strategy="sequence")
	@GeneratedValue(generator="gen1")
	
	private Integer id;
	private String name;
    private Integer age;
    private String address;
	
	
	
	public Student() {
		System.out.println("Hibernate uses zero argument constructor");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}