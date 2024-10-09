package com.project_module_iii.project_BookingCabMS.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_module_iii.project_BookingCabMS.dao.CabRepository;
import com.project_module_iii.project_BookingCabMS.model.Cab;

@Service
public class CabServiceImpl implements CabService{

	
	@Autowired
	private CabRepository cabRepository;

	@Override
	public Cab bookCab(Cab cab) {
		// TODO Auto-generated method stub
		return cabRepository.save(cab); 
	}

	@Override
	public Optional<Cab> getCabById(Integer id) {
		// TODO Auto-generated method stub
		return cabRepository.findById(id); 
	}

	@Override
	public List<Cab> getAllBookedCabs() {
		return new ArrayList<Cab>((Collection<? extends Cab>) cabRepository.findAll());
	
	}

	@Override
	public void deleteCab(Integer id) {
		 cabRepository.deleteById(id);
		
	} 
}
