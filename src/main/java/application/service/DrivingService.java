package application.service;

import java.util.List;

import application.model.Driving;

public interface DrivingService {
	
	List<Driving> findAll();
	Driving findOne (Long id);
	Driving save (Driving driving);
	void delete (Long id);
	List<Driving> pretraga(Long idUser);
	
	
}
