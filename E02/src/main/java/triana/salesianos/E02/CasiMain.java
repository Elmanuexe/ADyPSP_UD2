package triana.salesianos.E02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import triana.salesianos.E02.model.Pais;
import triana.salesianos.E02.model.Producto;
import triana.salesianos.E02.repository.PaisRepository;
import triana.salesianos.E02.repository.ProductoRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class CasiMain {

    private final PaisRepository paisRepository;
    private final ProductoRepository productoRepository;

    @PostConstruct
    public void test(){
        Pais espana = Pais.builder()
                .nombre("Espana")
                .build();

        Producto jamon = Producto.builder()
                .nombre("Jamón Ibérico")
                .descripcion("Paleta de Jamón ibérico")
                .precio(150F)
                .imagen("abc")
                .build();

        paisRepository.save(espana);
        productoRepository.save(jamon);

        paisRepository
                .findAll()
                .forEach(System.out::println);

        productoRepository
                .findAll()
                .forEach(System.out::println);

    }
}
