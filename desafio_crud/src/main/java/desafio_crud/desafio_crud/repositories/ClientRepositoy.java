package desafio_crud.desafio_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio_crud.desafio_crud.entities.Client;

public interface ClientRepositoy extends JpaRepository<Client, Long>{

}
