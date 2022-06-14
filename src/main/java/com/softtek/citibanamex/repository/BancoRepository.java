package com.softtek.citibanamex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.citibanamex.entity.Banco;

public interface BancoRepository extends JpaRepository<Banco, Long> {

}
