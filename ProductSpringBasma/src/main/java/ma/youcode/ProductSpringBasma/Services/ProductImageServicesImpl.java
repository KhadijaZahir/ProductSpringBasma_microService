package ma.youcode.ProductSpringBasma.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Entities.ProductImageEntity;
import ma.youcode.ProductSpringBasma.Repository.ProductImageRepository;
import ma.youcode.ProductSpringBasma.Repository.ProductRepository;

@Service
public class ProductImageServicesImpl implements ProductImageServices{

	 @Autowired
    private ProductImageRepository repo;
     
    public List<ProductImageEntity> listAll() {
//    	List<ProductEntity> productImage = new ArrayList<ProductImageEntity>();  
//    	repo.findAll().forEach(prdt -> productImage.add(prdt));  
//    	return productImage;  
        return repo.findAll();
    }
     
    public void save(ProductImageEntity productImage) {
        repo.save(productImage);
    }
     
    public ProductImageEntity getById(long productImgId) {
        return repo.findById(productImgId).get();
    }
     
    public void delete(long productImgId) {
        repo.deleteById(productImgId);
    }
	public void update(ProductImageEntity productImage, Long productImgId)   
	{  
		repo.save(productImage);  
	} 
	
	
}