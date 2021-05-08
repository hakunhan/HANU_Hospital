package se2.hanu_hospital.consumable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import se2.hanu_hospital.medical_procedure.MedicalProcedure;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Consumable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(4) UNSIGNED ", precision = 4, updatable = false)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private int quantity;
    @NotNull
    private int priceBought;
    @NotNull
    private int priceSell;

    @ManyToOne
    @JoinColumn(name = "medical_procedure_id")
    @JsonIgnore
    private MedicalProcedure medicalProcedure;

    @Column(nullable = false, updatable = false, insertable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(nullable = false, updatable = false, insertable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    public Consumable(Long id, String name, int quantity, int priceBought, int priceSell) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public Consumable() {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(int priceBought) {
        this.priceBought = priceBought;
    }

    public int getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(int priceSell) {
        this.priceSell = priceSell;
    }

    public MedicalProcedure getMedicalProcedure() {
        return medicalProcedure;
    }

    public void setMedicalProcedure(MedicalProcedure medicalProcedure) {
        this.medicalProcedure = medicalProcedure;
    }
}
