package exercises.week11;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
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

	@Override
	public int compareTo(Customer o) {
		Customer other = (Customer) o;
		if( id == other.id)
			return 0;
		else if( id>other.id)
			return 1;
		else 
			return -1;
	}

	
}
