package exercises.week5;

import java.util.Objects;

public class Customer extends Object{
	private int id;
	private String name;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		super();
		
	}
	
//	public boolean equals(Object other) {
//		if(this == other )
//			return true;
//		if(other ==null) 
//			return false;
//		if(this.getClass()!=other.getClass())
//			return false;
//		
//		Customer otherCustomer=(Customer)other;
//		if(this.getId()==otherCustomer.getId())
//			return true;
//		return false;
//	}
	
	

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}

	public void setId(int id) {
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
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	
}
