package com.revature.ecommerce.repository;


<<<<<<< HEAD
import java.util.List;

=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> b8950c9fd2e3ebc19584e55b61cf4ee541a60ea6
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.ecommerce.model.Products;

@CrossOrigin        //("http://localhost:4200") //Allows our Spring REST to accept web browser calls from this http origin (angular frontend)
public interface ProductRepository extends JpaRepository<Products, Long>{
	
<<<<<<< HEAD
	List<Products>getProductsByManufacturer(String Manufacturer);
	List<Products>getAllProducts();
=======
	 Page<Products> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

	    // Used in the product search by keyword
	    Page<Products> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
>>>>>>> b8950c9fd2e3ebc19584e55b61cf4ee541a60ea6
}
