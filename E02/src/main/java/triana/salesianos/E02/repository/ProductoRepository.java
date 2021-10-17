package triana.salesianos.E02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import triana.salesianos.E02.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
