package com.iga.cursomc.resource;

import static com.iga.cursomc.resource.util.Constants.API;
import static com.iga.cursomc.resource.util.Constants.V1;
import static com.iga.cursomc.resource.util.Constants.CATEGORIAS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iga.cursomc.domain.Categoria;
import com.iga.cursomc.services.CategoriaService;

@RestController
@RequestMapping(API + V1 + CATEGORIAS)
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public List<Categoria> listar(){
//		Categoria cat1 = new Categoria(1, "Informática");
//		Categoria cat2 = new Categoria(2, "Escritório");
//		
//		List<Categoria> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		return lista;
//	}
}
