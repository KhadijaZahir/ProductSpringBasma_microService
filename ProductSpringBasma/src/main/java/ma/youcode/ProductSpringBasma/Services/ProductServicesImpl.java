package ma.youcode.ProductSpringBasma.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Repository.ProductRepository;

@Service
public class ProductServicesImpl implements ProductServices{

	 @Autowired
    private ProductRepository repo;
     
    public List<ProductEntity> listAll() {
//    	List<ProductEntity> produit = new ArrayList<ProductEntity>();  
//    	repo.findAll().forEach(prdt -> produit.add(prdt));  
//    	return produit;  
        return repo.findAll();
    }
     
    public void save(ProductEntity product) {
        repo.save(product);
    }
     
    public ProductEntity getById(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	public void update(ProductEntity produit, Long productId)   
	{  
		repo.save(produit);  
	} 
	
	
}