package com.schrecknet.innovatsi.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.schrecknet.innovatsi.domain.Company;
import com.schrecknet.innovatsi.domain.Sector;
import com.schrecknet.innovatsi.repository.CompanyRepository;
import com.schrecknet.innovatsi.repository.SectorRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private CompanyRepository companyRepo;
	
	@Autowired
	private SectorRepository sectorRepo;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		companyRepo.deleteAll();
		sectorRepo.deleteAll();
		
		Company comglom = new Company(null, "Comglom-O", "258555666-85");
		
		companyRepo.save(comglom);
		
	}

}
