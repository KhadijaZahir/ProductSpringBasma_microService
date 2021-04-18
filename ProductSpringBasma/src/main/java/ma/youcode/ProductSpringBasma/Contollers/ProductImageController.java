package ma.youcode.ProductSpringBasma.Contollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Entities.ProductImageEntity;
import ma.youcode.ProductSpringBasma.Services.ProductImageServicesImpl;
import ma.youcode.ProductSpringBasma.Services.ProductServices;
import ma.youcode.ProductSpringBasma.Services.ProductServicesImpl;
import ma.youcode.ProductSpringBasma.exceptions.ProductNotFoundException;

@RestController
//@RequestMapping("/products") // localhost:8080/productsImages
public class ProductImageController {

	@Autowired
	private ProductImageServicesImpl productImagesService;

	// Affiche la liste de tous les produits disponibles
	// La méthode listeDesProduits , qui permet la récupération de la liste de tous
	// les produits.

	@GetMapping(value = "/allProductsImages")
	public List<ProductImageEntity> listeDesProduits() {

		List<ProductImageEntity> productsImages = productImagesService.listAll();
		if (productsImages.isEmpty())
			throw new ProductNotFoundException("Aucun produit n'est disponible à la vente");

		return productsImages;

	}

	// Récuperer un produit par son id
	// La méthode recupererUnProduit , qui permet de récupérer un produit par son
	// id.
//Une exception  ProductNotFoundException , qui renvoie le code 404 si le ou les produits ne sont pas trouvés.
//	@GetMapping(value = "/productsImages/{productImgId}")
//	public Optional<ProductImageEntity> recupererUnProduitImage(@PathVariable Long productImgId) {
//
//		Optional<ProductImageEntity> productsImages = Optional.of(productImagesService.getById(productImgId));
//
//		if (!productsImages.isPresent())
//			throw new ProductNotFoundException("Le produit correspondant à l'id " + productImgId + " n'existe pas");
//
//		return productsImages;
//	}

	// get all product
//	@GetMapping("/allProductsImages")
//	private ListImages<ProductImageEntity> getAllProduct() {
//		return productImagesService.listAll();
//	}

	// Récupérer un produit par son Id
	@GetMapping(value = "/productsImages/{productId}")
	public ProductImageEntity afficherUnProduitImages(@PathVariable Long productImgId) {
		return productImagesService.getById(productImgId);
	}

	// delete product
	@DeleteMapping(value = "/deleteProductsImages/{productImgId}")
	public void deleteProductImages(@PathVariable Long productImgId) {

		productImagesService.delete(productImgId);
	}

	// updates product
	@PutMapping(value = "/productsImages")
	public void updatesProductImages(@RequestBody ProductImageEntity product) {

		productImagesService.save(product);
	}

	// add product
	@PostMapping("/productsImages")
	private Long saveProductImages(@RequestBody ProductImageEntity productsImages) {
		productImagesService.save(productsImages);
		return productsImages.getProductImgId();
	}

//	@GetMapping("/productsImages")
//	public String getProdImages() {
//		return "get productsImages";
//	}
//    @PostMapping("/productsImages")
//    public String addProdImages () {
//    	return "add productsImages";
//    }
}