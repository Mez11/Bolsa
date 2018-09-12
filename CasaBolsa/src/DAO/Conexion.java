/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Conexion {
    
        Connection con;
        String url="jdbc:derby://localhost:1527/CadaDeBolsaDB";
        String username="usuario";
        String password="usuario";
        
    public Conexion() {
    }
      
        public  void Connection(){
            
            try {
                DriverManager.getConnection("jdbc:derby://localhost:1527/CadaDeBolsaDB","usuario","usuario");
                if(con !=null){
                System.out.println("Conexion exitosa");
            }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return con;
        }
//       
//public List<Cliente> mostrarCliente  (){
//        String queryM ="SELECT * FROM TABLA";
//            Statement statement1 = con.createStatement();
//            ResultSet rs = statement.executeQuery(queryM);
//    }
        
    
    public static void main(String [] args) throws SQLException{
        String url="jdbc:derby://localhost:1527/CadaDeBolsaDB";
        String username="usuario";
        String password="usuario";
        
        
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CadaDeBolsaDB","usuario","usuario"))
        {
            if(con !=null){
                System.out.println("Conexion exitosa");
            }
            Statement stmt = con.createStatement();
            String query ="INSERT INTO TABLA (CLAVECLIENTE,DOMICILIO,RFC,PORTAFOLIO)VALUES(?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(2,1234);
            statement.setInt(3, 2);
            statement.setString(4,"LOZJ9876107A9");
            statement.setInt(5,3);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Usuario creado exitosamente");
            }
            //Mostrar todos los clientes
            String queryM ="SELECT * FROM TABLA";
            Statement statement1 = con.createStatement();
            ResultSet rs = statement.executeQuery(queryM);
            int count = 0;
            while(rs.next()){
                int claveCliente = rs.getInt(2);
                int domicilio = rs.getInt(3);
                String rfc = rs.getString(4);
                int portafolio = rs.getInt(5);
         //Delete
            String queryD ="DELETE  FROM TABLA WHERE CLAVECLIENTE";
//            Statement statement1 = con.createStatement();
//            ResultSet rs = statement.executeQuery(queryD);
//                
                
                
            }
            
            con.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            
        }
        
    }
    
}
