package com.example.layeredarchitecture.dao;


import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
        public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

        public void saveCustomer(String id , String name , String address) throws SQLException, ClassNotFoundException ;

        public void UpdateCustomer(String id ,String name , String address) throws SQLException, ClassNotFoundException ;

        public void DeleteCustomer(String id ) throws SQLException, ClassNotFoundException ;

        public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException ;

        public String generateID() throws SQLException, ClassNotFoundException ;

        public ResultSet loadAllCustomerID() throws SQLException, ClassNotFoundException ;

        public ResultSet searchCustomer(Connection connection ,String newValue) throws SQLException ;
}
