package com.softtek.citibanamex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.citibanamex.entity.Cuenta;
import com.softtek.citibanamex.repository.CuentaRepository;
import com.softtek.citibanamex.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Override
	public List<Cuenta> getCuentas() {
		// TODO Auto-generated method stub
		return cuentaRepository.findAll();
	}

	@Override
	public Cuenta getCuenta(long idCuenta) {
		// TODO Auto-generated method stub
		return cuentaRepository.getById(idCuenta);
	}

}
