package Service;

import Model.Product;
import dao.IProductDAO;
import dao.daoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    public static Map<Integer,Product> productMap;
    private IProductDAO productDAO = new daoImpl();

    @Override
    public List<Product> displayAllProduct() {
        List<Product> productList = new ArrayList<>();
        try {
            productList = productDAO.getAllProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public void save(Product product) {
        try {
            productDAO.insertProduct(product);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            product = productDAO.getProduct(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public void addProduct(Product product) {
        try {
            productDAO.insertProduct(product);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateProduct(int id, Product product) {
        try {
            productDAO.updateProduct(product);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
//        productMap.remove(id);
        try {
            productDAO.deleteProduct(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Product> findByName(String name) {
        try {
            return productDAO.getAllProduct().stream().filter(pro -> pro.getNameProduct().contains(name)).collect(Collectors.toList());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
