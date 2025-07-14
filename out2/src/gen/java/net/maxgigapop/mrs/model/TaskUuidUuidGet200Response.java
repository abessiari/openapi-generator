package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A task stored within the SENSE orchestrator.
 **/
@ApiModel(description = "A task stored within the SENSE orchestrator.")
@JsonTypeName("_task_uuid__uuid__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class TaskUuidUuidGet200Response   {
  private BigDecimal id;
  private String uuid;
  private String taskClass;
  private String assigned;
  private Boolean archived;
  private String created;
  private String expires;
  private Object status = null;
  private String statusTime;
  private String statusMessage;
  private Object config;
  private Boolean expired;

  public TaskUuidUuidGet200Response() {
  }

  /**
   * Auto-generated ID.
   **/
  public TaskUuidUuidGet200Response id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Auto-generated ID.")
  @JsonProperty("id")
  @Valid public BigDecimal getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * The natural UUID of the task.
   **/
  public TaskUuidUuidGet200Response uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(example = "48ab0cfc-3f50-4c4e-8c34-463156760022", value = "The natural UUID of the task.")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The Java class that maps the task&#39;s configuration.
   **/
  public TaskUuidUuidGet200Response taskClass(String taskClass) {
    this.taskClass = taskClass;
    return this;
  }

  
  @ApiModelProperty(example = "net.maxgigapop.mrs.addon.janus.data.JANUSTaskConfig", value = "The Java class that maps the task's configuration.")
  @JsonProperty("taskClass")
  public String getTaskClass() {
    return taskClass;
  }

  @JsonProperty("taskClass")
  public void setTaskClass(String taskClass) {
    this.taskClass = taskClass;
  }

  /**
   * The assigned agent or application. This can be likened to a tag or queue/topic name.
   **/
  public TaskUuidUuidGet200Response assigned(String assigned) {
    this.assigned = assigned;
    return this;
  }

  
  @ApiModelProperty(example = "janus_device_manager", value = "The assigned agent or application. This can be likened to a tag or queue/topic name.")
  @JsonProperty("assigned")
  public String getAssigned() {
    return assigned;
  }

  @JsonProperty("assigned")
  public void setAssigned(String assigned) {
    this.assigned = assigned;
  }

  /**
   * Whether the task has been archived.
   **/
  public TaskUuidUuidGet200Response archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the task has been archived.")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  @JsonProperty("archived")
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * The timestamp of the task&#39;s creation.
   **/
  public TaskUuidUuidGet200Response created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(example = "2024-11-06T19:58:18Z", value = "The timestamp of the task's creation.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the task&#39;s expiration.
   **/
  public TaskUuidUuidGet200Response expires(String expires) {
    this.expires = expires;
    return this;
  }

  
  @ApiModelProperty(example = "2025-01-08T00:04:17Z", value = "The timestamp of the task's expiration.")
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  @JsonProperty("expires")
  public void setExpires(String expires) {
    this.expires = expires;
  }

  /**
   **/
  public TaskUuidUuidGet200Response status(Object status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Object getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Object status) {
    this.status = status;
  }

  /**
   * The timestamp of the task&#39;s last status update.
   **/
  public TaskUuidUuidGet200Response statusTime(String statusTime) {
    this.statusTime = statusTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-11-09T14:12:45Z", value = "The timestamp of the task's last status update.")
  @JsonProperty("statusTime")
  public String getStatusTime() {
    return statusTime;
  }

  @JsonProperty("statusTime")
  public void setStatusTime(String statusTime) {
    this.statusTime = statusTime;
  }

  /**
   * An optional message or JSON string to attach to any status update.
   **/
  public TaskUuidUuidGet200Response statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  
  @ApiModelProperty(example = "{\"callbackURL\": \"random_url\"}", value = "An optional message or JSON string to attach to any status update.")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  @JsonProperty("statusMessage")
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * The immutable configuration of the task itself.
   **/
  public TaskUuidUuidGet200Response config(Object config) {
    this.config = config;
    return this;
  }

  
  @ApiModelProperty(example = "{\"command\":\"add_user\",\"target\":\"nrp-04.nrp-nautilus.io\",\"principal\":\"admin\",\"context\":\"b4c48872-8266-471e-ad47-903c6d447ec6\"}", value = "The immutable configuration of the task itself.")
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(Object config) {
    this.config = config;
  }

  /**
   * Whether the task has expired.
   **/
  public TaskUuidUuidGet200Response expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the task has expired.")
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }

  @JsonProperty("expired")
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUuidUuidGet200Response taskUuidUuidGet200Response = (TaskUuidUuidGet200Response) o;
    return Objects.equals(this.id, taskUuidUuidGet200Response.id) &&
        Objects.equals(this.uuid, taskUuidUuidGet200Response.uuid) &&
        Objects.equals(this.taskClass, taskUuidUuidGet200Response.taskClass) &&
        Objects.equals(this.assigned, taskUuidUuidGet200Response.assigned) &&
        Objects.equals(this.archived, taskUuidUuidGet200Response.archived) &&
        Objects.equals(this.created, taskUuidUuidGet200Response.created) &&
        Objects.equals(this.expires, taskUuidUuidGet200Response.expires) &&
        Objects.equals(this.status, taskUuidUuidGet200Response.status) &&
        Objects.equals(this.statusTime, taskUuidUuidGet200Response.statusTime) &&
        Objects.equals(this.statusMessage, taskUuidUuidGet200Response.statusMessage) &&
        Objects.equals(this.config, taskUuidUuidGet200Response.config) &&
        Objects.equals(this.expired, taskUuidUuidGet200Response.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, taskClass, assigned, archived, created, expires, status, statusTime, statusMessage, config, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUuidUuidGet200Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    taskClass: ").append(toIndentedString(taskClass)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusTime: ").append(toIndentedString(statusTime)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

