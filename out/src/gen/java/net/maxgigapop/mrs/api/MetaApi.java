package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.MetaApiService;
import net.maxgigapop.mrs.api.factories.MetaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import net.maxgigapop.mrs.model.MetaDomainNameGet200Response;
import net.maxgigapop.mrs.model.MetaDomainNamePostRequest;
import net.maxgigapop.mrs.model.SENSEMetadata;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy1;
import net.maxgigapop.mrs.model.SENSEMetadataUpdateDTO;

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

@Path("/meta")


@io.swagger.annotations.Api(description = "the meta API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class MetaApi  {
   private final MetaApiService delegate;

   public MetaApi(@Context ServletConfig servletContext) {
      MetaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MetaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MetaApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = MetaApiServiceFactory.getMetaApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/{domain}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Domain Records", notes = "Retrieves all accessible metadata records under a specific domain.", response = Object.class, responseContainer = "List", tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of SENSE Metadata objects.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainGet(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainGet(domain, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{domain}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete a Record", notes = "Removes a metadata record from the service.", response = Void.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "An empty response.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNameDelete(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNameDelete(domain, name, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{domain}/{name}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a Record", notes = "Retrieves a specific metadata record value, or optionally the full record view.", response = MetaDomainNameGet200Response.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Either a full metadata object, or the value of the record parsed into JSON.", response = MetaDomainNameGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNameGet(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "Whether to return the full entity object instead of just the parsed JSON value.", defaultValue = "false") @DefaultValue("false") @QueryParam("full")  Boolean full,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNameGet(domain, name, full, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{domain}/{name}/policy")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Record Policies", notes = "Gets the list of associated policies with a metadata record.", response = Object.class, responseContainer = "List", tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of policy objects.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNamePolicyGet(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNamePolicyGet(domain, name, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{domain}/{name}/policy/id/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a Policy", notes = "Gets the a specific policy by its ID.", response = Object.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A single metadata policy object.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNamePolicyIdIdGet(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "The specified ID number of the policy.", required = true) @PathParam("id") @NotNull  BigDecimal id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNamePolicyIdIdGet(domain, name, id, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{domain}/{name}/policy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Register a Policy", notes = "Creates or updates a metadata policy against the specified record.", response = SENSEMetadataPolicy1.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A single metadata policy object.", response = SENSEMetadataPolicy1.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNamePolicyPost(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "A policy update request object.", required = true) @NotNull @Valid  SENSEMetadataPolicy seNSEMetadataPolicy,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNamePolicyPost(domain, name, seNSEMetadataPolicy, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{domain}/{name}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Register a Record", notes = "Creates or updates a metadata record with a new value object.", response = SENSEMetadata.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A full metadata object.", response = SENSEMetadata.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNamePost(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "The new JSON value for the record.", required = true) @NotNull @Valid  MetaDomainNamePostRequest metaDomainNamePostRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNamePost(domain, name, metaDomainNamePostRequest, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{domain}/{name}/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updates a Record", notes = "Updates a metadata record with updates to specific values.", response = Object.class, tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A full metadata object.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaDomainNameUpdatePut(@ApiParam(value = "The domain of the metadata record, representing which platform or third party it relates to.", required = true) @PathParam("domain") @NotNull  String domain,@ApiParam(value = "The registered name of the metadata record.", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "A JSON array of update objects.", required = true) @NotNull @Valid  List<@Valid SENSEMetadataUpdateDTO> seNSEMetadataUpdateDTO,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaDomainNameUpdatePut(domain, name, seNSEMetadataUpdateDTO, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get All Records", notes = "Retrieves all accessible metadata records.", response = Object.class, responseContainer = "List", tags={ "metadata", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of SENSE Metadata objects.", response = Object.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server fault or standardized error response.", response = Void.class)
    })
    public Response metaGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.metaGet(securityContext);
    }
}
