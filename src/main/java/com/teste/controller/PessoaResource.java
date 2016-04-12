package com.teste.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teste.model.Pessoa;
import com.teste.service.PessoaService;

@Path("/pessoa")
public class PessoaResource {
	
	Pessoa pessoa;

	@GET
	@Path("/pessoa")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPessoas() {
		return "fred";
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa getPessoa(@PathParam("id") Integer id) {
		
		Pessoa pessoa = new PessoaService().getPessoa(id);
		
		return pessoa;
	}
}
