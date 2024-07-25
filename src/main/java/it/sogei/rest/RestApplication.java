package it.sogei.rest;

import it.sogei.rest.endpoint.QueryAPIResource;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
@Slf4j
public class RestApplication extends Application {

    public RestApplication() {
        log.info("RestApplication initialized.");
    }
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(QueryAPIResource.class);
        return classes;
    }

}