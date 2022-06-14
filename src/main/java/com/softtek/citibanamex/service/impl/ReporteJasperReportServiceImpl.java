package com.softtek.citibanamex.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.softtek.citibanamex.entity.Cuenta;
import com.softtek.citibanamex.repository.CuentaRepository;
import com.softtek.citibanamex.service.ReporteJasperReportService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReporteJasperReportServiceImpl implements ReporteJasperReportService {
	
	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public String exportReportCuentas(String reportFormat) {
		String path = "C:\\Softtek\\Proyectos\\CitiBanamex\\Accimarket\\citibanamex";
		
		// TODO Auto-generated method stub
		List<Cuenta> lstCuenta = cuentaRepository.findAll();
		
		//Load file and compile it
		File file;
		JasperReport jasperReport;
		try {
			file = ResourceUtils.getFile(".\\src\\main\\resources\\cuentas.jrxml");
			System.out.println("************************ " + file.getAbsolutePath());
			jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(lstCuenta);

			Map<String, Object> parameters = new HashMap<>();
			parameters.put("createdBy", "Softtek - Couch");
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			if( reportFormat.equalsIgnoreCase("html") ) {
				JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\cuentas.html");
			}
			if( reportFormat.equalsIgnoreCase("pdf") ) {
				JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\cuentas.pdf");
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Reporte generado en " + path;
	}

}
