package com.softtek.citibanamex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.citibanamex.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

}
