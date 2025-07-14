package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * The meta schema includes supporting information about the response, such as the request that it is responding to and the handling resource endpoint.
 **/
@ApiModel(description = "The meta schema includes supporting information about the response, such as the request that it is responding to and the handling resource endpoint.")
@JsonTypeName("inline_object_1_meta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InlineObject1Meta   {
  private @Valid Map<String, Object> request = new HashMap<>();
  private String resource;

  public InlineObject1Meta() {
  }

  @JsonCreator
  public InlineObject1Meta(
    @JsonProperty(required = true, value = "request") Map<String, Object> request
  ) {
    this.request = request;
  }

  /**
   * Metadata associated with the original request, such as path, method, and any form paremeters.
   **/
  public InlineObject1Meta request(Map<String, Object> request) {
    this.request = request;
    return this;
  }

  
  @ApiModelProperty(example = "{\"path\":\"https://localhost:8443/StackV-web/restapi/data/test\",\"method\":\"GET\",\"form\":\"{}\"}", required = true, value = "Metadata associated with the original request, such as path, method, and any form paremeters.")
  @JsonProperty(required = true, value = "request")
  @NotNull public Map<String, Object> getRequest() {
    return request;
  }

  @JsonProperty(required = true, value = "request")
  public void setRequest(Map<String, Object> request) {
    this.request = request;
  }

  public InlineObject1Meta putRequestItem(String key, Object requestItem) {
    if (this.request == null) {
      this.request = new HashMap<>();
    }

    this.request.put(key, requestItem);
    return this;
  }

  public InlineObject1Meta removeRequestItem(String key) {
    if (this.request != null) {
      this.request.remove(key);
    }

    return this;
  }
  /**
   * The resource endpoint that served this response.
   **/
  public InlineObject1Meta resource(String resource) {
    this.resource = resource;
    return this;
  }

  
  @ApiModelProperty(example = "net.maxgigapop.mrs.rest.KeycloakResource", value = "The resource endpoint that served this response.")
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  @JsonProperty("resource")
  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1Meta inlineObject1Meta = (InlineObject1Meta) o;
    return Objects.equals(this.request, inlineObject1Meta.request) &&
        Objects.equals(this.resource, inlineObject1Meta.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1Meta {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

