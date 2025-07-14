package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.maxgigapop.mrs.model.InstanceSiUUIDDeltasGet200ResponseSystem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("_instance__siUUID__deltas_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceSiUUIDDeltasGet200Response   {
  private Object service = null;
  private InstanceSiUUIDDeltasGet200ResponseSystem system;

  public InstanceSiUUIDDeltasGet200Response() {
  }

  /**
   **/
  public InstanceSiUUIDDeltasGet200Response service(Object service) {
    this.service = service;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service")
  public Object getService() {
    return service;
  }

  @JsonProperty("service")
  public void setService(Object service) {
    this.service = service;
  }

  /**
   **/
  public InstanceSiUUIDDeltasGet200Response system(InstanceSiUUIDDeltasGet200ResponseSystem system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("system")
  @Valid public InstanceSiUUIDDeltasGet200ResponseSystem getSystem() {
    return system;
  }

  @JsonProperty("system")
  public void setSystem(InstanceSiUUIDDeltasGet200ResponseSystem system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSiUUIDDeltasGet200Response instanceSiUUIDDeltasGet200Response = (InstanceSiUUIDDeltasGet200Response) o;
    return Objects.equals(this.service, instanceSiUUIDDeltasGet200Response.service) &&
        Objects.equals(this.system, instanceSiUUIDDeltasGet200Response.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSiUUIDDeltasGet200Response {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

