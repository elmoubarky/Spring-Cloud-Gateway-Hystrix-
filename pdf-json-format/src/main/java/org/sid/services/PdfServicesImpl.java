package org.sid.services;

import org.sid.dao.*;
import org.sid.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PdfServicesImpl implements IPdfServices{

    @Autowired
    private FluxGreleRepository fluxGreleRepository;
    @Autowired
    private ContextRepository contextRepository;
    @Autowired
    private BusinessDataRepository businessDataRepository;
    @Autowired
    private TechnicalHeaderBusinessDataRepository technicalrepo;
    @Autowired
    private CommonRepository commonRepository;


    @Override
    public void initFluxBrele() {
        System.out.println("--- debut initialisation des fluxBrele----");
        FluxGrele fluxGrele = new FluxGrele();
        fluxGrele.setName("Flux de Test");
        fluxGreleRepository.save(fluxGrele);
        System.out.println("--- fin initialisation des fluxBrele----");

    }

    @Override
    public void initContexte() {
        System.out.println("--- debut initialisation des Contexte----");
        //recuperer le fluxGrele
        FluxGrele fluxGrele = fluxGreleRepository.findAll().get(0);
        System.out.println("flux grele recuperer "+fluxGrele);
        System.out.println("id flux grele recuperer "+fluxGrele.getId());
        Context context = new Context();
        context.setCodeMaquette("AGREDEV000");
        context.setCentreProfit("GSC");
        context.setCodeApplication("SAGR");
        context.setState("TP");
        context.setIdentifiantUnique("AGREMRC001");
        context.setFluxGrele(fluxGrele);
        contextRepository.save(context);
        System.out.println("context = " + context);
        System.out.println("--- fin initialisation des Contexte----");

    }

    @Override
    public void initBusinessData() {

        System.out.println("--- debut initialisation des BusinessData----");
        //recuperer le fluxGrele
        FluxGrele fluxGrele = fluxGreleRepository.findAll().get(0);
        System.out.println("id flux grele recuperer "+fluxGrele.getId());
        System.out.println("flux grele recuperer "+fluxGrele);
        BusinessData businessData = new BusinessData();
        businessData.setE_tab_clause_contrat("y");
        businessData.setFluxGrele(fluxGrele);
        businessDataRepository.save(businessData);
        System.out.println("businessData = " + businessData);
        System.out.println("--- fin initialisation des BusinessData----");
    }

    @Override
    public void initTechnicalHeader() {

        System.out.println("--- debut initialisation des Technical----");
        //recuperer le fluxGrele
        FluxGrele fluxGrele = fluxGreleRepository.findAll().get(0);
        System.out.println("flux grele recuperer "+fluxGrele);
        System.out.println("id flux grele recuperer "+fluxGrele.getId());
        TechnicalHeaderbusinessData technical = new TechnicalHeaderbusinessData();
        technical.setLetter_code("AGREDEV000");
        technical.setLetter_object_number("AGREMRC001");
        technical.setFlow_generation_date("12/06/2019");
        technical.setBenefit_center_name("GNE");
        technical.setBenefit_center_code("GSC");
        technical.setAdministration_center_code("GSC");
        technical.setRegion_unit("GNE");
        technical.setSource_process_name("SMT");
        technical.setDate_traitement_og("12/06/2019");
        technical.setFluxGrele(fluxGrele);
        technicalrepo.save(technical);
        System.out.println("technical = " + technical);
        System.out.println("--- fin initialisation des Technical----");
    }

    @Override
    public void initCommon() {

        System.out.println("--- debut initialisation des Technical----");
        //recuperer le businessData
        BusinessData businessData = businessDataRepository.findAll().get(0);
        System.out.println("businessData = " + businessData);
        Common common = new Common();
        common.setType_doc("CP");
        common.setBusinessData(businessData);
        commonRepository.save(common);
        System.out.println("common = " + common);
    }
}
