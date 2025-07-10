package net.maxgigapop.mrs.api;

import net.maxgigapop.mrs.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import net.maxgigapop.mrs.model.InlineObject;
import net.maxgigapop.mrs.model.SENSETaskUpdateDTO;
import net.maxgigapop.mrs.model.TaskUuidUuidGet200Response;

import java.util.List;
import net.maxgigapop.mrs.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public abstract class TaskApiService {
    public abstract Response taskAssignedAssignedDelete(String assigned,SecurityContext securityContext) throws NotFoundException;
    public abstract Response taskAssignedAssignedGet(String assigned,Boolean archived,SecurityContext securityContext) throws NotFoundException;
    public abstract Response taskUuidUuidDelete(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response taskUuidUuidGet(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response taskUuidUuidPut(String uuid,SENSETaskUpdateDTO seNSETaskUpdateDTO,SecurityContext securityContext) throws NotFoundException;
    public abstract Response taskUuidUuidStatusPut(String uuid,String status,Object body,SecurityContext securityContext) throws NotFoundException;
}
