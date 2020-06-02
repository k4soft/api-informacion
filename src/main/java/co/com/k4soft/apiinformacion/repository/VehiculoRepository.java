package co.com.k4soft.apiinformacion.repository;


import co.com.k4soft.apiinformacion.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo,String> {
}
