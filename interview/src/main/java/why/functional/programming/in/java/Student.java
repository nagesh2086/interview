package why.functional.programming.in.java;

public class Student {

	private String name;
	private String standard;
	private String address;
	private Integer marksInMaths;
	private Integer marksInScience;
	private Integer marksInMarathi;
	private Integer total;

	public Student(String name, String standard, String address, Integer marksInMaths, Integer marksInScience,
			Integer marksInMarathi) {
		this.name = name;
		this.standard = standard;
		this.address = address;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
		this.marksInMarathi = marksInMarathi;
	}

	public String getName() {
		return name;
	}

	public String getStandard() {
		return standard;
	}

	public String getAddress() {
		return address;
	}

	public Integer getMarksInMaths() {
		return marksInMaths;
	}

	public Integer getMarksInScience() {
		return marksInScience;
	}

	public Integer getMarksInMarathi() {
		return marksInMarathi;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotal() {
		return total;
	}

	public static void main(String[] args) {

	}

}
