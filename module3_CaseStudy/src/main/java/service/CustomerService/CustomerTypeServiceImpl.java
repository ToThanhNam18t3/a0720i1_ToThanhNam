package service.CustomerService;

import dao.CustomerTypeDao;
import dao.CustomerTypeDaoImpl;
import model.customer.CustomerType;
import service.CustomerService.CustomerTypeService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeDao customerTypeDao = new CustomerTypeDaoImpl();

    @Override
    public List<CustomerType> getAllCustomerType() {
        List<CustomerType> customerTypes = new ArrayList<>();

        try {
            customerTypes = customerTypeDao.displayAllCustomerType();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypes;
    }

    @Override
    public CustomerType getCustomerTypeById(int id) {
        CustomerType customerType = null;
        try {
            customerType = this.customerTypeDao.getCustomerTypeById(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerType;
    }
}
