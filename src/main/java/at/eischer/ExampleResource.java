package at.eischer;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/sum")
public class ExampleResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public int hello(@QueryParam("a") int a, @QueryParam("b") int b) {
        return a + b;
    }
}
