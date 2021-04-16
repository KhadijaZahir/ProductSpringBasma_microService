package ma.youcode.ProductSpringBasma.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.youcode.ProductSpringBasma.Entities.ProductEntity;

//CrudRepository :  mainly provides CRUD functions.
//JpaRepository : provides some JPA-related methods such as flushing the persistence context and deleting records in a batch
//PagingAndSortingRepository :provides methods to do pagination and sorting records.
//JpaRepository :CrudRepository and PagingAndSortingRepository
//this interface extends the CrudRepository interface from Spring Data JPA. At runtime, 
//Spring will generate implementation class that provides all CRUD operations.



public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	
	ProductEntity findByProductId(Long id);
//	 @Query("SELECT u FROM ProductEntity u WHERE u.ProductId = :ProductId")
//	    public ProductEntity findByProductId(@Param("ProductId") Long ProductId);
}
