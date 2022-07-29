package br.com.ztech.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ztech.crud.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{


}
