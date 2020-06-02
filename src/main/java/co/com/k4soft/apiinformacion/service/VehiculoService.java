package co.com.k4soft.apiinformacion.service;

import co.com.k4soft.apiinformacion.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {
    Vehiculo findById(String placa);

    void insert(Vehiculo vehiculo);

    void update(Vehiculo vehiculo, String placa);

    void delete(String placa);

    List<Vehiculo> findAll();
}
