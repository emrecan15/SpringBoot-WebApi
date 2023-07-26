package tr.edu.medipol.ilerijavafinal.ilerijavafinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.edu.medipol.ilerijavafinal.ilerijavafinal.entity.Misafir;

@Repository
public interface MisafirRepository extends JpaRepository<Misafir,Long> {
}
