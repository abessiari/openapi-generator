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
 * This schema represents an update object for SENSE Task records.
 **/
@ApiModel(description = "This schema represents an update object for SENSE Task records.")
@JsonTypeName("SENSE_Task_Update_DTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class SENSETaskUpdateDTO   {
  private Object status = null;
  private String message;
  private Boolean archived;

  public SENSETaskUpdateDTO() {
  }

  /**
   **/
  public SENSETaskUpdateDTO status(Object status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Object getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Object status) {
    this.status = status;
  }

  /**
   * The optional status message to attack to this task.
   **/
  public SENSETaskUpdateDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "[\"{\\\"foo\\\":\\\"bar\\\",\\\"test\\\":[\\\"1\\\", \\\"2\\\", \\\"3\\\"]}\",\"$callback_url\"]", value = "The optional status message to attack to this task.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * An optional flag to archive or unarchive the task.
   **/
  public SENSETaskUpdateDTO archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(value = "An optional flag to archive or unarchive the task.")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  @JsonProperty("archived")
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SENSETaskUpdateDTO seNSETaskUpdateDTO = (SENSETaskUpdateDTO) o;
    return Objects.equals(this.status, seNSETaskUpdateDTO.status) &&
        Objects.equals(this.message, seNSETaskUpdateDTO.message) &&
        Objects.equals(this.archived, seNSETaskUpdateDTO.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, archived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SENSETaskUpdateDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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

