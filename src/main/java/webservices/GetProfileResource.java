package webservices;

import Model.Account;
import Model.Webshop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("profile/{email}")
public class GetProfileResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccount(@PathParam("email") String Email){
        for (Account Account : Webshop.getAllAccounts()){
            if (Account.getEmail() == Email){
                Response.ok(Email).build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}