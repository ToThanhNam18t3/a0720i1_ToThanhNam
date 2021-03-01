package dao;

import dto.customerDto;
import model.customer.Customer;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    public  static Connection connection = DBConnection.getConnection();
    private static final String INSERT_CUSTOMER_SQL = "Insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCmtnd,SDT,Email,DiaChi) value (?,?,?,?,?,?,?,?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from khachhang where idKhachHang = ? ";
    private static final String SELECT_ALL_CUSTOMER = "Select * from khachhang";
    private static final String DELETE_CUSTOMER_BY_ID = "DELETE from khachhang where IDKhachHang = ?";
    private static final String UPDATE_CUSTOMER = "UPDATE khachhang set IDLoaiKhach = ?, HoTen = ?, NgaySinh = ?, SoCmtnd = ? , SDT = ?, Email = ?, DiaChi = ? where idKhachHang = ?";

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement= connection.prepareStatement(SELECT_ALL_CUSTOMER);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            int idKhachHang = resultSet.getInt("IDKhachHang");
            int idLoaiKhach = resultSet.getInt("IDLoaiKhach");
            String hoTen = resultSet.getString("HoTen");
            String ngaySinh = resultSet.getString("NgaySinh");
            String CMTND = resultSet.getString("SoCMTND");
            String SDT = resultSet.getString("SDT");
            String email = resultSet.getString("email");
            String diaChi = resultSet.getString("DiaChi");

           customerList.add(new Customer(idKhachHang,idLoaiKhach,hoTen,ngaySinh,CMTND,SDT,email,diaChi));
        }
        return customerList;
    }

    @Override
    public Customer save(Customer customer) throws SQLException {
        return null;
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);

        //Insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCmtnt,SDT,Email,DiaChi)
        preparedStatement.setInt(1, customer.getCustomerId());
        preparedStatement.setInt(2, customer.getCustomerTypeId());
        preparedStatement.setString(3, customer.getCustomerName());
        preparedStatement.setString(4,customer.getCustomerDob());
        preparedStatement.setString(5, customer.getCustomerIdentity());
        preparedStatement.setString(6, customer.getCustomerNumberPhone());
        preparedStatement.setString(7, customer.getCustomerEmail());
        preparedStatement.setString(8, customer.getCustomerAddress());

        preparedStatement.executeUpdate();
    }


    @Override
    public Customer findById(int id) throws SQLException {
        Customer customer = null;

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        //Insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCmtnt,SDT,Email,DiaChi)
        if (resultSet.next()) {
            int idKhachHang = resultSet.getInt("IDKhachHang");
            int idLoaiKhach = resultSet.getInt("IDLoaiKhach");
            String hoTen = resultSet.getString("HoTen");
            String ngaySinh = resultSet.getString("NgaySinh");
            String CMTND = resultSet.getString("SoCmtnd");
            String SDT = resultSet.getString("SDT");
            String email = resultSet.getString("email");
            String diaChi = resultSet.getString("DiaChi");

            customer = new Customer(idKhachHang, idLoaiKhach, hoTen, ngaySinh, CMTND, SDT, email, diaChi);
        }
        return customer;
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);


        preparedStatement.setInt(1, customer.getCustomerTypeId());
        preparedStatement.setString(2, customer.getCustomerName());
        preparedStatement.setString(3,customer.getCustomerDob());
        preparedStatement.setString(4, customer.getCustomerIdentity());
        preparedStatement.setString(5, customer.getCustomerNumberPhone());
        preparedStatement.setString(6, customer.getCustomerEmail());
        preparedStatement.setString(7, customer.getCustomerAddress());
        preparedStatement.setInt(8, customer.getCustomerId());

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean removeCustomer(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

}
