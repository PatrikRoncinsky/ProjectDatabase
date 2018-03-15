package io.dropwizard.archetypes;

import io.dropwizard.Application;
import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

import io.dropwizard.archetypes.resources.Post;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

        ;
public class serverApplication extends Application<serverConfiguration> {

    public static void main(final String[] args) throws Exception {
        new serverApplication().run(args);
    }

    @Override
    public String getName() {
        return "server";
    }

    @Override
    public void initialize(final Bootstrap<serverConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final serverConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(
                new Post());



        final FilterRegistration.Dynamic cors =
                environment.servlets().addFilter("CORS", CrossOriginFilter.class);
// Configure CORS parameters
        cors.setInitParameter("allowedOrigins", "*");
        cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
        cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");
        cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");



}}
