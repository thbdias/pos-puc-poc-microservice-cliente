package br.com.cliente.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cliente.dto.ClienteDTO;


@Service
public class ClienteService {
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	public ClienteDTO save(ClienteDTO clienteDTO) {
		
//		Usuario usuario = UsarioAdapter.adapt(usuarioDTO);
//		
//		usuario.setSenha(usuario.getSenha());
//		usuario.setCreateAt(LocalDate.now());
//		
//		return UsarioAdapter.adapt(usuarioRepository.save(usuario));
		return null;
	}

}
