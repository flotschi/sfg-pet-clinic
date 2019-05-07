package com.flo.good.sfgpetclinic.repositories;

import com.flo.good.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
