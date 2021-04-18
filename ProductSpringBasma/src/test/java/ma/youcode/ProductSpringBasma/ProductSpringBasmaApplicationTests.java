package ma.youcode.ProductSpringBasma;

import java.net.URISyntaxException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Repository.ProductRepository;

@SpringBootTest
class ProductSpringBasmaApplicationTests {
	@Autowired
	private ProductRepository repo;

	@Test
	void contextLoads() {
	}
	// test add product********************************************************
//
//	@Test
//	@Rollback(false)
//	public void testCreateProduct() {
//		ProductEntity savedProduct = repo.save(new ProductEntity("iPhone 3", "789", "phone", "23"));
//		assertThat(savedProduct.getProductId()).isGreaterThan(0);
//		System.out.println("product added");
//	}
	// test find by name of product ********************************************************

//	@Test
//	public void testFindProductByName() {
//		ProductEntity product = repo.findByName("iPhone 10");
//		assertThat(product.getName()).isEqualTo("iPhone 10");
//		System.out.println("find product by name" + product);
//	}
	// test find by name of product ********************************************************
//
//	@Test
//	public void testFindProductById() {
//		ProductEntity product = repo.findByProductId(5L);
//		System.out.println("find product by id" + product.getName());
//	}
	// test show all product********************************************************

//	@Test
//	public void testListProducts() {
//		List<ProductEntity> products = (List<ProductEntity>) repo.findAll();
//		assertThat(products).size().isGreaterThan(0);
//		System.out.println("all products" + products);
//	}

	// test update product********************************************************

//	@Test
//	@Rollback(false)
//	public void testUpdateProduct() {
//		ProductEntity product = repo.findByName("iPhone 9");
//		product.setPrice("1000");
//
//		repo.save(product);
//
//		ProductEntity updatedProduct = repo.findByName("iPhone 9");
//
//		assertThat(updatedProduct.getPrice()).isEqualTo("1000");
//		System.out.println("update product" + updatedProduct);
//
//	}

	// test delete product ********************************************************
//	@Test
//	@Rollback(false)
//	public void testDeleteProduct() {
//		ProductEntity product = repo.findByName("iPhone 10");
//
//		repo.deleteById(product.getProductId());
//
//		ProductEntity deletedProduct = repo.findByName("iPhone 10");
//
//		assertThat(deletedProduct).isNull();
//		System.out.println("delete product" + deletedProduct);
//
//	}
}
