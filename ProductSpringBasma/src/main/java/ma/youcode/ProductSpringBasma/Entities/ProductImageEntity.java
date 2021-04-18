package ma.youcode.ProductSpringBasma.Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "productImage")
public class ProductImageEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productImgId;

//	@NotNull
	@Column(nullable = false, length = 250)
//	@Size(max = 250)
	private String name;
//	JPA annotations
//	@NotNull
	@Column(nullable = false, length = 250)
//	@Size(max = 250)
	private String path;
	

	// Constructor
	public ProductImageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getProductImgId() {
		return productImgId;
	}


	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}



}