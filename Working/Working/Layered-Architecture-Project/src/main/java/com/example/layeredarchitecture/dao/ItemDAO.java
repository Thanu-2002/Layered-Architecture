package com.example.layeredarchitecture.dao;


import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public void SaveItem(String  code , String description , BigDecimal unitPrice , int qtyOnHand) throws SQLException, ClassNotFoundException ;

    public void UpdateItem(String  description , BigDecimal unitPrice , int qtyOnHand, String code) throws SQLException, ClassNotFoundException ;

    public boolean exitItem(String code) throws SQLException, ClassNotFoundException ;

    public String generateNewId() throws SQLException, ClassNotFoundException ;

    public ResultSet findItem(String code) throws SQLException, ClassNotFoundException ;

    public ResultSet getAllItemCode() throws SQLException, ClassNotFoundException ;

    public ResultSet FindItem(String newItemCode) throws SQLException, ClassNotFoundException ;

    public int update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
}
