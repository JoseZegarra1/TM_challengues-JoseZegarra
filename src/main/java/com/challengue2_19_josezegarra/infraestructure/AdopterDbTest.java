package com.challengue2_19_josezegarra.infraestructure;

import com.challengue2_19_josezegarra.domain.Adopter;
import com.challengue2_19_josezegarra.domain.AdopterRepository;

public class AdopterDbTest implements AdopterRepository {
    @Override
    public Adopter save(Adopter adopter) {
        Adopter adopterResult = new Adopter();
        adopterResult.setId("1");
        adopterResult.setName("Jose");
        return adopterResult;
    }
}
