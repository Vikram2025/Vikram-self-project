package PlayerDTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class PlayerdtoObj implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name = "gen", strategy = "identity" )
	@GeneratedValue(generator = "gen1")
	private Integer id;
private 	String name;
	private String teamname;
	private Integer salary;
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
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PlayerdtoObj [id=" + id + ", name=" + name + ", teamname=" + teamname + ", salary=" + salary + "]";
	}
	
	

}
