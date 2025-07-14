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

/**
 * End time for the instance.
 **/
@ApiModel(description = "End time for the instance.")
@JsonTypeName("_instance__siUUID__schedule_get_200_response_end")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceSiUUIDScheduleGet200ResponseEnd   {
  private Integer nano;
  private Integer epochSecond;

  public InstanceSiUUIDScheduleGet200ResponseEnd() {
  }

  /**
   **/
  public InstanceSiUUIDScheduleGet200ResponseEnd nano(Integer nano) {
    this.nano = nano;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nano")
  public Integer getNano() {
    return nano;
  }

  @JsonProperty("nano")
  public void setNano(Integer nano) {
    this.nano = nano;
  }

  /**
   **/
  public InstanceSiUUIDScheduleGet200ResponseEnd epochSecond(Integer epochSecond) {
    this.epochSecond = epochSecond;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("epochSecond")
  public Integer getEpochSecond() {
    return epochSecond;
  }

  @JsonProperty("epochSecond")
  public void setEpochSecond(Integer epochSecond) {
    this.epochSecond = epochSecond;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSiUUIDScheduleGet200ResponseEnd instanceSiUUIDScheduleGet200ResponseEnd = (InstanceSiUUIDScheduleGet200ResponseEnd) o;
    return Objects.equals(this.nano, instanceSiUUIDScheduleGet200ResponseEnd.nano) &&
        Objects.equals(this.epochSecond, instanceSiUUIDScheduleGet200ResponseEnd.epochSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nano, epochSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSiUUIDScheduleGet200ResponseEnd {\n");
    
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("    epochSecond: ").append(toIndentedString(epochSecond)).append("\n");
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

