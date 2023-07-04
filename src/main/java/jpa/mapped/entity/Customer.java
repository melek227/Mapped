package jpa.mapped.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends Partner {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private double totalDebit;

	public Customer(long parentId, String parentName, double totalDebit) {
		super(parentId, parentName);
		this.totalDebit = totalDebit;
	}

	public double getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}
	
	
	

}
