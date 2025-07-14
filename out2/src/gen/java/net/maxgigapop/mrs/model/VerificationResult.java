package net.maxgigapop.mrs.model;

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
 * This schema represents the full result set from service instance verification.
 **/
@ApiModel(description = "This schema represents the full result set from service instance verification.")
@JsonTypeName("VerificationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class VerificationResult   {
  private String deltaUuid;
  private String creationTime;
  private String verifiedReduction;
  private String verifiedAddition;
  private String unverifiedReduction;
  private String unverifiedAddition;
  public enum ReductionEnum {

    TRUE(String.valueOf("true")), FALSE(String.valueOf("false"));


    private String value;

    ReductionEnum (String v) {
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
    public static ReductionEnum fromString(String s) {
        for (ReductionEnum b : ReductionEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ReductionEnum fromValue(String value) {
        for (ReductionEnum b : ReductionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ReductionEnum reduction;
  public enum AdditionEnum {

    TRUE(String.valueOf("true")), FALSE(String.valueOf("false"));


    private String value;

    AdditionEnum (String v) {
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
    public static AdditionEnum fromString(String s) {
        for (AdditionEnum b : AdditionEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AdditionEnum fromValue(String value) {
        for (AdditionEnum b : AdditionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AdditionEnum addition;

  public VerificationResult() {
  }

  @JsonCreator
  public VerificationResult(
    @JsonProperty(required = true, value = "delta_uuid") String deltaUuid,
    @JsonProperty(required = true, value = "creation_time") String creationTime,
    @JsonProperty(required = true, value = "reduction") ReductionEnum reduction,
    @JsonProperty(required = true, value = "addition") AdditionEnum addition
  ) {
    this.deltaUuid = deltaUuid;
    this.creationTime = creationTime;
    this.reduction = reduction;
    this.addition = addition;
  }

  /**
   * UUID of delta being verified.
   **/
  public VerificationResult deltaUuid(String deltaUuid) {
    this.deltaUuid = deltaUuid;
    return this;
  }

  
  @ApiModelProperty(example = "de159dae-7b00-480c-b4ee-d34e637c68b0", required = true, value = "UUID of delta being verified.")
  @JsonProperty(required = true, value = "delta_uuid")
  @NotNull public String getDeltaUuid() {
    return deltaUuid;
  }

  @JsonProperty(required = true, value = "delta_uuid")
  public void setDeltaUuid(String deltaUuid) {
    this.deltaUuid = deltaUuid;
  }

  /**
   * When this verification run started.
   **/
  public VerificationResult creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(example = "2021-04-05", required = true, value = "When this verification run started.")
  @JsonProperty(required = true, value = "creation_time")
  @NotNull public String getCreationTime() {
    return creationTime;
  }

  @JsonProperty(required = true, value = "creation_time")
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * JSON string of the verified reduction model.
   **/
  public VerificationResult verifiedReduction(String verifiedReduction) {
    this.verifiedReduction = verifiedReduction;
    return this;
  }

  
  @ApiModelProperty(example = "(Reduction model JSON)", value = "JSON string of the verified reduction model.")
  @JsonProperty("verified_reduction")
  public String getVerifiedReduction() {
    return verifiedReduction;
  }

  @JsonProperty("verified_reduction")
  public void setVerifiedReduction(String verifiedReduction) {
    this.verifiedReduction = verifiedReduction;
  }

  /**
   * JSON string of the verified addition model.
   **/
  public VerificationResult verifiedAddition(String verifiedAddition) {
    this.verifiedAddition = verifiedAddition;
    return this;
  }

  
  @ApiModelProperty(example = "(Addition model JSON)", value = "JSON string of the verified addition model.")
  @JsonProperty("verified_addition")
  public String getVerifiedAddition() {
    return verifiedAddition;
  }

  @JsonProperty("verified_addition")
  public void setVerifiedAddition(String verifiedAddition) {
    this.verifiedAddition = verifiedAddition;
  }

  /**
   * JSON string of the unverified reduction model.
   **/
  public VerificationResult unverifiedReduction(String unverifiedReduction) {
    this.unverifiedReduction = unverifiedReduction;
    return this;
  }

  
  @ApiModelProperty(example = "(Reduction model JSON)", value = "JSON string of the unverified reduction model.")
  @JsonProperty("unverified_reduction")
  public String getUnverifiedReduction() {
    return unverifiedReduction;
  }

  @JsonProperty("unverified_reduction")
  public void setUnverifiedReduction(String unverifiedReduction) {
    this.unverifiedReduction = unverifiedReduction;
  }

  /**
   * JSON string of the unverified addition model.
   **/
  public VerificationResult unverifiedAddition(String unverifiedAddition) {
    this.unverifiedAddition = unverifiedAddition;
    return this;
  }

  
  @ApiModelProperty(example = "(Addition model JSON)", value = "JSON string of the unverified addition model.")
  @JsonProperty("unverified_addition")
  public String getUnverifiedAddition() {
    return unverifiedAddition;
  }

  @JsonProperty("unverified_addition")
  public void setUnverifiedAddition(String unverifiedAddition) {
    this.unverifiedAddition = unverifiedAddition;
  }

  /**
   * String boolean of whether the reduction is present.
   **/
  public VerificationResult reduction(ReductionEnum reduction) {
    this.reduction = reduction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "String boolean of whether the reduction is present.")
  @JsonProperty(required = true, value = "reduction")
  @NotNull public ReductionEnum getReduction() {
    return reduction;
  }

  @JsonProperty(required = true, value = "reduction")
  public void setReduction(ReductionEnum reduction) {
    this.reduction = reduction;
  }

  /**
   * String boolean of whether the addition is present.
   **/
  public VerificationResult addition(AdditionEnum addition) {
    this.addition = addition;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "String boolean of whether the addition is present.")
  @JsonProperty(required = true, value = "addition")
  @NotNull public AdditionEnum getAddition() {
    return addition;
  }

  @JsonProperty(required = true, value = "addition")
  public void setAddition(AdditionEnum addition) {
    this.addition = addition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResult verificationResult = (VerificationResult) o;
    return Objects.equals(this.deltaUuid, verificationResult.deltaUuid) &&
        Objects.equals(this.creationTime, verificationResult.creationTime) &&
        Objects.equals(this.verifiedReduction, verificationResult.verifiedReduction) &&
        Objects.equals(this.verifiedAddition, verificationResult.verifiedAddition) &&
        Objects.equals(this.unverifiedReduction, verificationResult.unverifiedReduction) &&
        Objects.equals(this.unverifiedAddition, verificationResult.unverifiedAddition) &&
        Objects.equals(this.reduction, verificationResult.reduction) &&
        Objects.equals(this.addition, verificationResult.addition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaUuid, creationTime, verifiedReduction, verifiedAddition, unverifiedReduction, unverifiedAddition, reduction, addition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResult {\n");
    
    sb.append("    deltaUuid: ").append(toIndentedString(deltaUuid)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    verifiedReduction: ").append(toIndentedString(verifiedReduction)).append("\n");
    sb.append("    verifiedAddition: ").append(toIndentedString(verifiedAddition)).append("\n");
    sb.append("    unverifiedReduction: ").append(toIndentedString(unverifiedReduction)).append("\n");
    sb.append("    unverifiedAddition: ").append(toIndentedString(unverifiedAddition)).append("\n");
    sb.append("    reduction: ").append(toIndentedString(reduction)).append("\n");
    sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
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

