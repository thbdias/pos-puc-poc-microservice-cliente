package br.com.cliente.util;

import org.modelmapper.ModelMapper;

import br.com.cliente.domain.Cliente;
import br.com.cliente.dto.ClienteDTO;


public class ClienteAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static Cliente adapt (ClienteDTO clienteDTO) {
		return mapper.map(clienteDTO, Cliente.class);
	}

	public static ClienteDTO adapt (Cliente cliente) {
		return mapper.map(cliente, ClienteDTO.class);
	}
}
