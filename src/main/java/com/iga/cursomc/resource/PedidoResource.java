package com.iga.cursomc.resource;

import static com.iga.cursomc.resource.util.Constants.API;
import static com.iga.cursomc.resource.util.Constants.V1;
import static com.iga.cursomc.resource.util.Constants.PEDIDOS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iga.cursomc.domain.Pedido;
import com.iga.cursomc.services.PedidoService;

@RestController
@RequestMapping(API + V1 + PEDIDOS)
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
