package service.CustomerService;

import model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> getAllCustomerType();

    CustomerType getCustomerTypeById(int id);
}
