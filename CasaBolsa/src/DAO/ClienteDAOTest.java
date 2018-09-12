/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import casabolsa.Cliente;
import java.util.List;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class ClienteDAOTest {
    
    public static void main(String[] args) {
      ClienteDAO dao = new ClienteDAO();
      List<Cliente> clientes = dao.mostrarClienteListado();
        System.out.println("Datos dao"+dao);
      System.out.println("Usuario creado exitosamente"+clientes);
    }
}
