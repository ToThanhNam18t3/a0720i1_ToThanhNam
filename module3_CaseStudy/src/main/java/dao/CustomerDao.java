package dao;

import dto.customerDto;
import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
//    List<Customer> getAllCustomer();
//    Customer save(Customer customer);
//    Customer findById(int id);
//    Customer insertCustomer();
//    Customer updateById(int id, Customer customer);
//    void removeCustomer(int id);

    List<Customer> getAllCustomer() throws SQLException;
    Customer save(Customer customer) throws SQLException;
    void insertCustomer(Customer customer) throws SQLException;
    Customer findById(int id) throws SQLException;
    boolean updateCustomer(int id, Customer customer) throws SQLException;
    boolean removeCustomer(int id) throws SQLException;
}
