package dao;

import model.customer.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface CustomerTypeDao {
    List<CustomerType> displayAllCustomerType() throws SQLException;
    CustomerType getCustomerTypeById(int id) throws SQLException;
}
