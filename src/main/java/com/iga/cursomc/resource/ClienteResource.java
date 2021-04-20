package com.iga.cursomc.resource;

import static com.iga.cursomc.resource.util.Constants.API;
import static com.iga.cursomc.resource.util.Constants.CLIENTES;
import static com.iga.cursomc.resource.util.Constants.V1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iga.cursomc.domain.Cliente;
import com.iga.cursomc.services.ClienteService;

@RestController
@RequestMapping(API + V1 + CLIENTES)
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
