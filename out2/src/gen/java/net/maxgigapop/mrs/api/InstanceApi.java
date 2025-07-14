package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.model.InstanceSiUUIDDeltasGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDPluginsTypeGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDScheduleGet200Response;
import net.maxgigapop.mrs.model.Operation;
import net.maxgigapop.mrs.model.RootSchema;
import net.maxgigapop.mrs.model.ServiceRequest;

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
@Path("/instance")
@Api(description = "the instance API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public interface InstanceApi {

    /**
     * Retrieves UUID for new instance from backend.
     *
     * @return Generated UUID.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate random UUID", notes = "Retrieves UUID for new instance from backend.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Generated UUID.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceGet();


    /**
     * Retrieves the full status and details of a specified instance.
     *
     * @param search Service instance UUID or alias.
     * @return Full instance details object.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{search}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance details.", notes = "Retrieves the full status and details of a specified instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Full instance details object.", response = RootSchema.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    RootSchema instanceSearchGet(@PathParam("search") @ApiParam("Service instance UUID or alias.") String search);


    /**
     * Creates a new service instance with the given UUID and intent specification.
     *
     * @param search Service instance UUID.
     * @param serviceRequest Service instance creation request object.
     * @return Service instance UUID, in case it was generated during workflow.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/{search}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create new service instance", notes = "Creates a new service instance with the given UUID and intent specification.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Service instance UUID, in case it was generated during workflow.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceSearchPost(@PathParam("search") @ApiParam("Service instance UUID.") String search,@Valid @NotNull ServiceRequest serviceRequest);


    /**
     * Retrieves the full instance status.
     *
     * @param search Service instance UUID.
     * @return Concatenated instance superstate and substate.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{search}/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance status", notes = "Retrieves the full instance status.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Concatenated instance superstate and substate.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceSearchStatusGet(@PathParam("search") @ApiParam("Service instance UUID.") String search);


    /**
     * Commit an operation for specified service instance.
     *
     * @param siUUID service instance UUID
     * @param action Service operation requested  * &#x60;cancel&#x60; - Composite service to cancel, propagate, commit and verify instance.  * &#x60;release&#x60; - Composite service to cancel and propagate in 2-phase commit process.  * &#x60;verify&#x60; - Begin service verification process.
     * @param sync Whether to commit the operation in a synchronous/blocking mode.
     * @param verify Whether to ensure service verifiction is run, even in the case of failure states.
     * @param force Whether to commit the operations in force mode.
     * @param proceed Whether to automatically proceed through propagate and commit.
     * @param intent Explicit intent specified for certain operations.
     * @return No content response.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/{action}")
    @ApiOperation(value = "Operate on a service instance", notes = "Commit an operation for specified service instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDActionPut(@PathParam("siUUID") @ApiParam("service instance UUID") String siUUID,@PathParam("action") @ApiParam("Service operation requested  * &#x60;cancel&#x60; - Composite service to cancel, propagate, commit and verify instance.  * &#x60;release&#x60; - Composite service to cancel and propagate in 2-phase commit process.  * &#x60;verify&#x60; - Begin service verification process.") Operation action,@QueryParam("sync") @DefaultValue("true")  @ApiParam("Whether to commit the operation in a synchronous/blocking mode.")  Boolean sync,@QueryParam("verify") @DefaultValue("false")  @ApiParam("Whether to ensure service verifiction is run, even in the case of failure states.")  Boolean verify,@QueryParam("force") @DefaultValue("false")  @ApiParam("Whether to commit the operations in force mode.")  Boolean force,@QueryParam("proceed") @DefaultValue("true")  @ApiParam("Whether to automatically proceed through propagate and commit.")  Boolean proceed,@QueryParam("intent")  @ApiParam("Explicit intent specified for certain operations.")  String intent);


    /**
     * Changes the instance alias of a specified UUID.
     *
     * @param siUUID Service instance UUID.
     * @param alias New alias to set.
     * @return The new alias set to persistence.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/{alias}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Rename a service instance", notes = "Changes the instance alias of a specified UUID.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The new alias set to persistence.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceSiUUIDAliasPut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("alias") @ApiParam("New alias to set.") String alias);


    /**
     * Retrieves the currently cached system and service deltas.
     *
     * @param search Service instance UUID.
     * @param siUUID Service instance UUID.
     * @return JSON map with each delta, if present.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/deltas")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance deltas", notes = "Retrieves the currently cached system and service deltas.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "JSON map with each delta, if present.", response = InstanceSiUUIDDeltasGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InstanceSiUUIDDeltasGet200Response instanceSiUUIDDeltasGet(@PathParam("search") @ApiParam("Service instance UUID.") String search,@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Commits the appropriate correction operation for an instance.
     *
     * @param siUUID Service instance UUID.
     * @return Successful operation start.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/drifting/correct")
    @ApiOperation(value = "Correct a drifted instance", notes = "Commits the appropriate correction operation for an instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful operation start.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDDriftingCorrectPut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Overwrites the last state of the instance.
     *
     * @param siUUID Service instance UUID.
     * @param state New state.
     * @return Successful set.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/last/{state}")
    @ApiOperation(value = "Set instance last state", notes = "Overwrites the last state of the instance.", tags={ "instance", "admin" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDLastStatePut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("state") @ApiParam("New state.") String state);


    /**
     * Enables or disables the locked option for the instance.
     *
     * @param siUUID Service instance UUID.
     * @param mode New value.
     * @return Successful set.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/locked/{mode}")
    @ApiOperation(value = "Set instance locked flag", notes = "Enables or disables the locked option for the instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDLockedModePut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("mode") @ApiParam("New value.") Boolean mode);


    /**
     * Enables or disables the modifiable option for the instance.
     *
     * @param siUUID Service instance UUID.
     * @param mode New value.
     * @return Successful set.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/modifiable/{mode}")
    @ApiOperation(value = "Set instance modifiable flag", notes = "Enables or disables the modifiable option for the instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDModifiableModePut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("mode") @ApiParam("New value.") Boolean mode);


    /**
     * Composite service to modify/recompile, propagate, commit and verify (will create a new intent)
     *
     * @param siUUID service instance UUID
     * @param serviceRequest Service instance creation request object.
     * @return No content response.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/{siUUID}/modify")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Modify a service instance", notes = "Composite service to modify/recompile, propagate, commit and verify (will create a new intent)", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDModifyPost(@PathParam("siUUID") @ApiParam("service instance UUID") String siUUID,@Valid @NotNull ServiceRequest serviceRequest);


    /**
     * Retrieves the array of plugin configurations for an instance.
     *
     * @param siUUID Service instance UUID.
     * @return Array of plugin configuration objects.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/plugins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance plugins.", notes = "Retrieves the array of plugin configurations for an instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of plugin configuration objects.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> instanceSiUUIDPluginsGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Retrieves a specific plugin configuration for an instance.
     *
     * @param siUUID Service instance UUID.
     * @param type Service instance UUID.
     * @return Plugin configuration object.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/plugins/{type}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance plugin.", notes = "Retrieves a specific plugin configuration for an instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Plugin configuration object.", response = InstanceSiUUIDPluginsTypeGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InstanceSiUUIDPluginsTypeGet200Response instanceSiUUIDPluginsTypeGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("type") @ApiParam("Service instance UUID.") String type);


    /**
     * Sets a specific plugin configuration for an instance.
     *
     * @param siUUID Service instance UUID.
     * @param type Service instance UUID.
     * @param body New configuration value.
     * @return New configuration object.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/plugins/{type}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Set instance plugin.", notes = "Sets a specific plugin configuration for an instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "New configuration object.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object instanceSiUUIDPluginsTypePut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("type") @ApiParam("Service instance UUID.") String type,@Valid @NotNull Object body);


    /**
     * Retrieves the currently cached system and service deltas.
     *
     * @param search Service instance UUID.
     * @param siUUID Service instance UUID.
     * @return JSON map with each delta, if present.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/profile")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance deltas", notes = "Retrieves the currently cached system and service deltas.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "JSON map with each delta, if present.", response = InstanceSiUUIDDeltasGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InstanceSiUUIDDeltasGet200Response instanceSiUUIDProfileGet(@PathParam("search") @ApiParam("Service instance UUID.") String search,@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Retrieves the current scheduling information for an instance.
     *
     * @param siUUID Service instance UUID.
     * @return Schedule object.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/schedule")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance schedule", notes = "Retrieves the current scheduling information for an instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Schedule object.", response = InstanceSiUUIDScheduleGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    InstanceSiUUIDScheduleGet200Response instanceSiUUIDScheduleGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Retrieves the instance's configuration status.
     *
     * @param siUUID Service instance UUID.
     * @return Configuration status.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/status/configuration")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance configuration", notes = "Retrieves the instance's configuration status.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Configuration status.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceSiUUIDStatusConfigurationGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Retrieves the instance's orchestration phase.
     *
     * @param siUUID Service instance UUID.
     * @return Orchestration status.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/status/phase")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance phase", notes = "Retrieves the instance's orchestration phase.", tags={ "instance", "admin" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Orchestration status.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object instanceSiUUIDStatusPhaseGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Retrieves only the backend service status.
     *
     * @param siUUID Service instance UUID.
     * @return Workflow status.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{siUUID}/substatus")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get instance substatus", notes = "Retrieves only the backend service status.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Workflow status.", response = String.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    String instanceSiUUIDSubstatusGet(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID);


    /**
     * Updates the orchestration phase of the specified service instance.
     *
     * @param siUUID Service instance UUID.
     * @param state New orchestration phase.
     * @return No content response.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{siUUID}/superstate/{state}")
    @ApiOperation(value = "Change instance orchestration phase", notes = "Updates the orchestration phase of the specified service instance.", tags={ "instance" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void instanceSiUUIDSuperstateStatePut(@PathParam("siUUID") @ApiParam("Service instance UUID.") String siUUID,@PathParam("state") @ApiParam("New orchestration phase.") String state);

}
