package org.sid;

import org.sid.entities.*;
import org.sid.services.IPdfServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class PdfJsonFormatApplication implements CommandLineRunner {
	@Autowired
	private IPdfServices iPdfServices;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(PdfJsonFormatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(FluxGrele.class, Context.class, BusinessData.class
		, TechnicalHeaderbusinessData.class, Common.class);
		iPdfServices.initFluxBrele();
		iPdfServices.initContexte();
		iPdfServices.initBusinessData();
		iPdfServices.initTechnicalHeader();
		iPdfServices.initCommon();


	}
}
