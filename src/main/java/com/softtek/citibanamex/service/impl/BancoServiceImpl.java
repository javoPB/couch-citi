package com.softtek.citibanamex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.citibanamex.entity.Banco;
import com.softtek.citibanamex.repository.BancoRepository;
import com.softtek.citibanamex.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService {
	
	@Autowired
	private BancoRepository bancoRepository;

	@Override
	public List<Banco> getListBancos() {
		// TODO Auto-generated method stub
		return bancoRepository.findAll();
	}

	@Override
	public Banco getBanco(long idBanco) {
		// TODO Auto-generated method stub
		return null;
	}

}
