package application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Driving;
import application.repository.DrivingRepository;
import application.service.DrivingService;
@Service
public class JpaDrivingService implements DrivingService{
	@Autowired
	private DrivingRepository drivingRepository;
	@Override
	public List<Driving> findAll() {
		
		return drivingRepository.findAll();
	}

	@Override
	public Driving findOne(Long id) {
		
		return drivingRepository.findOne(id);
	}

	@Override
	public Driving save(Driving driving) {
		
		return drivingRepository.save(driving);
	}

	@Override
	public void delete(Long id) {
		drivingRepository.delete(id);
		
	}

	@Override
	public List<Driving> pretraga(Long idUser) {
		
		return drivingRepository.pretraga(idUser);
	}

}
