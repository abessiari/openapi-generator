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
 * This schema represents an update object for SENSE metadata values.
 **/
@ApiModel(description = "This schema represents an update object for SENSE metadata values.")
@JsonTypeName("SENSE_Metadata_Update_DTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class SENSEMetadataUpdateDTO   {
  private String path;
  private String value;

  public SENSEMetadataUpdateDTO() {
  }

  @JsonCreator
  public SENSEMetadataUpdateDTO(
    @JsonProperty(required = true, value = "path") String path,
    @JsonProperty(required = true, value = "value") String value
  ) {
    this.path = path;
    this.value = value;
  }

  /**
   * A JSON path for the specified value entry. Requires an existing key at this path. Can use dot or bracket notation, as specified at https://github.com/json-path/JsonPath
   **/
  public SENSEMetadataUpdateDTO path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(example = "$.agents.test_agent.host.fqdn", required = true, value = "A JSON path for the specified value entry. Requires an existing key at this path. Can use dot or bracket notation, as specified at https://github.com/json-path/JsonPath")
  @JsonProperty(required = true, value = "path")
  @NotNull public String getPath() {
    return path;
  }

  @JsonProperty(required = true, value = "path")
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * The new value of the record, encoded as a JSON in string format. Can set nested objects in this way.
   **/
  public SENSEMetadataUpdateDTO value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "[\"localhost\",\"{\\\"foo\\\":\\\"bar\\\",\\\"test\\\":[\\\"1\\\", \\\"2\\\", \\\"3\\\"]}\"]", required = true, value = "The new value of the record, encoded as a JSON in string format. Can set nested objects in this way.")
  @JsonProperty(required = true, value = "value")
  @NotNull public String getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SENSEMetadataUpdateDTO seNSEMetadataUpdateDTO = (SENSEMetadataUpdateDTO) o;
    return Objects.equals(this.path, seNSEMetadataUpdateDTO.path) &&
        Objects.equals(this.value, seNSEMetadataUpdateDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SENSEMetadataUpdateDTO {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

