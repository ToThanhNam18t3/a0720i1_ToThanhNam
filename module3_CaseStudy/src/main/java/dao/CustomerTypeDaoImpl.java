package dao;

import model.customer.CustomerType;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeDaoImpl implements CustomerTypeDao {
    Connection connection = DBConnection.getConnection();

    private static final String GET_ALL_CUSTOMER_TYPE = "SELECT * FROM loaikhach";
    private static final String GET_CUSTOMER_TYPE_BY_ID = "SELECT * FROM loaikhach where idLoaiKhach = ?";

    @Override
    public List<CustomerType> displayAllCustomerType() throws SQLException {
        List<CustomerType> customerTypeList = new ArrayList<>();

        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CUSTOMER_TYPE);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int idLoaiKhach = resultSet.getInt("IDLoaiKhach");
            String tenLoaiKhach = resultSet.getString("TenLoaiKhach");

            customerTypeList.add(new CustomerType(idLoaiKhach, tenLoaiKhach));
        }
        return customerTypeList;
    }

    @Override
    public CustomerType getCustomerTypeById(int id) throws SQLException {
        CustomerType customerType = null;

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CUSTOMER_TYPE_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int idLoaiKhach = resultSet.getInt("IDLoaiKhach");
            String tenLoaiKhach = resultSet.getString("TenLoaiKhach");
            customerType = new CustomerType();

            customerType.setCustomerTypeId(idLoaiKhach);
            customerType.setCustomerTypeName(tenLoaiKhach);
        }
        return customerType;
    }
}
