package jpa.mapped.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier extends Partner{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private double totalCredit;
	

	public Supplier(long parentId, String parentName, double totalCredit) {
		super(parentId, parentName);
		this.totalCredit = totalCredit;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	

}
