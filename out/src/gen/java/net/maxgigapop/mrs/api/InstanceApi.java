package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.InstanceApiService;
import net.maxgigapop.mrs.api.factories.InstanceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import net.maxgigapop.mrs.model.InstanceSiUUIDDeltasGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDPluginsTypeGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDScheduleGet200Response;
import net.maxgigapop.mrs.model.Operation;
import net.maxgigapop.mrs.model.RootSchema;
import net.maxgigapop.mrs.model.ServiceRequest;

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

@Path("/instance")


@io.swagger.annotations.Api(description = "the instance API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceApi  {
   private final InstanceApiService delegate;

   public InstanceApi(@Context ServletConfig servletContext) {
      InstanceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("InstanceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (InstanceApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = InstanceApiServiceFactory.getInstanceApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate random UUID", notes = "Retrieves UUID for new instance from backend.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Generated UUID.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceGet(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{search}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance details.", notes = "Retrieves the full status and details of a specified instance.", response = RootSchema.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Full instance details object.", response = RootSchema.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSearchGet(@ApiParam(value = "Service instance UUID or alias.", required = true) @PathParam("search") @NotNull  String search,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSearchGet(search, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{search}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create new service instance", notes = "Creates a new service instance with the given UUID and intent specification.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Service instance UUID, in case it was generated during workflow.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSearchPost(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("search") @NotNull  String search,@ApiParam(value = "Service instance creation request object.", required = true) @NotNull @Valid  ServiceRequest serviceRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSearchPost(search, serviceRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{search}/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance status", notes = "Retrieves the full instance status.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Concatenated instance superstate and substate.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSearchStatusGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("search") @NotNull  String search,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSearchStatusGet(search, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/{action}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Operate on a service instance", notes = "Commit an operation for specified service instance.", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDActionPut(@ApiParam(value = "service instance UUID", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "Service operation requested  * `cancel` - Composite service to cancel, propagate, commit and verify instance.  * `release` - Composite service to cancel and propagate in 2-phase commit process.  * `verify` - Begin service verification process.", required = true, allowableValues="cancel, force_cancel, release, force_release, provision, reinstate, rollback, force_retry, delete, force_delete, archive, unarchive, reset, verify, unverify") @PathParam("action") @NotNull  Operation action,@ApiParam(value = "Whether to commit the operation in a synchronous/blocking mode.", defaultValue = "true") @DefaultValue("true") @QueryParam("sync")  Boolean sync,@ApiParam(value = "Whether to ensure service verifiction is run, even in the case of failure states.", defaultValue = "false") @DefaultValue("false") @QueryParam("verify")  Boolean verify,@ApiParam(value = "Whether to commit the operations in force mode.", defaultValue = "false") @DefaultValue("false") @QueryParam("force")  Boolean force,@ApiParam(value = "Whether to automatically proceed through propagate and commit.", defaultValue = "true") @DefaultValue("true") @QueryParam("proceed")  Boolean proceed,@ApiParam(value = "Explicit intent specified for certain operations.") @QueryParam("intent")  String intent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDActionPut(siUUID, action, sync, verify, force, proceed, intent, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/{alias}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Rename a service instance", notes = "Changes the instance alias of a specified UUID.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The new alias set to persistence.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDAliasPut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "New alias to set.", required = true) @PathParam("alias") @NotNull  String alias,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDAliasPut(siUUID, alias, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/deltas")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance deltas", notes = "Retrieves the currently cached system and service deltas.", response = InstanceSiUUIDDeltasGet200Response.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "JSON map with each delta, if present.", response = InstanceSiUUIDDeltasGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDDeltasGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("search") @NotNull  String search,@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDDeltasGet(search, siUUID, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/drifting/correct")
    
    
    @io.swagger.annotations.ApiOperation(value = "Correct a drifted instance", notes = "Commits the appropriate correction operation for an instance.", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successful operation start.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDDriftingCorrectPut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDDriftingCorrectPut(siUUID, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/last/{state}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set instance last state", notes = "Overwrites the last state of the instance.", response = Void.class, tags={ "instance","admin", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDLastStatePut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "New state.", required = true) @PathParam("state") @NotNull  String state,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDLastStatePut(siUUID, state, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/locked/{mode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set instance locked flag", notes = "Enables or disables the locked option for the instance.", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDLockedModePut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "New value.", required = true) @PathParam("mode") @NotNull  Boolean mode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDLockedModePut(siUUID, mode, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/modifiable/{mode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set instance modifiable flag", notes = "Enables or disables the modifiable option for the instance.", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successful set.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDModifiableModePut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "New value.", required = true) @PathParam("mode") @NotNull  Boolean mode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDModifiableModePut(siUUID, mode, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{siUUID}/modify")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Modify a service instance", notes = "Composite service to modify/recompile, propagate, commit and verify (will create a new intent)", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDModifyPost(@ApiParam(value = "service instance UUID", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "Service instance creation request object.", required = true) @NotNull @Valid  ServiceRequest serviceRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDModifyPost(siUUID, serviceRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/plugins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance plugins.", notes = "Retrieves the array of plugin configurations for an instance.", response = Object.class, responseContainer = "List", tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array of plugin configuration objects.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDPluginsGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDPluginsGet(siUUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/plugins/{type}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance plugin.", notes = "Retrieves a specific plugin configuration for an instance.", response = InstanceSiUUIDPluginsTypeGet200Response.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Plugin configuration object.", response = InstanceSiUUIDPluginsTypeGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDPluginsTypeGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "Service instance UUID.", required = true) @PathParam("type") @NotNull  String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDPluginsTypeGet(siUUID, type, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/plugins/{type}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Set instance plugin.", notes = "Sets a specific plugin configuration for an instance.", response = Object.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "New configuration object.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDPluginsTypePut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "Service instance UUID.", required = true) @PathParam("type") @NotNull  String type,@ApiParam(value = "New configuration value.", required = true) @NotNull  Object body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDPluginsTypePut(siUUID, type, body, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/profile")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance deltas", notes = "Retrieves the currently cached system and service deltas.", response = InstanceSiUUIDDeltasGet200Response.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "JSON map with each delta, if present.", response = InstanceSiUUIDDeltasGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDProfileGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("search") @NotNull  String search,@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDProfileGet(search, siUUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/schedule")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance schedule", notes = "Retrieves the current scheduling information for an instance.", response = InstanceSiUUIDScheduleGet200Response.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Schedule object.", response = InstanceSiUUIDScheduleGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDScheduleGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDScheduleGet(siUUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/status/configuration")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance configuration", notes = "Retrieves the instance's configuration status.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Configuration status.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDStatusConfigurationGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDStatusConfigurationGet(siUUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/status/phase")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance phase", notes = "Retrieves the instance's orchestration phase.", response = Object.class, tags={ "instance","admin", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Orchestration status.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDStatusPhaseGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDStatusPhaseGet(siUUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{siUUID}/substatus")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get instance substatus", notes = "Retrieves only the backend service status.", response = String.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Workflow status.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDSubstatusGet(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDSubstatusGet(siUUID, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{siUUID}/superstate/{state}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Change instance orchestration phase", notes = "Updates the orchestration phase of the specified service instance.", response = Void.class, tags={ "instance", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "No content response.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response instanceSiUUIDSuperstateStatePut(@ApiParam(value = "Service instance UUID.", required = true) @PathParam("siUUID") @NotNull  String siUUID,@ApiParam(value = "New orchestration phase.", required = true, allowableValues="CREATE, CANCEL, REINSTATE, MODIFY") @PathParam("state") @NotNull  String state,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.instanceSiUUIDSuperstateStatePut(siUUID, state, securityContext);
    }
}
