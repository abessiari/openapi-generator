package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateAddressPoolRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class CreateAddressPoolRequest   {
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
  private String prefix;
  private String range;
  private @Valid List<String> prefixList = new ArrayList<>();

  public CreateAddressPoolRequest() {
  }

  /**
   * The name of the address pool.
   **/
  public CreateAddressPoolRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Rucio Dev Pool", value = "The name of the address pool.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of addresses to allocate.
   **/
  public CreateAddressPoolRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "IPv4", value = "The type of addresses to allocate.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The type of addresses to allocate.
   **/
  public CreateAddressPoolRequest prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  
  @ApiModelProperty(value = "The type of addresses to allocate.")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  @JsonProperty("prefix")
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * Create a pool from an address range.
   **/
  public CreateAddressPoolRequest range(String range) {
    this.range = range;
    return this;
  }

  
  @ApiModelProperty(example = "192.168.1.1-192.168.1.255", value = "Create a pool from an address range.")
  @JsonProperty("range")
  public String getRange() {
    return range;
  }

  @JsonProperty("range")
  public void setRange(String range) {
    this.range = range;
  }

  /**
   * Create a pool from multiple prefixes.
   **/
  public CreateAddressPoolRequest prefixList(List<String> prefixList) {
    this.prefixList = prefixList;
    return this;
  }

  
  @ApiModelProperty(value = "Create a pool from multiple prefixes.")
  @JsonProperty("prefix_list")
  public List<String> getPrefixList() {
    return prefixList;
  }

  @JsonProperty("prefix_list")
  public void setPrefixList(List<String> prefixList) {
    this.prefixList = prefixList;
  }

  public CreateAddressPoolRequest addPrefixListItem(String prefixListItem) {
    if (this.prefixList == null) {
      this.prefixList = new ArrayList<>();
    }

    this.prefixList.add(prefixListItem);
    return this;
  }

  public CreateAddressPoolRequest removePrefixListItem(String prefixListItem) {
    if (prefixListItem != null && this.prefixList != null) {
      this.prefixList.remove(prefixListItem);
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
    CreateAddressPoolRequest createAddressPoolRequest = (CreateAddressPoolRequest) o;
    return Objects.equals(this.name, createAddressPoolRequest.name) &&
        Objects.equals(this.type, createAddressPoolRequest.type) &&
        Objects.equals(this.prefix, createAddressPoolRequest.prefix) &&
        Objects.equals(this.range, createAddressPoolRequest.range) &&
        Objects.equals(this.prefixList, createAddressPoolRequest.prefixList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, prefix, range, prefixList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAddressPoolRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    prefixList: ").append(toIndentedString(prefixList)).append("\n");
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

