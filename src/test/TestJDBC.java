package test;

import java.util.ArrayList;

import bean.Cliente;
import bean.ConexionDB;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prueba JDBC ORACLE ");
		
		ConexionDB conexionDB = new ConexionDB();
		ArrayList<Cliente> clientes = conexionDB.getClientes();
		
		System.out.println("No. de clientes:" + clientes.size());
		for (Cliente c : clientes) {
			System.out.println(clientes.toString());
		}
	}

}
