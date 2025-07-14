package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.maxgigapop.mrs.model.AllocateParams;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AllocateAddressRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AllocateAddressRequest   {
  private String name;
  public enum TypeEnum {

    ID(String.valueOf("ID")), MAC(String.valueOf("MAC")), IPV4(String.valueOf("IPv4")), IPV6(String.valueOf("IPv6"));


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
  private AllocateParams allocate;

  public AllocateAddressRequest() {
  }

  /**
   * The name of the allocation.
   **/
  public AllocateAddressRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Rucio Test IP", value = "The name of the allocation.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AllocateAddressRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public AllocateAddressRequest allocate(AllocateParams allocate) {
    this.allocate = allocate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allocate")
  @Valid public AllocateParams getAllocate() {
    return allocate;
  }

  @JsonProperty("allocate")
  public void setAllocate(AllocateParams allocate) {
    this.allocate = allocate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateAddressRequest allocateAddressRequest = (AllocateAddressRequest) o;
    return Objects.equals(this.name, allocateAddressRequest.name) &&
        Objects.equals(this.type, allocateAddressRequest.type) &&
        Objects.equals(this.allocate, allocateAddressRequest.allocate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, allocate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateAddressRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allocate: ").append(toIndentedString(allocate)).append("\n");
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

