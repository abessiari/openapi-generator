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
 * A cache of an instance service or system delta.
 **/
@ApiModel(description = "A cache of an instance service or system delta.")
@JsonTypeName("_instance__siUUID__deltas_get_200_response_system")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InstanceSiUUIDDeltasGet200ResponseSystem   {
  private BigDecimal id;
  private String instanceUUID;
  public enum TypeEnum {

    SERVICE(String.valueOf("SERVICE")), SYSTEM(String.valueOf("SYSTEM"));


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
  private String deltaUUID;
  private String delta;

  public InstanceSiUUIDDeltasGet200ResponseSystem() {
  }

  /**
   * Generated database ID.
   **/
  public InstanceSiUUIDDeltasGet200ResponseSystem id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Generated database ID.")
  @JsonProperty("id")
  @Valid public BigDecimal getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * Service instance UUID.
   **/
  public InstanceSiUUIDDeltasGet200ResponseSystem instanceUUID(String instanceUUID) {
    this.instanceUUID = instanceUUID;
    return this;
  }

  
  @ApiModelProperty(example = "d4c27d84-7de4-4683-80f6-de96u783f36d", value = "Service instance UUID.")
  @JsonProperty("instanceUUID")
  public String getInstanceUUID() {
    return instanceUUID;
  }

  @JsonProperty("instanceUUID")
  public void setInstanceUUID(String instanceUUID) {
    this.instanceUUID = instanceUUID;
  }

  /**
   * The type of delta.
   **/
  public InstanceSiUUIDDeltasGet200ResponseSystem type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of delta.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Delta UUID.
   **/
  public InstanceSiUUIDDeltasGet200ResponseSystem deltaUUID(String deltaUUID) {
    this.deltaUUID = deltaUUID;
    return this;
  }

  
  @ApiModelProperty(example = "755aab21-90bf-4140-9200-a016d7cb1393", value = "Delta UUID.")
  @JsonProperty("deltaUUID")
  public String getDeltaUUID() {
    return deltaUUID;
  }

  @JsonProperty("deltaUUID")
  public void setDeltaUUID(String deltaUUID) {
    this.deltaUUID = deltaUUID;
  }

  /**
   * Delta in string format.
   **/
  public InstanceSiUUIDDeltasGet200ResponseSystem delta(String delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(value = "Delta in string format.")
  @JsonProperty("delta")
  public String getDelta() {
    return delta;
  }

  @JsonProperty("delta")
  public void setDelta(String delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceSiUUIDDeltasGet200ResponseSystem instanceSiUUIDDeltasGet200ResponseSystem = (InstanceSiUUIDDeltasGet200ResponseSystem) o;
    return Objects.equals(this.id, instanceSiUUIDDeltasGet200ResponseSystem.id) &&
        Objects.equals(this.instanceUUID, instanceSiUUIDDeltasGet200ResponseSystem.instanceUUID) &&
        Objects.equals(this.type, instanceSiUUIDDeltasGet200ResponseSystem.type) &&
        Objects.equals(this.deltaUUID, instanceSiUUIDDeltasGet200ResponseSystem.deltaUUID) &&
        Objects.equals(this.delta, instanceSiUUIDDeltasGet200ResponseSystem.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceUUID, type, deltaUUID, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceSiUUIDDeltasGet200ResponseSystem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceUUID: ").append(toIndentedString(instanceUUID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deltaUUID: ").append(toIndentedString(deltaUUID)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

