package com.softtek.citibanamex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.citibanamex.entity.Banco;
import com.softtek.citibanamex.service.BancoService;

@RestController
public class BancoController {

	@Autowired
	private BancoService bancoService;
	
	@GetMapping(path = "/bancos", produces = "application/json")
	public List<Banco> getBancos(){
		List<Banco> lstBancos = bancoService.getListBancos();
		
		return lstBancos;
	}
}
