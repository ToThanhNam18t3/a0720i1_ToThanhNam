package Service;

import Model.Product;

import java.util.List;

public interface ProductService {
//       List<Product> findAll();
//       void save(Product product); //Add
//       Product findById(int id);
//       void update(int id, Product product);
//       void remove(int id);
//       List<Product> findByName(String name);

       List<Product> displayAllProduct();
       void save(Product product);
       Product findById(int id);
       void addProduct( Product product);
       void updateProduct(int id, Product product);
       void remove(int id);
       List<Product> findByName(String name);
}
