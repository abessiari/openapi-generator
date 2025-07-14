package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.model.AddressAllocation;
import net.maxgigapop.mrs.model.AddressPoolACL;
import net.maxgigapop.mrs.model.AddressPoolDTO;
import net.maxgigapop.mrs.model.AllocateAddressRequest;
import java.math.BigDecimal;
import net.maxgigapop.mrs.model.CreateAddressPoolRequest;

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
@Path("/address")
@Api(description = "the address API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public interface AddressApi {

    /**
     * Deletes all ACLs associated with a specified address pool.
     *
     * @param pool ID of the address pool.
     * @return Deletion occurred without exception.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/access/{pool}")
    @ApiOperation(value = "Clear Address Pool Access List", notes = "Deletes all ACLs associated with a specified address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deletion occurred without exception.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void addressAccessPoolDelete(@PathParam("pool") @ApiParam("ID of the address pool.") BigDecimal pool);


    /**
     * Retrieves all ACLs from a specified address pool.
     *
     * @param pool Name of the address pool.
     * @return List of basic address pool DTOs.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/access/{pool}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Address Pool Access List", notes = "Retrieves all ACLs from a specified address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> addressAccessPoolGet(@PathParam("pool") @ApiParam("Name of the address pool.") String pool);


    /**
     * Deletes the ACL associated with a specified address pool and user.
     *
     * @param poolName Name of the address pool.
     * @param username Username to assign permissions.
     * @return The ACL entry DTO.
     * @return Deletion not necessary. Entry not found.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/access/{poolName}/{username}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Address Pool Access List", notes = "Deletes the ACL associated with a specified address pool and user.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The ACL entry DTO.", response = Object.class),
        @ApiResponse(code = 204, message = "Deletion not necessary. Entry not found.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object addressAccessPoolNameUsernameDelete(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("username") @ApiParam("Username to assign permissions.") String username);


    /**
     * Retrieve the ACL entry for a specified address pool and user.
     *
     * @param poolName Name of the address pool.
     * @param username Username to assign permissions.
     * @return The ACL entry DTO.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/access/{poolName}/{username}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Address Pool Access List", notes = "Retrieve the ACL entry for a specified address pool and user.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The ACL entry DTO.", response = AddressPoolACL.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    AddressPoolACL addressAccessPoolNameUsernameGet(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("username") @ApiParam("Username to assign permissions.") String username);


    /**
     * Updates the ACL entry for a specified address pool and user.
     *
     * @param poolName Name of the address pool.
     * @param username Username to assign permissions.
     * @param level New permission level to set.
     * @return The updated ACL entry DTO.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/access/{poolName}/{username}/{level}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Address Pool Access List", notes = "Updates the ACL entry for a specified address pool and user.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated ACL entry DTO.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object addressAccessPoolNameUsernameLevelPut(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("username") @ApiParam("Username to assign permissions.") String username,@PathParam("level") @ApiParam("New permission level to set.") String level);


    /**
     * Remove a specific allocation.
     *
     * @param poolName Name of the address pool.
     * @param address Specific address (or &#39;all&#39; for every address in scope).
     * @param scope Scope of the allocation.
     * @return Pool successfully deleted.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/allocate/{poolName}/{address}/{scope}")
    @ApiOperation(value = "Delete Allocation", notes = "Remove a specific allocation.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Pool successfully deleted.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void addressAllocatePoolNameAddressScopeDelete(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("address") @ApiParam("Specific address (or &#39;all&#39; for every address in scope).") String address,@PathParam("scope") @ApiParam("Scope of the allocation.") String scope);


    /**
     * Retrieves all allocations from a specified address pool.
     *
     * @param poolName Name of the address pool.
     * @return List of basic address pool DTOs.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/allocate/{poolName}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Address Pool Allocations", notes = "Retrieves all allocations from a specified address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressAllocation.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<AddressAllocation> addressAllocatePoolNameGet(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName);


    /**
     * Allocates a new address from an address pool.
     *
     * @param poolName Name of the address pool.
     * @param allocateAddressRequest Allocation request parameters.
     * @return List of addresses allocated.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/allocate/{poolName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Allocate Address", notes = "Allocates a new address from an address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of addresses allocated.", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<String> addressAllocatePoolNamePost(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@Valid AllocateAddressRequest allocateAddressRequest);


    /**
     * Remove all allocations within a pool matching a specific scope.
     *
     * @param poolName Name of the address pool.
     * @param scope Scope of the allocations requested.
     * @return Addresses successfully deleted.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/allocate/{poolName}/{scope}")
    @ApiOperation(value = "Delete Allocations by Scope", notes = "Remove all allocations within a pool matching a specific scope.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Addresses successfully deleted.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void addressAllocatePoolNameScopeDelete(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("scope") @ApiParam("Scope of the allocations requested.") String scope);


    /**
     * Retrieves all allocations from a specified address pool with a specific scope.
     *
     * @param poolName Name of the address pool.
     * @param scope Scope of the allocations requested.
     * @return List of basic address pool DTOs.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/allocate/{poolName}/{scope}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Address Pool Allocations by Scope", notes = "Retrieves all allocations from a specified address pool with a specific scope.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressAllocation.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<AddressAllocation> addressAllocatePoolNameScopeGet(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName,@PathParam("scope") @ApiParam("Scope of the allocations requested.") String scope);


    /**
     * Deletes a specific address pool.
     *
     * @param poolName Name of the address pool.
     * @return Pool successfully deleted.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/pool/{poolName}")
    @ApiOperation(value = "Delete Pool", notes = "Deletes a specific address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Pool successfully deleted.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void addressPoolPoolNameDelete(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName);


    /**
     * Retrieves a specific address pool.
     *
     * @param poolName Name of the address pool.
     * @return The address pool DTO.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/pool/{poolName}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Pool", notes = "Retrieves a specific address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The address pool DTO.", response = AddressPoolDTO.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    AddressPoolDTO addressPoolPoolNameGet(@PathParam("poolName") @ApiParam("Name of the address pool.") String poolName);


    /**
     * Creates a new address pool.
     *
     * @param createAddressPoolRequest 
     * @return Pool created.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/pool")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Add New Pool", notes = "Creates a new address pool.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Pool created.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void createPool(@Valid CreateAddressPoolRequest createAddressPoolRequest);


    /**
     * Retrieves all accessible address pools.
     *
     * @return List of basic address pool DTOs.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/pool")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Pools", notes = "Retrieves all accessible address pools.", tags={ "address" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of basic address pool DTOs.", response = AddressPoolDTO.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<AddressPoolDTO> retrievePools();

}
