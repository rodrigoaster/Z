package org.acme.infra.repositories;

import org.acme.domain.entities.Bill;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BillRepository implements PanacheRepository<Bill> {      
}
