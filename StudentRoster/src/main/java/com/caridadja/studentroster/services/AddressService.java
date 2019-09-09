package com.caridadja.studentroster.services;

import org.springframework.stereotype.Service;
import com.caridadja.studentroster.models.Address;
import com.caridadja.studentroster.repositories.AddressRepository;

@Service
public class AddressService {
	
	private AddressRepository addressRepository;
	
	private AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	public void addAddress(Address address) {
		addressRepository.save(address);
	}
}
