package pl.javastart.bonuscalc.work;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.bonuscalc.employee.Employee;

import java.time.LocalDate;
import java.util.List;

@Table
public interface WorkDoneRepository extends JpaRepository<WorkDone, Long> {

    List<WorkDone> findByEmployeeAndDateBetween(Employee employee, LocalDate start, LocalDate end);

}
