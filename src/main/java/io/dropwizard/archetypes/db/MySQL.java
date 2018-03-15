package io.dropwizard.archetypes.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import io.dropwizard.archetypes.resources.Registration;



public class MySQL {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/parking";
    private String username="root";
    private String password="root";





    public void insertNewReservationIntoDb(Registration registration) {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, this.username, this.password);
            String query = "INSERT INTO park(licence,street, date) "+
                    " VALUES (?,?,?)";
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setString(1,registration.licence);
            ps.setString(2,registration.street);
            ps.setString(3,registration.date);

            ps.executeUpdate();


        }catch(Exception e){
            e.printStackTrace();
        }
    }




}