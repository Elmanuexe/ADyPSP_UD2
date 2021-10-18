package triana.salesianos.E02.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name ="name",length = 255)
    private String nombre;
    @Column(name ="price",nullable = false)
    private Float precio;
    @Column(name = "image")
    private String imagen;
    @Column(name = "description")
    private String descripcion;
}
