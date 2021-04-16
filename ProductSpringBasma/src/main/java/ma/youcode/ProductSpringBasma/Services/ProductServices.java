package ma.youcode.ProductSpringBasma.Services;

import java.util.List;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;

public interface ProductServices {
    public List<ProductEntity> listAll();
    public void save(ProductEntity product);
    public ProductEntity getById(long id);
    public void delete(long id);
	public void update(ProductEntity produit, Long productId);
}
