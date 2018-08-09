package application.repository;

import org.springframework.stereotype.Repository;

import application.model.Customer;

@Repository
public interface CustomerRepository extends UserBaseRepository<Customer>{

}
