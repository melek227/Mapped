package jpa.inherit.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("SİSTER")//class adının vurgulu olmasını sağlar 
public class Sister {


	private short sisterCode;
	
	
	public Sister(long entityId) {
		super();
	
		
	}



	public short getSisterCode() {
		return sisterCode;
	}


	public void setSisterCode(short sisterCode) {
		this.sisterCode = sisterCode;
	}
	
	

}
