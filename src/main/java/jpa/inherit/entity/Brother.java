package jpa.inherit.entity;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@DiscriminatorValue("BROTHER")//class adının vurgulu olmasını sağlar 
public class Brother extends Parent {
	

	private boolean brotherCheck;
	
	
	
	public Brother(String entityName, double entityValue, long entityId, boolean brotherCheck) {
		super(entityName, entityValue);
		
		this.brotherCheck = brotherCheck;
	}
	
	
	public boolean isBrotherCheck() {
		return brotherCheck;
	}
	public void setBrotherCheck(boolean brotherCheck) {
		this.brotherCheck = brotherCheck;
	}
	
	

}
