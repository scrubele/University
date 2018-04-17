package com.scrubele;

import com.scrubele.persistance.dao.BeautyProductDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/beautyproducts")
@SessionScoped
public class CosmeticDepartmentsService implements Serializable {
    public CosmeticDepartmentsService() {
    }

    private static final long serialVersionUID = 1L;

    @Inject
    private BeautyProductDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BeatyProduct getBeatyProduct(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeatyProduct(BeatyProduct beatyProduct) {

            dao.add(beatyProduct);

        return Response.status(200).entity("OK!").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteBeatyProduct(@PathParam("id") Integer id) {
        dao.delete(id);
        return Response.status(200).entity("OK!").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBeatyProduct(BeatyProduct beatyProduct) {
        dao.update(beatyProduct);
        return Response.status(200).entity("OK!").build();
    }
}