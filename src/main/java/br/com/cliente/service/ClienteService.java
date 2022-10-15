package br.com.cliente.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cliente.domain.Cliente;
import br.com.cliente.dto.ClienteDTO;
import br.com.cliente.repository.ClienteRepository;
import br.com.cliente.util.ClienteAdapter;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteDTO save(ClienteDTO clienteDTO) {
		
		Cliente cliente = ClienteAdapter.adapt(clienteDTO);

		cliente.setCreateAt(LocalDate.now());
		
		return ClienteAdapter.adapt(clienteRepository.save(cliente));
	}

}
