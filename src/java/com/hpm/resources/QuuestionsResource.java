/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpm.resources;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author HPM2015
 */
@Path("/questions")
public class QuuestionsResource {
    com.hpm.app.Data data = new com.hpm.app.Data();
    @Context
    private UriInfo context;
   

    /**
     * Creates a new instance of QuuestionsResource
     */
    public QuuestionsResource() {
    }

    /**
     * Retrieves representation of an instance of com.hpm.resources.QuuestionsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        return "<html<body><h1>helloworld</body></html>";
    }

    /**
     * PUT method for updating or creating an instance of QuuestionsResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
