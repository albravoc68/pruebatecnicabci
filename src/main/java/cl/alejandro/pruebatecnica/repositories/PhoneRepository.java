package cl.alejandro.pruebatecnica.repositories;

import cl.alejandro.pruebatecnica.model.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Integer> {

}
