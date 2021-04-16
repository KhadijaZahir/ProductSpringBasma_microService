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
@Table(name = "products")
public class ProductEntity implements Serializable {
	
//Using generated security password: cd70d15d-a42c-47b7-a05e-18769a3f5eca
	//Using generated security password: e1cc040f-1dbf-4292-9b61-2ad15a1d24be


	/**
	 * 
	 */
	private static final long serialVersionUID = 4108666288557173738L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

//	@NotNull
	@Column(nullable = false, length = 250)
//	@Size(max = 250)
	private String name;

//    private String image;

	@NotNull
	private String price;
//	JPA annotations
//	@NotNull
	@Column(nullable = false, length = 250)
//	@Size(max = 250)
	private String about;
	

	// Constructor

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	@Override
//	public String toString() {
//		return "ProductEntity [productId=" + productId + ", name=" + name + ", image=" + image + ", price=" + price
//				+ ", about=" + about + "]";
//	}
//	
	
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", name=" + name + ", price=" + price
				+ ", about=" + about + "]";
	}
	

}