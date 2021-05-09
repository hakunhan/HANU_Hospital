package se2.hanu_hospital.util;

import java.time.LocalDateTime;

public interface TimeStamps {

    LocalDateTime getCreatedAt();
    void setCreatedAt(LocalDateTime time);

    LocalDateTime getUpdatedAt();
    void setUpdatedAt(LocalDateTime time);
}