package ma.youcode.ProductSpringBasma.Contollers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Services.ProductServices;
import ma.youcode.ProductSpringBasma.Services.ProductServicesImpl;
import ma.youcode.ProductSpringBasma.exceptions.ProductNotFoundException;

@RestController
//@RequestMapping("/products") // localhost:8080/products
public class ProductController {

	@Autowired
	private ProductServicesImpl productService;

	// Affiche la liste de tous les produits disponibles
	// La méthode listeDesProduits , qui permet la récupération de la liste de tous
	// les produits.

	@GetMapping(value = "/allProducts")
	public List<ProductEntity> listeDesProduits() {

		List<ProductEntity> products = productService.listAll();
		if (products.isEmpty())
			throw new ProductNotFoundException("Aucun produit n'est disponible à la vente");

		return products;

	}

	// Récuperer un produit par son id**************************************************************
	// La méthode recupererUnProduit , qui permet de récupérer un produit par son
	// id.
//Une exception  ProductNotFoundException , qui renvoie le code 404 si le ou les produits ne sont pas trouvés.
//    @GetMapping( value = "/products/{id}")
//    public Optional<ProductEntity> recupererUnProduit(@PathVariable int id) {
//
//        Optional<ProductEntity> product = productDao.findById(id);
//
//        if(!product.isPresent())  throw new ProductNotFoundException("Le produit correspondant à l'id " + id + " n'existe pas");
//
//        return product;
//    }

	// get all product**************************************************************
//    	@GetMapping("/allProducts")
//    	private List<ProductEntity> getAllProduct() {
//    		return productService.listAll();
//    	}

	// Récupérer un produit par son Id**************************************************************
	@GetMapping(value = "/products/{productId}")
	public ProductEntity afficherUnProduit(@PathVariable Long productId) {
		return productService.getById(productId);
	}

	// delete product **************************************************************
	@DeleteMapping(value = "/deleteProducts/{idProduct}")
	public void deleteProduct(@PathVariable Long idProduct) {

		productService.delete(idProduct);
	}
	// delete product **************************************************************

//	@DeleteMapping("/products/{id}")
//	public void delete(@PathVariable Long idProduct) {
//		productService.delete(idProduct);
//	}

	// updates product**************************************************************
//	@PutMapping(value = "/products")
//	public void updatesProduct(@RequestBody ProductEntity product) {
//
//		productService.save(product);
//	}
	// updates product**************************************************************

//	@PutMapping("/products/{id}")
//	public ResponseEntity<?> update(@RequestBody ProductEntity product, @PathVariable Long productId) {
//		try {
//			ProductEntity existProduct = productService.getById(productId);
//			productService.save(product);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

	// add product**************************************************************
	@PostMapping("/products")
	private Long saveProduct(@RequestBody ProductEntity products) {
		productService.save(products);
		return products.getProductId();
	}

//	@PostMapping("/products")
//	public void add(@RequestBody ProductEntity product) {
//		productService.save(product);
//	}

//	@GetMapping("/products")
//	public String getProd() {
//		return "get pro";
//	}
//    @PostMapping("/products")
//    public String addProd () {
//    	return "add pro";
//    }
}