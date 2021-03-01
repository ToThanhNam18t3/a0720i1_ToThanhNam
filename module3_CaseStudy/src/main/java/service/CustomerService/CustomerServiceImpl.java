package service.CustomerService;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import dto.customerDto;
import model.customer.Customer;
import model.customer.CustomerType;
import service.CustomerService.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao = new CustomerDaoImpl();
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {
            customerList = customerDao.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        try {
            customerDao.insertCustomer(customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            customer = customerDao.findById(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void insertCustomer(Customer customer) {
        try {
            customerDao.insertCustomer(customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateById(int id, Customer customer) {
        try {
            customerDao.updateCustomer(id, customer);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void removeCustomer(int id) {
        try {
            customerDao.removeCustomer(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String name) {
        try {
            return customerDao.getAllCustomer().stream().filter(cus -> cus.getCustomerName().contains(name)).collect(Collectors.toList());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<customerDto> getCustomerByNameDto(String name) throws SQLException {
        return this.getCustomerAndCustomerType().stream().filter(cus -> cus.getCustomerName().contains(name)).collect(Collectors.toList());
    }




    @Override
    public List<customerDto> getCustomerAndCustomerType() throws SQLException {
        List<customerDto> customerDtoList = new ArrayList<>();

        List<Customer> customerList = this.customerDao.getAllCustomer();
        for (Customer customer : customerList) {
            customerDto customerDto = new customerDto();
            customerDto.setCustomerId(customer.getCustomerId());

            CustomerType customerType = this.customerTypeService.getCustomerTypeById(customer.getCustomerTypeId());
            customerDto.setCustomerTypeName(customerType.getCustomerTypeName());
            customerDto.setCustomerName(customer.getCustomerName());
            customerDto.setCustomerDob(customer.getCustomerDob());
            customerDto.setCustomerIdentity(customer.getCustomerIdentity());
            customerDto.setCustomerNumberPhone(customer.getCustomerNumberPhone());
            customerDto.setCustomerEmail(customer.getCustomerEmail());
            customerDto.setCustomerAddress(customer.getCustomerAddress());

            customerDtoList.add(customerDto);
        }
        return customerDtoList;
    }


}
