package com.flo.good.sfgpetclinic.repositories;

import com.flo.good.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
