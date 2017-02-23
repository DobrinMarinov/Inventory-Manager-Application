package app.services;

import app.models.Dress;

import java.util.List;

public interface DressService {

    List<Dress> findAll();
    Dress create(Dress dress);
    Dress edit(Dress dress);
    void deleteById(Long id);

}
