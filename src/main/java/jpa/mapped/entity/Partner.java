package jpa.mapped.entity;

import javax.persistence.MappedSuperclass;


/*üst sınıfın doğrudan kullanımını istemiyorsak alt sınıflar için base teşkil etmesini istiyorsak, üst sınıftaki
fieldleri tekrar yazmamak için yaptıysak alt sınıflar entity olur veri tabanında saklanır.
üst sınıflar saklanmaz
*/

//üst sınıfa  @entity yerin @Mappedsuperclass yaz
@MappedSuperclass
//Entity demememizin sebebi ayrı bir tablo olmaması
public class Partner {
	
	private long parentId;
	private String parentName;
	
	
	public Partner(long parentId, String parentName) {
		super();
		this.parentId = parentId;
		this.parentName = parentName;
	}
	
	
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	

}
