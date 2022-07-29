package br.com.ztech.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ztech.crud.domain.Pessoa;
import br.com.ztech.crud.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa buscar(Long id) {
		Optional<Pessoa> obj = pessoaRepository.findById(id);
		return obj.get();

	}

	public Pessoa criar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
    public void deletar(Long id) {
	   pessoaRepository.deleteById(id);
  }
}
