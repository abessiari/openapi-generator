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
 * A license given to a user to allow execution and possible customization of a profile.
 **/
@ApiModel(description = "A license given to a user to allow execution and possible customization of a profile.")
@JsonTypeName("ProfileLicense")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class ProfileLicense   {
  private String username;
  public enum TypeEnum {

    TICKET(String.valueOf("ticket")), ALLOCATION(String.valueOf("allocation"));


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
  private BigDecimal remaining;

  public ProfileLicense() {
  }

  @JsonCreator
  public ProfileLicense(
    @JsonProperty(required = true, value = "username") String username,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "remaining") BigDecimal remaining
  ) {
    this.username = username;
    this.type = type;
    this.remaining = remaining;
  }

  /**
   * The user that is being given the license.
   **/
  public ProfileLicense username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "[\"xyang\"]", required = true, value = "The user that is being given the license.")
  @JsonProperty(required = true, value = "username")
  @NotNull public String getUsername() {
    return username;
  }

  @JsonProperty(required = true, value = "username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * The type of license, tickets are only good for one instance creation, whereas allocations are returned when instances are deleted.
   **/
  public ProfileLicense type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of license, tickets are only good for one instance creation, whereas allocations are returned when instances are deleted.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For tickets, the number of remaining tickets. For allocations, the maximum number of active instances allowed at one time.
   **/
  public ProfileLicense remaining(BigDecimal remaining) {
    this.remaining = remaining;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "For tickets, the number of remaining tickets. For allocations, the maximum number of active instances allowed at one time.")
  @JsonProperty(required = true, value = "remaining")
  @NotNull @Valid public BigDecimal getRemaining() {
    return remaining;
  }

  @JsonProperty(required = true, value = "remaining")
  public void setRemaining(BigDecimal remaining) {
    this.remaining = remaining;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileLicense profileLicense = (ProfileLicense) o;
    return Objects.equals(this.username, profileLicense.username) &&
        Objects.equals(this.type, profileLicense.type) &&
        Objects.equals(this.remaining, profileLicense.remaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, type, remaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileLicense {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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

