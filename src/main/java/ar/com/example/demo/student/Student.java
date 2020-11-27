package ar.com.example.demo.student;

public class Student {

	private final Integer id;
	private final String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	

	
	
}
