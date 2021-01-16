package dao;

import Model.Product;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class daoImpl implements IProductDAO {
    private static final String INSERT_PRODUCT_SQL ="Insert into products(ID,NameProduct,Price,Image) value (?,?,?,?)";
    private static final String SELECT_PRODUCT_ID = "SELECT * FROM products where id = ?";
    private static final String SELECT_ALL_PRODUCT = "SELECT * FROM products";
    private static final String DELETE_PRODUCT_BY_ID ="DELETE from products where id = ?";
    private static final String UPDATE_PRODUCT = "Update products set nameProduct = ?, price = ?, image = ? where id = ?";

    @Override
    public void insertProduct(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
        preparedStatement.setInt(1,product.getID());
        preparedStatement.setString(2,product.getNameProduct());
        preparedStatement.setDouble(3,product.getPrice());
        preparedStatement.setString(4, product.getImage());

        preparedStatement.executeUpdate();
    }

    @Override
    public Product getProduct(int id) throws SQLException {
        Product product = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_ID);
        preparedStatement.setInt(1,id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("nameProduct");
            Double price = resultSet.getDouble("price");
            String image = resultSet.getString("image");

            product = new Product(ID,name,price,image);
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        List<Product> productList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("nameProduct");
            Double price = resultSet.getDouble("Price");
            String image = resultSet.getString("Image");

            productList.add(new Product(ID,name,price,image));
        }
        return productList;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
        preparedStatement.setInt(1,product.getID());
        preparedStatement.setString(2,product.getNameProduct());
        preparedStatement.setDouble(3,product.getPrice());
        preparedStatement.setString(4, product.getImage());

        return preparedStatement.executeUpdate() > 0;
    }
}
