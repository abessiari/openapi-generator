package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * This schema represents an access or validation policy for a metadata record.
 **/
@ApiModel(description = "This schema represents an access or validation policy for a metadata record.")
@JsonTypeName("SENSE_Metadata_Policy_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class SENSEMetadataPolicy1   {
  private BigDecimal id;
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

  public SENSEMetadataPolicy1() {
  }

  @JsonCreator
  public SENSEMetadataPolicy1(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "principal") String principal,
    @JsonProperty(required = true, value = "object") String _object,
    @JsonProperty(required = true, value = "level") LevelEnum level
  ) {
    this.type = type;
    this.principal = principal;
    this._object = _object;
    this.level = level;
  }

  /**
   * The policy id.
   **/
  public SENSEMetadataPolicy1 id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2131", value = "The policy id.")
  @JsonProperty("id")
  @Valid public BigDecimal getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * The human-readable name of the policy.
   **/
  public SENSEMetadataPolicy1 name(String name) {
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
  public SENSEMetadataPolicy1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether the policy is involved with access or value validation.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The username or group being moderated.
   **/
  public SENSEMetadataPolicy1 principal(String principal) {
    this.principal = principal;
    return this;
  }

  
  @ApiModelProperty(example = "playwright-tester", required = true, value = "The username or group being moderated.")
  @JsonProperty(required = true, value = "principal")
  @NotNull public String getPrincipal() {
    return principal;
  }

  @JsonProperty(required = true, value = "principal")
  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  /**
   * The target of the policy, usually a metadata JSONPath.
   **/
  public SENSEMetadataPolicy1 _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(example = "$.agents[*].host", required = true, value = "The target of the policy, usually a metadata JSONPath.")
  @JsonProperty(required = true, value = "object")
  @NotNull public String getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The level at which the principal is given read or write privileges.
   **/
  public SENSEMetadataPolicy1 level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The level at which the principal is given read or write privileges.")
  @JsonProperty(required = true, value = "level")
  @NotNull public LevelEnum getLevel() {
    return level;
  }

  @JsonProperty(required = true, value = "level")
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
    SENSEMetadataPolicy1 seNSEMetadataPolicy1 = (SENSEMetadataPolicy1) o;
    return Objects.equals(this.id, seNSEMetadataPolicy1.id) &&
        Objects.equals(this.name, seNSEMetadataPolicy1.name) &&
        Objects.equals(this.type, seNSEMetadataPolicy1.type) &&
        Objects.equals(this.principal, seNSEMetadataPolicy1.principal) &&
        Objects.equals(this._object, seNSEMetadataPolicy1._object) &&
        Objects.equals(this.level, seNSEMetadataPolicy1.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, principal, _object, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SENSEMetadataPolicy1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

