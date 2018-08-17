package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Driving;
@Repository
public interface DrivingRepository extends JpaRepository<Driving, Long>{
	
	@Query("SELECT d FROM Driving d WHERE (:idUser is null or d.customer.id like :idUser or d.dispatcher.id like :idUser "
			+ "or d.driver.id like :idUser)")
			
	
	List<Driving> pretraga(@Param ("idUser")Long idUser);
}
