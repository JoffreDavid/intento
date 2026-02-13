package uce.edu.web.api.examen.domain;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculo")
@SequenceGenerator(name = "vehiculo_sec", sequenceName = "vehiculo_secuencia", allocationSize = 1)
public class Vehiculo extends PanacheEntityBase{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehiculo_sec")
    public Integer id;
    public String  marca;
    public String chasis;
    public String  modelo;
    public LocalDateTime fechaFabricacion;
    public LocalDateTime fechaMatricual;
    

}
