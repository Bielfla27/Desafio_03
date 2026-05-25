package desafio_crud.desafio_crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio_crud.desafio_crud.services.ClientService;

@RestController
@RequestMapping(value  = "/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;
}
