package EFPATRICIACA�ARI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import EFPATRICIACA�ARI.Model.PizzeriaDetalle;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaDetalle, Integer> {

}
