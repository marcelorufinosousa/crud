package br.com.ztech.crud.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ztech.crud.domain.Pessoa;
import br.com.ztech.crud.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
	@Autowired 
	private PessoaService pessoaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> buscarPorId (@PathVariable Long id){
		return ResponseEntity.ok().body(pessoaService.buscar(id));
	}
	@PostMapping
	public ResponseEntity<Pessoa> criarPessoa (@RequestBody Pessoa pessoa){
		  pessoaService.criar(pessoa);
		 return ResponseEntity.ok().body(pessoa);
		 
	}
	@DeleteMapping(value = "/{id}")
	public void delete (@PathVariable Long id){
		pessoaService.deletar(id);
	}

}
