package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.maxgigapop.mrs.model.AddressAllocation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This schema represents the full DTO of an address pool.
 **/
@ApiModel(description = "This schema represents the full DTO of an address pool.")
@JsonTypeName("AddressRangeDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressRangeDTO   {
  private BigDecimal id;
  private String start;
  private String end;
  private @Valid List<@Valid AddressAllocation> allocations = new ArrayList<>();

  public AddressRangeDTO() {
  }

  @JsonCreator
  public AddressRangeDTO(
    @JsonProperty(required = true, value = "id") BigDecimal id,
    @JsonProperty(required = true, value = "start") String start,
    @JsonProperty(required = true, value = "end") String end,
    @JsonProperty(required = true, value = "allocations") List<@Valid AddressAllocation> allocations
  ) {
    this.id = id;
    this.start = start;
    this.end = end;
    this.allocations = allocations;
  }

  /**
   * Unique ID of the address pool.
   **/
  public AddressRangeDTO id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "19", required = true, value = "Unique ID of the address pool.")
  @JsonProperty(required = true, value = "id")
  @NotNull @Valid public BigDecimal getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * Beginning of the pool address range.
   **/
  public AddressRangeDTO start(String start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(example = "192.168.64.0", required = true, value = "Beginning of the pool address range.")
  @JsonProperty(required = true, value = "start")
  @NotNull public String getStart() {
    return start;
  }

  @JsonProperty(required = true, value = "start")
  public void setStart(String start) {
    this.start = start;
  }

  /**
   * End of the pool address range.
   **/
  public AddressRangeDTO end(String end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(example = "192.168.127.255", required = true, value = "End of the pool address range.")
  @JsonProperty(required = true, value = "end")
  @NotNull public String getEnd() {
    return end;
  }

  @JsonProperty(required = true, value = "end")
  public void setEnd(String end) {
    this.end = end;
  }

  /**
   **/
  public AddressRangeDTO allocations(List<@Valid AddressAllocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "allocations")
  @NotNull @Valid public List<@Valid AddressAllocation> getAllocations() {
    return allocations;
  }

  @JsonProperty(required = true, value = "allocations")
  public void setAllocations(List<@Valid AddressAllocation> allocations) {
    this.allocations = allocations;
  }

  public AddressRangeDTO addAllocationsItem(AddressAllocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<>();
    }

    this.allocations.add(allocationsItem);
    return this;
  }

  public AddressRangeDTO removeAllocationsItem(AddressAllocation allocationsItem) {
    if (allocationsItem != null && this.allocations != null) {
      this.allocations.remove(allocationsItem);
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
    AddressRangeDTO addressRangeDTO = (AddressRangeDTO) o;
    return Objects.equals(this.id, addressRangeDTO.id) &&
        Objects.equals(this.start, addressRangeDTO.start) &&
        Objects.equals(this.end, addressRangeDTO.end) &&
        Objects.equals(this.allocations, addressRangeDTO.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, allocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRangeDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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

