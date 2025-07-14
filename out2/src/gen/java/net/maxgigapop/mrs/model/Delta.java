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

/**
 * A service delta package.
 **/
@ApiModel(description = "A service delta package.")
@JsonTypeName("Delta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class Delta   {
  private String id;
  private String val;

  public Delta() {
  }

  /**
   * Service intent UUID.
   **/
  public Delta id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "d2c27d84-7de4-4683-80f6-de9a3783f36d", value = "Service intent UUID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The service delta itself, in JSON string format.
   **/
  public Delta val(String val) {
    this.val = val;
    return this;
  }

  
  @ApiModelProperty(value = "The service delta itself, in JSON string format.")
  @JsonProperty("val")
  public String getVal() {
    return val;
  }

  @JsonProperty("val")
  public void setVal(String val) {
    this.val = val;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Delta delta = (Delta) o;
    return Objects.equals(this.id, delta.id) &&
        Objects.equals(this.val, delta.val);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, val);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
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

