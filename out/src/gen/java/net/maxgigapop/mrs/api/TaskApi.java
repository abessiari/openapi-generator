package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.TaskApiService;
import net.maxgigapop.mrs.api.factories.TaskApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import net.maxgigapop.mrs.model.InlineObject;
import net.maxgigapop.mrs.model.SENSETaskUpdateDTO;
import net.maxgigapop.mrs.model.TaskUuidUuidGet200Response;

import java.util.Map;
import java.util.List;
import net.maxgigapop.mrs.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/task")


@io.swagger.annotations.Api(description = "the task API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class TaskApi  {
   private final TaskApiService delegate;

   public TaskApi(@Context ServletConfig servletContext) {
      TaskApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TaskApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TaskApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TaskApiServiceFactory.getTaskApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.DELETE
    @Path("/assigned/{assigned}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete assigned tasks", notes = "Removes all tasks assigned to a specific agent.", response = InlineObject.class, tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "A standard empty response, usually returned on update or creation requests.", response = InlineObject.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskAssignedAssignedDelete(@ApiParam(value = "The agent or application used as a task delineation.", required = true) @PathParam("assigned") @NotNull  String assigned,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskAssignedAssignedDelete(assigned, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/assigned/{assigned}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve all assigned tasks", notes = "Queries all tasks assigned to a specific agent.", response = Object.class, responseContainer = "List", tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of task entities.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskAssignedAssignedGet(@ApiParam(value = "The agent or application used as a task delineation.", required = true) @PathParam("assigned") @NotNull  String assigned,@ApiParam(value = "Whether to retrieve archived tasks as well.", defaultValue = "false") @DefaultValue("false") @QueryParam("archived")  Boolean archived,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskAssignedAssignedGet(assigned, archived, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/uuid/{uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a task", notes = "Removes a task by uuid.", response = InlineObject.class, tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "A standard empty response, usually returned on update or creation requests.", response = InlineObject.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskUuidUuidDelete(@ApiParam(value = "The uuid of the requested task.", required = true) @PathParam("uuid") @NotNull  String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskUuidUuidDelete(uuid, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/uuid/{uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve specific task", notes = "Queries a task by uuid.", response = TaskUuidUuidGet200Response.class, tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A task entity.", response = TaskUuidUuidGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskUuidUuidGet(@ApiParam(value = "The uuid of the requested task.", required = true) @PathParam("uuid") @NotNull  String uuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskUuidUuidGet(uuid, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/uuid/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a task", notes = "Updates a task via full update DTO.", response = Object.class, tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A task entity.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskUuidUuidPut(@ApiParam(value = "The uuid of the requested task.", required = true) @PathParam("uuid") @NotNull  String uuid,@ApiParam(value = "A task update DTO.", required = true) @NotNull @Valid  SENSETaskUpdateDTO seNSETaskUpdateDTO,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskUuidUuidPut(uuid, seNSETaskUpdateDTO, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/uuid/{uuid}/{status}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a task status", notes = "Updates a task's status and message.", response = Object.class, tags={ "task", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A task entity.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response taskUuidUuidStatusPut(@ApiParam(value = "The uuid of the requested task.", required = true) @PathParam("uuid") @NotNull  String uuid,@ApiParam(value = "The new status of the requested task.", required = true, allowableValues="PENDING, ACCEPTED, WAITING, FINISHED, FAILED") @PathParam("status") @NotNull  String status,@ApiParam(value = "The new status message.")  Object body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.taskUuidUuidStatusPut(uuid, status, body, securityContext);
    }
}
