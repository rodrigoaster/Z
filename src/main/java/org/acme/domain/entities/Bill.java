package org.acme.domain.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bill extends PanacheEntity {
    private String nameAppliance;
    private Integer daysUseAppliance;
    private Integer hoursUseAppliance;
    private String appliancePotency;
}
