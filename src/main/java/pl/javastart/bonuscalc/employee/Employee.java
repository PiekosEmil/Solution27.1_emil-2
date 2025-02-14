package pl.javastart.bonuscalc.employee;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal baseSalary;

    private boolean isHired;

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }
}
