package com.macys.marketing.store.admin.tool.config;

import com.macys.marketing.store.admin.tool.resources.StoreAdminResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        System.out.println("Register end-point");
        registerEndpoints();
    }
    private void registerEndpoints() {
        register(StoreAdminResource.class);
    }

}
