package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This schema represents a structured reference to a service profile.
 **/
@ApiModel(description = "This schema represents a structured reference to a service profile.")
@JsonTypeName("ServiceProfileRef")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class ServiceProfileRef   {
  private String uuid;
  private @Valid Map<String, Object> params = new HashMap<>();

  public ServiceProfileRef() {
  }

  @JsonCreator
  public ServiceProfileRef(
    @JsonProperty(required = true, value = "uuid") String uuid
  ) {
    this.uuid = uuid;
  }

  /**
   * Profile UUID to lookup when reference resolves.
   **/
  public ServiceProfileRef uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(example = "d1898051-fcfa-4920-bb3b-7f5918194def", required = true, value = "Profile UUID to lookup when reference resolves.")
  @JsonProperty(required = true, value = "uuid")
  @NotNull public String getUuid() {
    return uuid;
  }

  @JsonProperty(required = true, value = "uuid")
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Profile options map for additional arguments or parameters.
   **/
  public ServiceProfileRef params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  
  @ApiModelProperty(value = "Profile options map for additional arguments or parameters.")
  @JsonProperty("params")
  public Map<String, Object> getParams() {
    return params;
  }

  @JsonProperty("params")
  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public ServiceProfileRef putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }

    this.params.put(key, paramsItem);
    return this;
  }

  public ServiceProfileRef removeParamsItem(String key) {
    if (this.params != null) {
      this.params.remove(key);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfileRef serviceProfileRef = (ServiceProfileRef) o;
    return Objects.equals(this.uuid, serviceProfileRef.uuid) &&
        Objects.equals(this.params, serviceProfileRef.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileRef {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

