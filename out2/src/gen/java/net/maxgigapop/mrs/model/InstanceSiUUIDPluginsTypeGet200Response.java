package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("_instance__siUUID__plugins__type__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceSiUUIDPluginsTypeGet200Response   {
  private String instanceUUID;
  private String type;
  private Object value;

  public InstanceSiUUIDPluginsTypeGet200Response() {
  }

  @JsonCreator
  public InstanceSiUUIDPluginsTypeGet200Response(
    @JsonProperty(required = true, value = "instanceUUID") String instanceUUID,
    @JsonProperty(required = true, value = "type") String type,
    @JsonProperty(required = true, value = "value") Object value
  ) {
    this.instanceUUID = instanceUUID;
    this.type = type;
    this.value = value;
  }

  /**
   **/
  public InstanceSiUUIDPluginsTypeGet200Response instanceUUID(String instanceUUID) {
    this.instanceUUID = instanceUUID;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12bc9d51-2ddd-4189-b622-c02978f47fe5\"]", required = true, value = "")
  @JsonProperty(required = true, value = "instanceUUID")
  @NotNull public String getInstanceUUID() {
    return instanceUUID;
  }

  @JsonProperty(required = true, value = "instanceUUID")
  public void setInstanceUUID(String instanceUUID) {
    this.instanceUUID = instanceUUID;
  }

  /**
   **/
  public InstanceSiUUIDPluginsTypeGet200Response type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "[\"SCHEDULING\",\"DRIFTING\"]", required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull public String getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public InstanceSiUUIDPluginsTypeGet200Response value(Object value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "value")
  @NotNull public Object getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSiUUIDPluginsTypeGet200Response instanceSiUUIDPluginsTypeGet200Response = (InstanceSiUUIDPluginsTypeGet200Response) o;
    return Objects.equals(this.instanceUUID, instanceSiUUIDPluginsTypeGet200Response.instanceUUID) &&
        Objects.equals(this.type, instanceSiUUIDPluginsTypeGet200Response.type) &&
        Objects.equals(this.value, instanceSiUUIDPluginsTypeGet200Response.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceUUID, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSiUUIDPluginsTypeGet200Response {\n");
    
    sb.append("    instanceUUID: ").append(toIndentedString(instanceUUID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

