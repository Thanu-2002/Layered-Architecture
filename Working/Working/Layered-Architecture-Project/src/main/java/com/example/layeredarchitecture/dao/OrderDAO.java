package com.example.layeredarchitecture.dao;



import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {
    public ResultSet generateNewOrderID() throws SQLException, ClassNotFoundException ;

    public boolean  exitOrderId(String orderId) throws SQLException, ClassNotFoundException ;

    public int inserIntoOrders(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
