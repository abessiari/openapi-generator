package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import net.maxgigapop.mrs.model.AddressPoolDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This schema represents an access control configuration for an address pool.
 **/
@ApiModel(description = "This schema represents an access control configuration for an address pool.")
@JsonTypeName("Address_Pool_ACL")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressPoolACL   {
  private BigDecimal id;
  private AddressPoolDTO pool;
  private String username;
  private String level;

  public AddressPoolACL() {
  }

  @JsonCreator
  public AddressPoolACL(
    @JsonProperty(required = true, value = "id") BigDecimal id,
    @JsonProperty(required = true, value = "pool") AddressPoolDTO pool
  ) {
    this.id = id;
    this.pool = pool;
  }

  /**
   * Unique ID of the ACL entry.
   **/
  public AddressPoolACL id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "54", required = true, value = "Unique ID of the ACL entry.")
  @JsonProperty(required = true, value = "id")
  @NotNull @Valid public BigDecimal getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  public AddressPoolACL pool(AddressPoolDTO pool) {
    this.pool = pool;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pool")
  @NotNull @Valid public AddressPoolDTO getPool() {
    return pool;
  }

  @JsonProperty(required = true, value = "pool")
  public void setPool(AddressPoolDTO pool) {
    this.pool = pool;
  }

  /**
   * Username being assigned permissions.
   **/
  public AddressPoolACL username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "tester", value = "Username being assigned permissions.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Permission level for this user.
   **/
  public AddressPoolACL level(String level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(example = "READ", value = "Permission level for this user.")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(String level) {
    this.level = level;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressPoolACL addressPoolACL = (AddressPoolACL) o;
    return Objects.equals(this.id, addressPoolACL.id) &&
        Objects.equals(this.pool, addressPoolACL.pool) &&
        Objects.equals(this.username, addressPoolACL.username) &&
        Objects.equals(this.level, addressPoolACL.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pool, username, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressPoolACL {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

