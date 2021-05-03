package se2.hanu_hospital.prescription;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findAllByNameContaining(String name);

    List<Prescription> findPrescriptionByRecordId(Long recordId);
}
