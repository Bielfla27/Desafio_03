package desafio_crud.desafio_crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio_crud.desafio_crud.repositories.ClientRepositoy;

@Service
public class ClientService {

	@Autowired
	private ClientRepositoy repositoy;
	
}
