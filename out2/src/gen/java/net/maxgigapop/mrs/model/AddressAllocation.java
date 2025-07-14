package net.maxgigapop.mrs.model;

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
 * This schema represents a specific address allocation.
 **/
@ApiModel(description = "This schema represents a specific address allocation.")
@JsonTypeName("AddressAllocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressAllocation   {
  private Long id;
  private String name;
  private String address;
  private BigDecimal expiry;
  private String scope;
  private String affiliate;

  public AddressAllocation() {
  }

  @JsonCreator
  public AddressAllocation(
    @JsonProperty(required = true, value = "id") Long id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "address") String address
  ) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  /**
   * Unique ID of the address allocation.
   **/
  public AddressAllocation id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "552", required = true, value = "Unique ID of the address allocation.")
  @JsonProperty(required = true, value = "id")
  @NotNull public Long getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the address allocation.
   **/
  public AddressAllocation name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Dev5 IP 6", required = true, value = "Name of the address allocation.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The address itself.
   **/
  public AddressAllocation address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "192.168.66.15", required = true, value = "The address itself.")
  @JsonProperty(required = true, value = "address")
  @NotNull public String getAddress() {
    return address;
  }

  @JsonProperty(required = true, value = "address")
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The address expiration timestamp.
   **/
  public AddressAllocation expiry(BigDecimal expiry) {
    this.expiry = expiry;
    return this;
  }

  
  @ApiModelProperty(example = "1698174979000", value = "The address expiration timestamp.")
  @JsonProperty("expiry")
  @Valid public BigDecimal getExpiry() {
    return expiry;
  }

  @JsonProperty("expiry")
  public void setExpiry(BigDecimal expiry) {
    this.expiry = expiry;
  }

  /**
   * The address scope.
   **/
  public AddressAllocation scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(example = "default", value = "The address scope.")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Name of the address allocation.
   **/
  public AddressAllocation affiliate(String affiliate) {
    this.affiliate = affiliate;
    return this;
  }

  
  @ApiModelProperty(example = "urn:ogf:network:nrp-nautilus.io:2020:sn3700_s0:PortChannel501:vlanport+3987", value = "Name of the address allocation.")
  @JsonProperty("affiliate")
  public String getAffiliate() {
    return affiliate;
  }

  @JsonProperty("affiliate")
  public void setAffiliate(String affiliate) {
    this.affiliate = affiliate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressAllocation addressAllocation = (AddressAllocation) o;
    return Objects.equals(this.id, addressAllocation.id) &&
        Objects.equals(this.name, addressAllocation.name) &&
        Objects.equals(this.address, addressAllocation.address) &&
        Objects.equals(this.expiry, addressAllocation.expiry) &&
        Objects.equals(this.scope, addressAllocation.scope) &&
        Objects.equals(this.affiliate, addressAllocation.affiliate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, expiry, scope, affiliate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressAllocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
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

