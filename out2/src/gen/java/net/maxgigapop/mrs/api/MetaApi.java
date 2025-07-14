package net.maxgigapop.mrs.api;

import java.math.BigDecimal;
import net.maxgigapop.mrs.model.MetaDomainNameGet200Response;
import net.maxgigapop.mrs.model.MetaDomainNamePostRequest;
import net.maxgigapop.mrs.model.SENSEMetadata;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy1;
import net.maxgigapop.mrs.model.SENSEMetadataUpdateDTO;

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
@Path("/meta")
@Api(description = "the meta API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public interface MetaApi {

    /**
     * Retrieves all accessible metadata records under a specific domain.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @return List of SENSE Metadata objects.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{domain}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Domain Records", notes = "Retrieves all accessible metadata records under a specific domain.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of SENSE Metadata objects.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> metaDomainGet(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain);


    /**
     * Removes a metadata record from the service.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @return An empty response.
     * @return Internal server fault or standardized error response.
     */
    @DELETE
    @Path("/{domain}/{name}")
    @ApiOperation(value = "Delete a Record", notes = "Removes a metadata record from the service.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "An empty response.", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    void metaDomainNameDelete(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name);


    /**
     * Retrieves a specific metadata record value, or optionally the full record view.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @param full Whether to return the full entity object instead of just the parsed JSON value.
     * @return Either a full metadata object, or the value of the record parsed into JSON.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{domain}/{name}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a Record", notes = "Retrieves a specific metadata record value, or optionally the full record view.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Either a full metadata object, or the value of the record parsed into JSON.", response = MetaDomainNameGet200Response.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    MetaDomainNameGet200Response metaDomainNameGet(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name,@QueryParam("full") @DefaultValue("false")  @ApiParam("Whether to return the full entity object instead of just the parsed JSON value.")  Boolean full);


    /**
     * Gets the list of associated policies with a metadata record.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @return An array of policy objects.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{domain}/{name}/policy")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Record Policies", notes = "Gets the list of associated policies with a metadata record.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of policy objects.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> metaDomainNamePolicyGet(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name);


    /**
     * Gets the a specific policy by its ID.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @param id The specified ID number of the policy.
     * @return A single metadata policy object.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Path("/{domain}/{name}/policy/id/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a Policy", notes = "Gets the a specific policy by its ID.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A single metadata policy object.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object metaDomainNamePolicyIdIdGet(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name,@PathParam("id") @ApiParam("The specified ID number of the policy.") BigDecimal id);


    /**
     * Creates or updates a metadata policy against the specified record.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @param seNSEMetadataPolicy A policy update request object.
     * @return A single metadata policy object.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/{domain}/{name}/policy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Register a Policy", notes = "Creates or updates a metadata policy against the specified record.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A single metadata policy object.", response = SENSEMetadataPolicy1.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    SENSEMetadataPolicy1 metaDomainNamePolicyPost(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name,@Valid @NotNull SENSEMetadataPolicy seNSEMetadataPolicy);


    /**
     * Creates or updates a metadata record with a new value object.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @param metaDomainNamePostRequest The new JSON value for the record.
     * @return A full metadata object.
     * @return Internal server fault or standardized error response.
     */
    @POST
    @Path("/{domain}/{name}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Register a Record", notes = "Creates or updates a metadata record with a new value object.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A full metadata object.", response = SENSEMetadata.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    SENSEMetadata metaDomainNamePost(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name,@Valid MetaDomainNamePostRequest metaDomainNamePostRequest);


    /**
     * Updates a metadata record with updates to specific values.
     *
     * @param domain The domain of the metadata record, representing which platform or third party it relates to.
     * @param name The registered name of the metadata record.
     * @param seNSEMetadataUpdateDTO A JSON array of update objects.
     * @return A full metadata object.
     * @return Internal server fault or standardized error response.
     */
    @PUT
    @Path("/{domain}/{name}/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a Record", notes = "Updates a metadata record with updates to specific values.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A full metadata object.", response = Object.class),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class) })
    Object metaDomainNameUpdatePut(@PathParam("domain") @ApiParam("The domain of the metadata record, representing which platform or third party it relates to.") String domain,@PathParam("name") @ApiParam("The registered name of the metadata record.") String name,@Valid @NotNull List<@Valid SENSEMetadataUpdateDTO> seNSEMetadataUpdateDTO);


    /**
     * Retrieves all accessible metadata records.
     *
     * @return List of SENSE Metadata objects.
     * @return Internal server fault or standardized error response.
     */
    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get All Records", notes = "Retrieves all accessible metadata records.", tags={ "metadata" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of SENSE Metadata objects.", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class, responseContainer = "List") })
    List<Object> metaGet();

}
