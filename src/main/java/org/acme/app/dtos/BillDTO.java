package org.acme.app.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillDTO {
    private String nameAppliance;
    private Integer daysUseAppliance;
    private Integer hoursUseAppliance;
    private String appliancePotency;
}
