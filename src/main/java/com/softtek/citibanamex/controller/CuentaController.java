package com.softtek.citibanamex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.citibanamex.entity.Cuenta;
import com.softtek.citibanamex.service.CuentaService;
import com.softtek.citibanamex.service.ReporteJasperReportService;

@RestController
public class CuentaController {
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private ReporteJasperReportService reporteJasperReportService;
	
	
	@GetMapping(path = "/cuentas", produces = "application/json")
	public List<Cuenta> getCuentas(){
		List<Cuenta> lstCuentas = cuentaService.getCuentas();
		
		return lstCuentas;
	}
	
	@GetMapping("/cuentas/reporte/{format}")
	public String generateReport(@PathVariable String format) {
		return reporteJasperReportService.exportReportCuentas(format);
	}
	
}
