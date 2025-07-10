package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import net.maxgigapop.mrs.model.InstanceSiUUIDDeltasGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDPluginsTypeGet200Response;
import net.maxgigapop.mrs.model.InstanceSiUUIDScheduleGet200Response;
import net.maxgigapop.mrs.model.Operation;
import net.maxgigapop.mrs.model.RootSchema;
import net.maxgigapop.mrs.model.ServiceRequest;

import java.util.List;
import net.maxgigapop.mrs.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public abstract class InstanceApiService {
    public abstract Response instanceGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSearchGet(String search,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSearchPost(String search,ServiceRequest serviceRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSearchStatusGet(String search,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDActionPut(String siUUID,Operation action,Boolean sync,Boolean verify,Boolean force,Boolean proceed,String intent,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDAliasPut(String siUUID,String alias,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDDeltasGet(String search,String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDDriftingCorrectPut(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDLastStatePut(String siUUID,String state,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDLockedModePut(String siUUID,Boolean mode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDModifiableModePut(String siUUID,Boolean mode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDModifyPost(String siUUID,ServiceRequest serviceRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDPluginsGet(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDPluginsTypeGet(String siUUID,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDPluginsTypePut(String siUUID,String type,Object body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDProfileGet(String search,String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDScheduleGet(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDStatusConfigurationGet(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDStatusPhaseGet(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDSubstatusGet(String siUUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response instanceSiUUIDSuperstateStatePut(String siUUID,String state,SecurityContext securityContext) throws NotFoundException;
}
