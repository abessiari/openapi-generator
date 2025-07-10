package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import net.maxgigapop.mrs.model.MetaDomainNameGet200Response;
import net.maxgigapop.mrs.model.MetaDomainNamePostRequest;
import net.maxgigapop.mrs.model.SENSEMetadata;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy;
import net.maxgigapop.mrs.model.SENSEMetadataPolicy1;
import net.maxgigapop.mrs.model.SENSEMetadataUpdateDTO;

import java.util.List;
import net.maxgigapop.mrs.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public abstract class MetaApiService {
    public abstract Response metaDomainGet(String domain,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNameDelete(String domain,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNameGet(String domain,String name,Boolean full,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNamePolicyGet(String domain,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNamePolicyIdIdGet(String domain,String name,BigDecimal id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNamePolicyPost(String domain,String name,SENSEMetadataPolicy seNSEMetadataPolicy,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNamePost(String domain,String name,MetaDomainNamePostRequest metaDomainNamePostRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaDomainNameUpdatePut(String domain,String name,List<@Valid SENSEMetadataUpdateDTO> seNSEMetadataUpdateDTO,SecurityContext securityContext) throws NotFoundException;
    public abstract Response metaGet(SecurityContext securityContext) throws NotFoundException;
}
