package co.com.k4soft.apiinformacion.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "color")
    private String color;


}
