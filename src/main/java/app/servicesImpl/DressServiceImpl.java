package app.servicesImpl;

import app.models.Dress;
import app.repositories.DressRepository;
import app.services.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressServiceImpl implements DressService{

    @Autowired
    private DressRepository dressRepository;

    @Override
    public List<Dress> findAll() {
        return this.dressRepository.findAll();
    }

    @Override
    public Dress create(Dress dress) {
        return this.dressRepository.save(dress);
    }

    @Override
    public Dress edit(Dress dress) {
        return this.dressRepository.save(dress);
    }

    @Override
    public void deleteById(Long id) {
        this.dressRepository.delete(id);
    }
}
