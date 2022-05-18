package com.pessoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.service.PessoaFisicaInputModel;
import com.pessoa.service.PessoaFisicaModel;
import com.pessoa.service.PessoaService;

@RestController
@RequestMapping("/v1/PessoaFisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
				 produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PessoaFisicaDTO> create(@RequestBody PessoaFisicaInputDTO dto){
		PessoaFisicaInputModel model = new PessoaMapper().map(dto);
		PessoaFisicaModel modelCriado = this.pessoaService.criarPessoaFisica(model);
		PessoaFisicaDTO dtoResult = new PessoaMapper().map(modelCriado);
		return ResponseEntity.created(null).body(dtoResult);
	}
	
	@GetMapping()
	public List<PessoaFisicaDTO> getPessoas(@RequestParam(name = "str", required = true) String str, 
									        @RequestParam(name = "page", defaultValue = "1") Integer page, 
									        @RequestParam(name = "size", defaultValue = "10") Integer size){
 		List<PessoaFisicaModel> listModel = this.pessoaService.getPessoas(str, page, size);
		return new PessoaMapper().toList(listModel);
	}
	
}
