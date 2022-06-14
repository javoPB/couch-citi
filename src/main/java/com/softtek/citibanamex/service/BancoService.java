package com.softtek.citibanamex.service;

import java.util.List;

import com.softtek.citibanamex.entity.Banco;

public interface BancoService {
	List<Banco> getListBancos();
	Banco getBanco(long idBanco);
}
