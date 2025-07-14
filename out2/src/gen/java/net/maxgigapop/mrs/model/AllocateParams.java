package net.maxgigapop.mrs.model;

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



@JsonTypeName("AllocateParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AllocateParams   {
  private String batch;
  private String exclusive;
  private String netmask;
  private String scope;

  public AllocateParams() {
  }

  /**
   **/
  public AllocateParams batch(String batch) {
    this.batch = batch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batch")
  public String getBatch() {
    return batch;
  }

  @JsonProperty("batch")
  public void setBatch(String batch) {
    this.batch = batch;
  }

  /**
   **/
  public AllocateParams exclusive(String exclusive) {
    this.exclusive = exclusive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exclusive")
  public String getExclusive() {
    return exclusive;
  }

  @JsonProperty("exclusive")
  public void setExclusive(String exclusive) {
    this.exclusive = exclusive;
  }

  /**
   **/
  public AllocateParams netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("netmask")
  public String getNetmask() {
    return netmask;
  }

  @JsonProperty("netmask")
  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  /**
   **/
  public AllocateParams scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateParams allocateParams = (AllocateParams) o;
    return Objects.equals(this.batch, allocateParams.batch) &&
        Objects.equals(this.exclusive, allocateParams.exclusive) &&
        Objects.equals(this.netmask, allocateParams.netmask) &&
        Objects.equals(this.scope, allocateParams.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch, exclusive, netmask, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateParams {\n");
    
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

