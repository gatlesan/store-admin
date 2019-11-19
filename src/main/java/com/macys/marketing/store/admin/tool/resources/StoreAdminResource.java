package com.macys.marketing.store.admin.tool.resources;

import com.macys.marketing.store.admin.tool.domain.Event;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Component
@Path("/store/admin")
public class StoreAdminResource {

    @GET
    @Path("/getEvent")
    @Produces("application/json")
    public Event getAllUsers() {
        Event event = new Event();
        event.setEventId("12548");
        event.setEventName("Women shoes");
        return event;
    }

}
