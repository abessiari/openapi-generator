package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.model.InlineObject;
import net.maxgigapop.mrs.model.SENSETaskUpdateDTO;
import net.maxgigapop.mrs.model.TaskUuidUuidGet200Response;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/task")
@Api(description = "the task API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public interface TaskApi {

    /**
     * Removes all tasks assigned to a specific agent.
     *
     * @param assigned The agent or application used as a task delineation.
     * @return A standard empty response, usually returned on update or creation requests.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/assigned/{assigned}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete assigned tasks", notes = "Removes all tasks assigned to a specific agent.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "A standard empty response, usually returned on update or creation requests.", response = InlineObject.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InlineObject taskAssignedAssignedDelete(@PathParam("assigned") @ApiParam("The agent or application used as a task delineation.") String assigned);


    /**
     * Queries all tasks assigned to a specific agent.
     *
     * @param assigned The agent or application used as a task delineation.
     * @param archived Whether to retrieve archived tasks as well.
     * @return List of task entities.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/assigned/{assigned}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve all assigned tasks", notes = "Queries all tasks assigned to a specific agent.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of task entities.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> taskAssignedAssignedGet(@PathParam("assigned") @ApiParam("The agent or application used as a task delineation.") String assigned,@QueryParam("archived") @DefaultValue("false")  @ApiParam("Whether to retrieve archived tasks as well.")  Boolean archived);


    /**
     * Removes a task by uuid.
     *
     * @param uuid The uuid of the requested task.
     * @return A standard empty response, usually returned on update or creation requests.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/uuid/{uuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a task", notes = "Removes a task by uuid.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "A standard empty response, usually returned on update or creation requests.", response = InlineObject.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InlineObject taskUuidUuidDelete(@PathParam("uuid") @ApiParam("The uuid of the requested task.") String uuid);


    /**
     * Queries a task by uuid.
     *
     * @param uuid The uuid of the requested task.
     * @return A task entity.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/uuid/{uuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve specific task", notes = "Queries a task by uuid.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A task entity.", response = TaskUuidUuidGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    TaskUuidUuidGet200Response taskUuidUuidGet(@PathParam("uuid") @ApiParam("The uuid of the requested task.") String uuid);


    /**
     * Updates a task via full update DTO.
     *
     * @param uuid The uuid of the requested task.
     * @param seNSETaskUpdateDTO A task update DTO.
     * @return A task entity.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/uuid/{uuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a task", notes = "Updates a task via full update DTO.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A task entity.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object taskUuidUuidPut(@PathParam("uuid") @ApiParam("The uuid of the requested task.") String uuid,@Valid @NotNull SENSETaskUpdateDTO seNSETaskUpdateDTO);


    /**
     * Updates a task's status and message.
     *
     * @param uuid The uuid of the requested task.
     * @param status The new status of the requested task.
     * @param body The new status message.
     * @return A task entity.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/uuid/{uuid}/{status}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a task status", notes = "Updates a task's status and message.", tags={ "task" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A task entity.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object taskUuidUuidStatusPut(@PathParam("uuid") @ApiParam("The uuid of the requested task.") String uuid,@PathParam("status") @ApiParam("The new status of the requested task.") String status,@Valid Object body);

}
