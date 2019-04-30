package com.flo.good.sfgpetclinic.bootstrap;

import com.flo.good.sfgpetclinic.model.Owner;
import com.flo.good.sfgpetclinic.model.Vet;
import com.flo.good.sfgpetclinic.services.OwnerService;
import com.flo.good.sfgpetclinic.services.VetService;
import com.flo.good.sfgpetclinic.services.map.OwnerServiceMap;
import com.flo.good.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("Michael", "Weston");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner("Fionna", "Gone");
        owner2.setId(2L);
        ownerService.save(owner2);

        System.out.println("Loaded Owners......");

        Vet vet1 = new Vet("Sam", "Axe");
        vet1.setId(1L);
        vetService.save(vet1);

        Vet vet2 = new Vet("Wam", "Leek");
        vet2.setId(2L);
        vetService.save(vet2);

        System.out.println("Loaded Vets.......");
    }
}
