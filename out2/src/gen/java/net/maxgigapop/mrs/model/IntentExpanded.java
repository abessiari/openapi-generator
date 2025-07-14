package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.maxgigapop.mrs.model.Delta;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("IntentExpanded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class IntentExpanded   {
  private String id;
  private String serviceInstanceUUID;
  private String serviceDeltaUUID;
  private Boolean provisioned;
  private String json;
  private String creationTime;
  private Delta delta;

  public IntentExpanded() {
  }

  @JsonCreator
  public IntentExpanded(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "serviceInstanceUUID") String serviceInstanceUUID,
    @JsonProperty(required = true, value = "serviceDeltaUUID") String serviceDeltaUUID,
    @JsonProperty(required = true, value = "provisioned") Boolean provisioned,
    @JsonProperty(required = true, value = "json") String json
  ) {
    this.id = id;
    this.serviceInstanceUUID = serviceInstanceUUID;
    this.serviceDeltaUUID = serviceDeltaUUID;
    this.provisioned = provisioned;
    this.json = json;
  }

  /**
   * Service intent UUID.
   **/
  public IntentExpanded id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "d2c27d84-7de4-4683-80f6-de9a3783f36d", required = true, value = "Service intent UUID.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * UUID for associated service instance.
   **/
  public IntentExpanded serviceInstanceUUID(String serviceInstanceUUID) {
    this.serviceInstanceUUID = serviceInstanceUUID;
    return this;
  }

  
  @ApiModelProperty(example = "cfcfdc14-7f0d-4ab6-b325-719aa715f891", required = true, value = "UUID for associated service instance.")
  @JsonProperty(required = true, value = "serviceInstanceUUID")
  @NotNull public String getServiceInstanceUUID() {
    return serviceInstanceUUID;
  }

  @JsonProperty(required = true, value = "serviceInstanceUUID")
  public void setServiceInstanceUUID(String serviceInstanceUUID) {
    this.serviceInstanceUUID = serviceInstanceUUID;
  }

  /**
   * UUID for associated service delta.
   **/
  public IntentExpanded serviceDeltaUUID(String serviceDeltaUUID) {
    this.serviceDeltaUUID = serviceDeltaUUID;
    return this;
  }

  
  @ApiModelProperty(example = "00d6fab2-e117-40e8-adc7-ee1f60b71b3c", required = true, value = "UUID for associated service delta.")
  @JsonProperty(required = true, value = "serviceDeltaUUID")
  @NotNull public String getServiceDeltaUUID() {
    return serviceDeltaUUID;
  }

  @JsonProperty(required = true, value = "serviceDeltaUUID")
  public void setServiceDeltaUUID(String serviceDeltaUUID) {
    this.serviceDeltaUUID = serviceDeltaUUID;
  }

  /**
   * Whether or not the intent was or is successfully provisioned.
   **/
  public IntentExpanded provisioned(Boolean provisioned) {
    this.provisioned = provisioned;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether or not the intent was or is successfully provisioned.")
  @JsonProperty(required = true, value = "provisioned")
  @NotNull public Boolean getProvisioned() {
    return provisioned;
  }

  @JsonProperty(required = true, value = "provisioned")
  public void setProvisioned(Boolean provisioned) {
    this.provisioned = provisioned;
  }

  /**
   * The service intent itself, in JSON string format.
   **/
  public IntentExpanded json(String json) {
    this.json = json;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The service intent itself, in JSON string format.")
  @JsonProperty(required = true, value = "json")
  @NotNull public String getJson() {
    return json;
  }

  @JsonProperty(required = true, value = "json")
  public void setJson(String json) {
    this.json = json;
  }

  /**
   * SQL Timestamp for intent creation.
   **/
  public IntentExpanded creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(value = "SQL Timestamp for intent creation.")
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }

  @JsonProperty("creation_time")
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   **/
  public IntentExpanded delta(Delta delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delta")
  @Valid public Delta getDelta() {
    return delta;
  }

  @JsonProperty("delta")
  public void setDelta(Delta delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentExpanded intentExpanded = (IntentExpanded) o;
    return Objects.equals(this.id, intentExpanded.id) &&
        Objects.equals(this.serviceInstanceUUID, intentExpanded.serviceInstanceUUID) &&
        Objects.equals(this.serviceDeltaUUID, intentExpanded.serviceDeltaUUID) &&
        Objects.equals(this.provisioned, intentExpanded.provisioned) &&
        Objects.equals(this.json, intentExpanded.json) &&
        Objects.equals(this.creationTime, intentExpanded.creationTime) &&
        Objects.equals(this.delta, intentExpanded.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceInstanceUUID, serviceDeltaUUID, provisioned, json, creationTime, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentExpanded {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceInstanceUUID: ").append(toIndentedString(serviceInstanceUUID)).append("\n");
    sb.append("    serviceDeltaUUID: ").append(toIndentedString(serviceDeltaUUID)).append("\n");
    sb.append("    provisioned: ").append(toIndentedString(provisioned)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

