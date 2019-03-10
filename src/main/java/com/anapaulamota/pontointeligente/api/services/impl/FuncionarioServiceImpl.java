package com.anapaulamota.pontointeligente.api.services.impl;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anapaulamota.pontointeligente.api.entities.Funcionario;
import com.anapaulamota.pontointeligente.api.repositories.FuncionarioRepository;
import com.anapaulamota.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario persistir(Funcionario funcionario) {
		log.info("FuncionarioServiceImpl>>persistir: Persistindo funcionário: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}
	
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("FuncionarioServiceImpl>>buscarPorCpf: Buscando funcionário pelo CPF {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}
	
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("FuncionarioServiceImpl>>buscarPorEmail: Buscando funcionário pelo email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
	
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("FuncionarioServiceImpl: buscarPorId: Buscando funcionário pelo IDl {}", id);
		return this.funcionarioRepository.findById(id);
	}

}

