package app.repositories;

import app.models.Dress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DressRepository extends JpaRepository<Dress, Long>{

    @Query("SELECT d FROM Dress AS d ORDER BY d.name")
    List<Dress>findAll();

}
