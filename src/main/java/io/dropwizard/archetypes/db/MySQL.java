package io.dropwizard.archetypes.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import io.dropwizard.archetypes.resources.Reservation;


public class MySQL {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/parking";
    private String username="root";
    private String password="";





    public void insertNewReservationIntoDb(Reservation reservation) {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, this.username, this.password);
            String query = "INSERT INTO park(spz,street,reservation_date) "+
                    " VALUES (?,?,?)";
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setString(1,reservation.licence);
            ps.setString(2,reservation.street);
            ps.setString(3,reservation.reservation_date);
            ps.executeUpdate();


        }catch(Exception e){
            e.printStackTrace();
        }
    }




}