package com.flo.good.sfgpetclinic.services;

import com.flo.good.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
