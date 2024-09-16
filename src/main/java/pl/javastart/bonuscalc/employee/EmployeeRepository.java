package pl.javastart.bonuscalc.employee;

import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

@Table
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
