package principal;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(" *** Aula 01 Java WebDeveloper *** ");
		
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNome("Sergio Mendes");
		cliente.setEmail("sergio.coti@gmail.com");
		cliente.setCpf("121.456.789-88");
	
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("\tID....: " + cliente.getIdCliente());
		System.out.println("\tNOME..: " + cliente.getNome());
		System.out.println("\tEMAIL.: " + cliente.getEmail());
		System.out.println("\tCPF...: " + cliente.getCpf());
	
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);
		
	}

}
