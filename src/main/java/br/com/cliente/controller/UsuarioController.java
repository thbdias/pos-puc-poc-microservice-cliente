package br.com.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cliente.dto.ClienteDTO;
import br.com.cliente.service.ClienteService;


@RestController
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/save")
	public ClienteDTO cadastrar(@RequestBody ClienteDTO clienteDTO) {
		return clienteService.save(clienteDTO);		
	}

}
