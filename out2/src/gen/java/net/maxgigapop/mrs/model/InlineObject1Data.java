package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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

/**
 * Response data package.
 **/
@ApiModel(description = "Response data package.")
@JsonTypeName("inline_object_1_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InlineObject1Data   {
  private @Valid List<BigDecimal> result = new ArrayList<>();

  public InlineObject1Data() {
  }

  @JsonCreator
  public InlineObject1Data(
    @JsonProperty(required = true, value = "result") List<@Valid BigDecimal> result
  ) {
    this.result = result;
  }

  /**
   * Number response.
   **/
  public InlineObject1Data result(List<BigDecimal> result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number response.")
  @JsonProperty(required = true, value = "result")
  @NotNull @Valid  @Size(max=1)public List<@Valid BigDecimal> getResult() {
    return result;
  }

  @JsonProperty(required = true, value = "result")
  public void setResult(List<BigDecimal> result) {
    this.result = result;
  }

  public InlineObject1Data addResultItem(BigDecimal resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }

    this.result.add(resultItem);
    return this;
  }

  public InlineObject1Data removeResultItem(BigDecimal resultItem) {
    if (resultItem != null && this.result != null) {
      this.result.remove(resultItem);
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
    InlineObject1Data inlineObject1Data = (InlineObject1Data) o;
    return Objects.equals(this.result, inlineObject1Data.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1Data {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

