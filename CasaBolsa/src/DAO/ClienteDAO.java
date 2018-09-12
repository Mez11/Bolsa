/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import casabolsa.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class ClienteDAO {

    Connection con;
    String url = "jdbc:derby://localhost:1527/CadaDeBolsaDB";
    String username = "usuario";
    String password = "usuario";

    public ClienteDAO() {
    }

    public Connection obtenerConexion() {

        try {
            DriverManager.getConnection("jdbc:derby://localhost:1527/CadaDeBolsaDB", "usuario", "usuario");
            if (con != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
//public Cliente obtenCliente(int id){
//    Optional<Cliente> cl =obtenerConexion().stream()
//            .filter(c->)
//    
//}

    public List<Cliente> mostrarClienteListado() {
        List<Cliente> clientes = null;
        var queryM = "SELECT * FROM TABLA";
        try {
            PreparedStatement prst = obtenerConexion().prepareStatement(queryM);
            ResultSet rs = prst.executeQuery(queryM);
            clientes = new ArrayList<>();
            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("IdCliente"),
                        rs.getString("Nombres"),
                        rs.getString("ApellidoPaterno"),
                        rs.getString("ApellidoMaterno"),
                        rs.getString("RFC"),
                        (rs.getDate("FECHANACIMIENTO")).toLocalDate(),
                        rs.getInt("IDDOMICILIO"),
                        rs.getInt("IDPORTAFOLIO")
                );
                clientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;

    }

    public Cliente insertar() throws SQLException {
        String query = "INSERT INTO TABLA (CLAVECLIENTE,DOMICILIO,RFC,PORTAFOLIO)VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(query);
        try {
            statement.setInt(1, 1234);
            statement.setString(2, "Laura");
            statement.setString(3, "Sanchez");
            statement.setString(3, "Montes");
            statement.setString(5, "LOPSPSDSDS");
            statement.setDate(6, Date.valueOf(LocalDate.of(1433, 2, 10)));
            statement.setInt(7, 1);
            statement.setInt(8, 4);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Usuario creado exitosamente");
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public Cliente obtenCliente(int id) {
        Optional<Cliente> cl = mostrarClienteListado().stream()
                .filter(c -> c.getIdCliente() == id).findFirst();
        Cliente clienteEncontrado = null;
        if (cl.isPresent()) {
            clienteEncontrado = cl.get();
        }
        return clienteEncontrado;

    }
}//end class
//public static void main(String [] args) throws SQLException{
//        String url="jdbc:derby://localhost:1527/CadaDeBolsaDB";
//        String username="usuario";
//        String password="usuario";
//        
//        
//        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CadaDeBolsaDB","usuario","usuario"))
//        {
//            if(con !=null){
//                System.out.println("Conexion exitosa");
//            }
//            Statement stmt = con.createStatement();
//            String query ="INSERT INTO TABLA (CLAVECLIENTE,DOMICILIO,RFC,PORTAFOLIO)VALUES(?,?,?,?)";
//            PreparedStatement statement = con.prepareStatement(query);
//            statement.setInt(2,1234);
//            statement.setInt(3, 2);
//            statement.setString(4,"LOZJ9876107A9");
//            statement.setInt(5,3);
//            int rowsInserted = statement.executeUpdate();
//            if(rowsInserted > 0){
//                System.out.println("Usuario creado exitosamente");
//            }
//            //Mostrar todos los clientes
//            String queryM ="SELECT * FROM TABLA";
//            Statement statement1 = con.createStatement();
//            ResultSet rs = statement.executeQuery(queryM);
//            int count = 0;
//            while(rs.next()){
//                int claveCliente = rs.getInt(2);
//                int domicilio = rs.getInt(3);
//                String rfc = rs.getString(4);
//                int portafolio = rs.getInt(5);
//         //Delete
//            String queryD ="DELETE  FROM TABLA WHERE CLAVECLIENTE";
////            Statement statement1 = con.createStatement();
////            ResultSet rs = statement.executeQuery(queryD);
////                
//                
//                
//            }
//            
//            con.close();
//        }catch(SQLException ex){
//            ex.printStackTrace();
//            
//        }
//        
//    }
//    

