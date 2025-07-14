package net.maxgigapop.mrs.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.maxgigapop.mrs.model.InlineObject1Data;
import net.maxgigapop.mrs.model.InlineObject1Meta;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("inline_object_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class InlineObject1   {
  private InlineObject1Meta meta;
  private InlineObject1Data data;

  public InlineObject1() {
  }

  @JsonCreator
  public InlineObject1(
    @JsonProperty(required = true, value = "meta") InlineObject1Meta meta,
    @JsonProperty(required = true, value = "data") InlineObject1Data data
  ) {
    this.meta = meta;
    this.data = data;
  }

  /**
   **/
  public InlineObject1 meta(InlineObject1Meta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "meta")
  @NotNull @Valid public InlineObject1Meta getMeta() {
    return meta;
  }

  @JsonProperty(required = true, value = "meta")
  public void setMeta(InlineObject1Meta meta) {
    this.meta = meta;
  }

  /**
   **/
  public InlineObject1 data(InlineObject1Data data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public InlineObject1Data getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(InlineObject1Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.meta, inlineObject1.meta) &&
        Objects.equals(this.data, inlineObject1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

