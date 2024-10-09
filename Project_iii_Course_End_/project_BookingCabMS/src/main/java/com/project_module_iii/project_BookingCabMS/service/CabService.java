package com.project_module_iii.project_BookingCabMS.service;

import java.util.List;
import java.util.Optional;

import com.project_module_iii.project_BookingCabMS.model.Cab;

public interface CabService {

	Cab bookCab(Cab cab);

	Optional<Cab> getCabById(Integer id);

	List<Cab> getAllBookedCabs();

	void deleteCab(Integer id);

}
