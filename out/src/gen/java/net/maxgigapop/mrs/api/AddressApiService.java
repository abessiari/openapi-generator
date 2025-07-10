package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import net.maxgigapop.mrs.model.AddressAllocationDTO;
import net.maxgigapop.mrs.model.AddressPoolACL;
import net.maxgigapop.mrs.model.AddressPoolDTO;
import net.maxgigapop.mrs.model.AllocationRequest;
import java.math.BigDecimal;
import net.maxgigapop.mrs.model.PoolRequest;

import java.util.List;
import net.maxgigapop.mrs.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public abstract class AddressApiService {
    public abstract Response addressAccessPoolDelete(BigDecimal pool,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAccessPoolGet(String pool,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAccessPoolNameUsernameDelete(String poolName,String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAccessPoolNameUsernameGet(String poolName,String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAccessPoolNameUsernameLevelPut(String poolName,String username,String level,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAllocatePoolNameAddressScopeDelete(String poolName,String address,String scope,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAllocatePoolNameGet(String poolName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAllocatePoolNamePost(String poolName,AllocationRequest allocationRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAllocatePoolNameScopeDelete(String poolName,String scope,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressAllocatePoolNameScopeGet(String poolName,String scope,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressPoolGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressPoolPoolNameDelete(String poolName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressPoolPoolNameGet(String poolName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addressPoolPost(PoolRequest poolRequest,SecurityContext securityContext) throws NotFoundException;
}
