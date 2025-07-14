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
 * This schema represents the limited DTO of an address pool.
 **/
@ApiModel(description = "This schema represents the limited DTO of an address pool.")
@JsonTypeName("AddressPoolDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressPoolDTO   {
  private BigDecimal id;
  private String name;
  public enum TypeEnum {

    IPV4(String.valueOf("IPv4")), IPV6(String.valueOf("IPv6")), ID(String.valueOf("ID")), MAC(String.valueOf("MAC"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;
  private String pool;

  public AddressPoolDTO() {
  }

  @JsonCreator
  public AddressPoolDTO(
    @JsonProperty(required = true, value = "id") BigDecimal id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "pool") String pool
  ) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.pool = pool;
  }

  /**
   * Unique ID of the address pool.
   **/
  public AddressPoolDTO id(BigDecimal id) {
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
   * Human readable name of the address pool.
   **/
  public AddressPoolDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "ESNet East Pool 4", required = true, value = "Human readable name of the address pool.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of address a pool manages.
   **/
  public AddressPoolDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of address a pool manages.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * CSV string of pool data.
   **/
  public AddressPoolDTO pool(String pool) {
    this.pool = pool;
    return this;
  }

  
  @ApiModelProperty(example = "fc00:3600::0/64,[...],fc00:3601::0/64", required = true, value = "CSV string of pool data.")
  @JsonProperty(required = true, value = "pool")
  @NotNull public String getPool() {
    return pool;
  }

  @JsonProperty(required = true, value = "pool")
  public void setPool(String pool) {
    this.pool = pool;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressPoolDTO addressPoolDTO = (AddressPoolDTO) o;
    return Objects.equals(this.id, addressPoolDTO.id) &&
        Objects.equals(this.name, addressPoolDTO.name) &&
        Objects.equals(this.type, addressPoolDTO.type) &&
        Objects.equals(this.pool, addressPoolDTO.pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, pool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressPoolDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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

