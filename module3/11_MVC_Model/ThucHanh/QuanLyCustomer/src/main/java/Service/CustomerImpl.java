package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements CustomerService{

    private static Map<Integer,Customer> customers = new HashMap<>();

    static {
        customers.put(1,new Customer(1,"Thanh Nam","tothanhnam217200@gmail.com","87 Cao Thang"));
        customers.put(2,new Customer(2,"Thanh Phat","thanhdat@gmail.com","86 Cao Thang"));
        customers.put(3,new Customer(3,"Thanh Dat","thanhdat@gmail.com","85 Cao Thang"));
        customers.put(4,new Customer(4,"Hong Sang","hongsang@gmail.com","84 Cao Thang"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values()); //Tra ve value thông qua key
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
