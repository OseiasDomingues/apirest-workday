package com.dio.projectSpringBoot.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CompTime {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class CompTimeId implements Serializable{
        private long idCompTime;
        private long idMovement;
        private long idUser;
    }
    @EmbeddedId
    private CompTimeId id;
    private LocalDateTime workedHours;
    private BigDecimal numWorkedHours;
    private BigDecimal balanceWorkedHours;
}
