package com.challengue2_19_josezegarra.rest;

import com.challengue2_19_josezegarra.application.AdopterService;
import com.challengue2_19_josezegarra.domain.Adopter;
import com.challengue2_19_josezegarra.domain.AdopterRepository;
import com.challengue2_19_josezegarra.infraestructure.AdopterOracle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AdopterController {

    @RestController
    @RequestMapping("/adopter")
    public class StudentController {

        // Oracle
        //Mysql
        AdopterRepository adopterRepository = new AdopterOracle();




        AdopterService adopterService = new AdopterService(adopterRepository);

        @PostMapping
        public Adopter saveAdopter() {
            Adopter adopter = new Adopter();
            adopter.setName("name");
            return adopterService.saAdopter(adopter);
        }
    }
}

