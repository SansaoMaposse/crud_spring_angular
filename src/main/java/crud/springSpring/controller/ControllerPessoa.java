package crud.springSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.springSpring.model.Pessoa;
import crud.springSpring.repository.PessoaRepository;

@RestController
@RequestMapping("/api/v1/")
public class ControllerPessoa {
	
	@Autowired
	private PessoaRepository controllerRepository;

	@GetMapping("/pessoas")
	public List<Pessoa> getAllPessoas(){
		return controllerRepository.findAll();
	}

	/*private List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
