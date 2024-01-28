package org.acme.infra.controllers;

import org.acme.app.dtos.BillDTO;
import org.acme.app.dtos.response.DefaultResponseDTO;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/bill")
public class BillRestController {
    @POST
    @Path("/create")
    public DefaultResponseDTO createBill(BillDTO billDTO) {
        return null;
    }
}
