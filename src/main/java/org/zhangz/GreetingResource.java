package org.zhangz;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RunOnVirtualThread
    public String hello() {
        System.out.println("Hello from RESTEasy Reactive: " + Thread.currentThread());
        return "Hello from RESTEasy Reactive By VirtualThread";
    }
}
