package ma.youcode.ProductSpringBasma.Services;

import java.util.List;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;
import ma.youcode.ProductSpringBasma.Entities.ProductImageEntity;

public interface ProductImageServices {
    public List<ProductImageEntity> listAll();
    public void save(ProductImageEntity productImage);
    public ProductImageEntity getById(long productImgId);
    public void delete(long productImgId);
	public void update(ProductImageEntity productImage, Long productImgId);
}
