package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) {
	
		try {
	
			PrintWriter printWriter = new PrintWriter("c:\\temp\\clientes.txt");
	
			printWriter.print("\nID....: " + cliente.getIdCliente());
			printWriter.print("\nID....: " + cliente.getNome());
			printWriter.print("\nID....: " + cliente.getEmail());
			printWriter.print("\nID....: " + cliente.getCpf());
	
			printWriter.flush();
			printWriter.close();

			System.out.println("\nDados gravados com sucesso!!!");

		}

		catch(Exception e) {

			e.printStackTrace();
}
}
}