package com.reza.simpleclinicpet.bootstrap;

import com.reza.simpleclinicpet.model.Owner;
import com.reza.simpleclinicpet.model.Vet;
import com.reza.simpleclinicpet.services.OwnerService;
import com.reza.simpleclinicpet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 =  new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jajah");
        owner1.setLastName("Hongko");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Karjak");
        owner2.setLastName("Pirance");

        ownerService.save(owner2);

        System.out.println("Owners Loaded . . .");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Tari");
        vet1.setLastName("Chacka");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Darka");
        vet2.setLastName("Koch");

        vetService.save(vet2);

        System.out.println("Vets Loaded . . .");

    }
}
