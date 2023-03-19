package com.challengue2_19_josezegarra.application;

import com.challengue2_19_josezegarra.domain.Adopter;
import com.challengue2_19_josezegarra.infraestructure.AdopterDbTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class AdopterServiceTest {
    @Test
    void saveAdopter(){
        AdopterDbTest adopterDbTest = new AdopterDbTest();
        AdopterService adopterService = new AdopterService(adopterDbTest);

        Adopter adopter = new Adopter();
        adopter.setName("Jose");
        assertEquals(adopterService.saAdopter(adopter), expectedAdopter());
    }

    private Adopter expectedAdopter(){
        Adopter adopter = new Adopter();
        adopter.setId("1");
        adopter.setName("Jose");
        return adopter;
    }
}
