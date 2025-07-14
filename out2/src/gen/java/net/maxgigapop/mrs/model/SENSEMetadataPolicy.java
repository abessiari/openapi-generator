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
 * This schema represents an access or validation policy for a metadata record.
 **/
@ApiModel(description = "This schema represents an access or validation policy for a metadata record.")
@JsonTypeName("SENSE_Metadata_Policy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class SENSEMetadataPolicy   {
  private String name;
  public enum TypeEnum {

    ACCESS(String.valueOf("ACCESS")), VALIDATION(String.valueOf("VALIDATION"));


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
  private String principal;
  private String _object;
  public enum LevelEnum {

    NONE(String.valueOf("NONE")), READ(String.valueOf("READ")), WRITE(String.valueOf("WRITE"));


    private String value;

    LevelEnum (String v) {
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
    public static LevelEnum fromString(String s) {
        for (LevelEnum b : LevelEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private LevelEnum level;

  public SENSEMetadataPolicy() {
  }

  /**
   * The human-readable name of the policy.
   **/
  public SENSEMetadataPolicy name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "janus-agent-access", value = "The human-readable name of the policy.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the policy is involved with access or value validation.
   **/
  public SENSEMetadataPolicy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the policy is involved with access or value validation.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The username or group being moderated.
   **/
  public SENSEMetadataPolicy principal(String principal) {
    this.principal = principal;
    return this;
  }

  
  @ApiModelProperty(example = "playwright-tester", value = "The username or group being moderated.")
  @JsonProperty("principal")
  public String getPrincipal() {
    return principal;
  }

  @JsonProperty("principal")
  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  /**
   * The target of the policy, usually a metadata JSONPath.
   **/
  public SENSEMetadataPolicy _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(example = "$.agents[*].host", value = "The target of the policy, usually a metadata JSONPath.")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The level at which the principal is given read or write privileges.
   **/
  public SENSEMetadataPolicy level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(value = "The level at which the principal is given read or write privileges.")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(LevelEnum level) {
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
    SENSEMetadataPolicy seNSEMetadataPolicy = (SENSEMetadataPolicy) o;
    return Objects.equals(this.name, seNSEMetadataPolicy.name) &&
        Objects.equals(this.type, seNSEMetadataPolicy.type) &&
        Objects.equals(this.principal, seNSEMetadataPolicy.principal) &&
        Objects.equals(this._object, seNSEMetadataPolicy._object) &&
        Objects.equals(this.level, seNSEMetadataPolicy.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, principal, _object, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SENSEMetadataPolicy {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

