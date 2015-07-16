package com.hpm.resources;

import com.hpm.Answers;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
@Path("/webresources")
public class QuestionResource {
    com.hpm.Questions question = new com.hpm.Questions();
    @GET
    @Path("/com.hpm.questions")
    @Produces(MediaType.APPLICATION_JSON)      
    public Collection<Answers> read(@PathParam("id") long id) {
    return question.getAnswersCollection();
}
	
}
