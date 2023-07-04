package jpa.inherit.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//TABLE_PER_CLASS  Her sınıf için veritabanında ayrı bir tablo yapar
//SİNGLE_TABLE     Tek bir tablo yap bir tane sütun koy o sütuna bakarak kaydın hangi varlıkla ilişkili olduğunu anla
//JOİNED           Ana tablo yap her alt sınıf için ayrı bir tablo yap o tabloları ana  tabloya bağla

@DiscriminatorColumn(name="SIBLING_TYPE") //brother ve sister için Dtype sütun adını değiştirir 
public abstract class Parent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String entityName;
	private double entityValue;
	private long entityId;
	
	
	
	public Parent(String entityName, double entityValue) {
		super();
		this.entityName = entityName;
		this.entityValue = entityValue;
	}


	public String getEntityName() {
		return entityName;
	}


	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	public double getEntityValue() {
		return entityValue;
	}


	public void setEntityValue(double entityValue) {
		this.entityValue = entityValue;
	}
	
	
	

}
