package com.caridadja.studentroster.repositories;
import org.springframework.data.repository.CrudRepository;

import com.caridadja.studentroster.models.Address;
public interface AddressRepository extends CrudRepository<Address, Long>{
	Address getAddressByStudentId(Long id);
}
