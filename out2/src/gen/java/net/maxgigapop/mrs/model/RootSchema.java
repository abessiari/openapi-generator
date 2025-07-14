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



@JsonTypeName("Root_Schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class RootSchema   {
  private String state;
  private Object superState = null;
  private Object subState = null;
  private Object configState = null;
  private Object lastState = null;
  private String lastError;
  private String alias;
  private String uuid;
  private String owner;
  private String timestamp;
  private String type;
  private String subType;
  private Boolean archived;
  private Boolean locked;
  private Boolean modifiable;
  private Object intents;
  private Boolean drifted;

  public RootSchema() {
  }

  /**
   * The concatenated phase and state string.
   **/
  public RootSchema state(String state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(example = "[\"CANCEL - READY\"]", value = "The concatenated phase and state string.")
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  public RootSchema superState(Object superState) {
    this.superState = superState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("superState")
  public Object getSuperState() {
    return superState;
  }

  @JsonProperty("superState")
  public void setSuperState(Object superState) {
    this.superState = superState;
  }

  /**
   **/
  public RootSchema subState(Object subState) {
    this.subState = subState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subState")
  public Object getSubState() {
    return subState;
  }

  @JsonProperty("subState")
  public void setSubState(Object subState) {
    this.subState = subState;
  }

  /**
   **/
  public RootSchema configState(Object configState) {
    this.configState = configState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configState")
  public Object getConfigState() {
    return configState;
  }

  @JsonProperty("configState")
  public void setConfigState(Object configState) {
    this.configState = configState;
  }

  /**
   **/
  public RootSchema lastState(Object lastState) {
    this.lastState = lastState;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastState")
  public Object getLastState() {
    return lastState;
  }

  @JsonProperty("lastState")
  public void setLastState(Object lastState) {
    this.lastState = lastState;
  }

  /**
   * The last error encountered by the instance.
   **/
  public RootSchema lastError(String lastError) {
    this.lastError = lastError;
    return this;
  }

  
  @ApiModelProperty(value = "The last error encountered by the instance.")
  @JsonProperty("lastError")
  public String getLastError() {
    return lastError;
  }

  @JsonProperty("lastError")
  public void setLastError(String lastError) {
    this.lastError = lastError;
  }

  /**
   * The instance alias.
   **/
  public RootSchema alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Stacktest 2\"]", value = "The instance alias.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * The UUID of the instance.
   **/
  public RootSchema uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(value = "The UUID of the instance.")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The username of the owner of the instance.
   **/
  public RootSchema owner(String owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(example = "[\"admin\"]", value = "The username of the owner of the instance.")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  @JsonProperty("owner")
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * The creation timestamp of the instance.
   **/
  public RootSchema timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(example = "[\"2023-07-03 10:39:10.0\"]", value = "The creation timestamp of the instance.")
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The service type of the instance.
   **/
  public RootSchema type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Dynamic Network Connection\"]", value = "The service type of the instance.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The subsype of the instance&#39;s service type.
   **/
  public RootSchema subType(String subType) {
    this.subType = subType;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Multi-Path P2P VLAN\"]", value = "The subsype of the instance's service type.")
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }

  @JsonProperty("subType")
  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   * Whether the instance is archived (hidden from default view).
   **/
  public RootSchema archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the instance is archived (hidden from default view).")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  @JsonProperty("archived")
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * Whether the instance is locked (prevents most operations).
   **/
  public RootSchema locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the instance is locked (prevents most operations).")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  @JsonProperty("locked")
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  /**
   * Whether the instance is modifiable (allows MODIFY operations).
   **/
  public RootSchema modifiable(Boolean modifiable) {
    this.modifiable = modifiable;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the instance is modifiable (allows MODIFY operations).")
  @JsonProperty("modifiable")
  public Boolean getModifiable() {
    return modifiable;
  }

  @JsonProperty("modifiable")
  public void setModifiable(Boolean modifiable) {
    this.modifiable = modifiable;
  }

  /**
   * The service intents that belong to the instance.
   **/
  public RootSchema intents(Object intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "The service intents that belong to the instance.")
  @JsonProperty("intents")
  public Object getIntents() {
    return intents;
  }

  @JsonProperty("intents")
  public void setIntents(Object intents) {
    this.intents = intents;
  }

  /**
   * Whether the instance has been marked as unstable (service is no longer confirmed as online or valid).
   **/
  public RootSchema drifted(Boolean drifted) {
    this.drifted = drifted;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the instance has been marked as unstable (service is no longer confirmed as online or valid).")
  @JsonProperty("drifted")
  public Boolean getDrifted() {
    return drifted;
  }

  @JsonProperty("drifted")
  public void setDrifted(Boolean drifted) {
    this.drifted = drifted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootSchema rootSchema = (RootSchema) o;
    return Objects.equals(this.state, rootSchema.state) &&
        Objects.equals(this.superState, rootSchema.superState) &&
        Objects.equals(this.subState, rootSchema.subState) &&
        Objects.equals(this.configState, rootSchema.configState) &&
        Objects.equals(this.lastState, rootSchema.lastState) &&
        Objects.equals(this.lastError, rootSchema.lastError) &&
        Objects.equals(this.alias, rootSchema.alias) &&
        Objects.equals(this.uuid, rootSchema.uuid) &&
        Objects.equals(this.owner, rootSchema.owner) &&
        Objects.equals(this.timestamp, rootSchema.timestamp) &&
        Objects.equals(this.type, rootSchema.type) &&
        Objects.equals(this.subType, rootSchema.subType) &&
        Objects.equals(this.archived, rootSchema.archived) &&
        Objects.equals(this.locked, rootSchema.locked) &&
        Objects.equals(this.modifiable, rootSchema.modifiable) &&
        Objects.equals(this.intents, rootSchema.intents) &&
        Objects.equals(this.drifted, rootSchema.drifted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, superState, subState, configState, lastState, lastError, alias, uuid, owner, timestamp, type, subType, archived, locked, modifiable, intents, drifted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootSchema {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    superState: ").append(toIndentedString(superState)).append("\n");
    sb.append("    subState: ").append(toIndentedString(subState)).append("\n");
    sb.append("    configState: ").append(toIndentedString(configState)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    modifiable: ").append(toIndentedString(modifiable)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    drifted: ").append(toIndentedString(drifted)).append("\n");
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

