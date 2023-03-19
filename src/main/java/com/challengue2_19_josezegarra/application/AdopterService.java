package com.challengue2_19_josezegarra.application;

import com.challengue2_19_josezegarra.domain.Adopter;
import com.challengue2_19_josezegarra.domain.AdopterRepository;

public class AdopterService {
    AdopterRepository adopterRepository;

    public AdopterService(AdopterRepository adopterRepository){
        this.adopterRepository = adopterRepository;
    }

    public Adopter saAdopter(Adopter adopter){
        return adopterRepository.save(adopter);
    }

}
