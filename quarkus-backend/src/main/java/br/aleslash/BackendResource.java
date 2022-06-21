package br.aleslash;

import br.aleslash.config.BackendConfig;
import org.jboss.resteasy.reactive.RestQuery;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/backend")
public class BackendResource {

    @Inject
    BackendConfig backendConfig;

    @GET
    public String server(@DefaultValue("1") @RestQuery int delay,
                         @DefaultValue("1") @RestQuery int payloadSizeKB) throws InterruptedException {
        Thread.sleep(delay);
        return "Teste " + payloadSizeKB + " - " + backendConfig.errorRate();
    }
}
