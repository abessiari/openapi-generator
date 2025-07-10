package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.AddressApiService;
import net.maxgigapop.mrs.api.factories.AddressApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import net.maxgigapop.mrs.model.AddressAllocationDTO;
import net.maxgigapop.mrs.model.AddressPoolACL;
import net.maxgigapop.mrs.model.AddressPoolDTO;
import net.maxgigapop.mrs.model.AllocationRequest;
import java.math.BigDecimal;
import net.maxgigapop.mrs.model.PoolRequest;

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

@Path("/address")


@io.swagger.annotations.Api(description = "the address API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressApi  {
   private final AddressApiService delegate;

   public AddressApi(@Context ServletConfig servletContext) {
      AddressApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AddressApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AddressApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AddressApiServiceFactory.getAddressApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.DELETE
    @Path("/access/{pool}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Clear Address Pool Access List", notes = "Deletes all ACLs associated with a specified address pool.", response = Void.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Deletion occurred without exception.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAccessPoolDelete(@ApiParam(value = "ID of the address pool.", required = true) @PathParam("pool") @NotNull  BigDecimal pool,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAccessPoolDelete(pool, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/access/{pool}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Address Pool Access List", notes = "Retrieves all ACLs from a specified address pool.", response = Object.class, responseContainer = "List", tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAccessPoolGet(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("pool") @NotNull  String pool,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAccessPoolGet(pool, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/access/{poolName}/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Address Pool Access List", notes = "Deletes the ACL associated with a specified address pool and user.", response = Object.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The ACL entry DTO.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 204, message = "Deletion not necessary. Entry not found.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAccessPoolNameUsernameDelete(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Username to assign permissions.", required = true) @PathParam("username") @NotNull  String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAccessPoolNameUsernameDelete(poolName, username, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/access/{poolName}/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Address Pool Access List", notes = "Retrieve the ACL entry for a specified address pool and user.", response = AddressPoolACL.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The ACL entry DTO.", response = AddressPoolACL.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAccessPoolNameUsernameGet(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Username to assign permissions.", required = true) @PathParam("username") @NotNull  String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAccessPoolNameUsernameGet(poolName, username, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/access/{poolName}/{username}/{level}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Address Pool Access List", notes = "Updates the ACL entry for a specified address pool and user.", response = Object.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated ACL entry DTO.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAccessPoolNameUsernameLevelPut(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Username to assign permissions.", required = true) @PathParam("username") @NotNull  String username,@ApiParam(value = "New permission level to set.", required = true) @PathParam("level") @NotNull  String level,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAccessPoolNameUsernameLevelPut(poolName, username, level, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/allocate/{poolName}/{address}/{scope}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Allocation", notes = "Remove a specific allocation.", response = Void.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Pool successfully deleted.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAllocatePoolNameAddressScopeDelete(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Specific address (or 'all' for every address in scope).", required = true) @PathParam("address") @NotNull  String address,@ApiParam(value = "Scope of the allocation.", required = true) @PathParam("scope") @NotNull  String scope,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAllocatePoolNameAddressScopeDelete(poolName, address, scope, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/allocate/{poolName}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Address Pool Allocations", notes = "Retrieves all allocations from a specified address pool.", response = AddressAllocationDTO.class, responseContainer = "List", tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressAllocationDTO.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAllocatePoolNameGet(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAllocatePoolNameGet(poolName, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/allocate/{poolName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Allocate Address", notes = "Allocates a new address from an address pool.", response = String.class, responseContainer = "List", tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of addresses allocated.", response = String.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAllocatePoolNamePost(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Allocation request parameters.", required = true) @NotNull @Valid  AllocationRequest allocationRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAllocatePoolNamePost(poolName, allocationRequest, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/allocate/{poolName}/{scope}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Allocations by Scope", notes = "Remove all allocations within a pool matching a specific scope.", response = Void.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Addresses successfully deleted.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAllocatePoolNameScopeDelete(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Scope of the allocations requested.", required = true) @PathParam("scope") @NotNull  String scope,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAllocatePoolNameScopeDelete(poolName, scope, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/allocate/{poolName}/{scope}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Address Pool Allocations by Scope", notes = "Retrieves all allocations from a specified address pool with a specific scope.", response = AddressAllocationDTO.class, responseContainer = "List", tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressAllocationDTO.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressAllocatePoolNameScopeGet(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@ApiParam(value = "Scope of the allocations requested.", required = true) @PathParam("scope") @NotNull  String scope,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressAllocatePoolNameScopeGet(poolName, scope, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/pool")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Pools", notes = "Retrieves all accessible address pools.", response = AddressPoolDTO.class, responseContainer = "List", tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressPoolDTO.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressPoolGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressPoolGet(securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/pool/{poolName}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Pool", notes = "Deletes a specific address pool.", response = Void.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Pool successfully deleted.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressPoolPoolNameDelete(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressPoolPoolNameDelete(poolName, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/pool/{poolName}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Pool", notes = "Retrieves a specific address pool.", response = AddressPoolDTO.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The address pool DTO.", response = AddressPoolDTO.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressPoolPoolNameGet(@ApiParam(value = "Name of the address pool.", required = true) @PathParam("poolName") @NotNull  String poolName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressPoolPoolNameGet(poolName, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/pool")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Add New Pool", notes = "Creates a new address pool.", response = Void.class, tags={ "address", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Pool created.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response addressPoolPost(@ApiParam(value = "Pool creation request parameters.", required = true) @NotNull @Valid  PoolRequest poolRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addressPoolPost(poolRequest, securityContext);
    }
}
