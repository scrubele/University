package com.scrubele;

import javax.enterprise.context.SessionScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/beautyproducts")
@SessionScoped
public class CosmeticDepartmentsService implements Serializable{
    private static Map<Integer, BeatyProduct> beatyProductMap = new HashMap<>();
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final BeatyProduct getBeatyProduct(@PathParam("id") Integer id) {
        return beatyProductMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createBeatyProduct(BeatyProduct beatyProduct) {
        beatyProductMap.put(beatyProduct.getId(), beatyProduct);
        return Response.status(200).entity("OK!").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteBeatyProduct(@PathParam("id") Integer id) {
        beatyProductMap.remove(id);
        return Response.status(200).entity("OK!").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateBeatyProduct(BeatyProduct beatyProduct) {
        beatyProductMap.put(beatyProduct.getId(), beatyProduct);
        return Response.status(200).entity("OK!").build();
    }
}