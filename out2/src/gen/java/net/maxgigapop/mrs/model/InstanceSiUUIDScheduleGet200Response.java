package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.maxgigapop.mrs.model.InstanceSiUUIDScheduleGet200ResponseEnd;
import net.maxgigapop.mrs.model.InstanceSiUUIDScheduleGet200ResponseStart;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("_instance__siUUID__schedule_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceSiUUIDScheduleGet200Response   {
  private String label;
  private InstanceSiUUIDScheduleGet200ResponseStart start;
  private InstanceSiUUIDScheduleGet200ResponseEnd end;
  private Boolean active;

  public InstanceSiUUIDScheduleGet200Response() {
  }

  @JsonCreator
  public InstanceSiUUIDScheduleGet200Response(
    @JsonProperty(required = true, value = "label") String label,
    @JsonProperty(required = true, value = "active") Boolean active
  ) {
    this.label = label;
    this.active = active;
  }

  /**
   * The reference label given to the schedule.
   **/
  public InstanceSiUUIDScheduleGet200Response label(String label) {
    this.label = label;
    return this;
  }

  
  @ApiModelProperty(example = "[\"urn:ogf:network:stackvtest:2022:topology:switch:EVTS.A-GOLE:conn+12bc9d51-2ddd-4189-b622-c02978f47fe5:vt+l2-policy-ONSA_Pilot_Conn:vlan+1855\"]", required = true, value = "The reference label given to the schedule.")
  @JsonProperty(required = true, value = "label")
  @NotNull public String getLabel() {
    return label;
  }

  @JsonProperty(required = true, value = "label")
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  public InstanceSiUUIDScheduleGet200Response start(InstanceSiUUIDScheduleGet200ResponseStart start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  @Valid public InstanceSiUUIDScheduleGet200ResponseStart getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(InstanceSiUUIDScheduleGet200ResponseStart start) {
    this.start = start;
  }

  /**
   **/
  public InstanceSiUUIDScheduleGet200Response end(InstanceSiUUIDScheduleGet200ResponseEnd end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  @Valid public InstanceSiUUIDScheduleGet200ResponseEnd getEnd() {
    return end;
  }

  @JsonProperty("end")
  public void setEnd(InstanceSiUUIDScheduleGet200ResponseEnd end) {
    this.end = end;
  }

  /**
   * Whether the connection is active.
   **/
  public InstanceSiUUIDScheduleGet200Response active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether the connection is active.")
  @JsonProperty(required = true, value = "active")
  @NotNull public Boolean getActive() {
    return active;
  }

  @JsonProperty(required = true, value = "active")
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSiUUIDScheduleGet200Response instanceSiUUIDScheduleGet200Response = (InstanceSiUUIDScheduleGet200Response) o;
    return Objects.equals(this.label, instanceSiUUIDScheduleGet200Response.label) &&
        Objects.equals(this.start, instanceSiUUIDScheduleGet200Response.start) &&
        Objects.equals(this.end, instanceSiUUIDScheduleGet200Response.end) &&
        Objects.equals(this.active, instanceSiUUIDScheduleGet200Response.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, start, end, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSiUUIDScheduleGet200Response {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

