package service.CustomerService;

import dto.customerDto;
import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    void save(Customer customer);
    Customer findById(int id);
    void insertCustomer(Customer customer);
    void updateById(int id, Customer customer);
    void removeCustomer(int id);
    List<Customer> findByName(String name);

    List<customerDto> getCustomerByNameDto(String name) throws SQLException;

    List<customerDto> getCustomerAndCustomerType() throws SQLException;


}
