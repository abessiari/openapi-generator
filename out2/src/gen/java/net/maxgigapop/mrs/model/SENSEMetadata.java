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
 * This schema represents a record of the SENSE metadata service.
 **/
@ApiModel(description = "This schema represents a record of the SENSE metadata service.")
@JsonTypeName("SENSE_Metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class SENSEMetadata   {
  private String name;
  private String data;
  private String owner;
  private String created;
  private String edited;

  public SENSEMetadata() {
  }

  @JsonCreator
  public SENSEMetadata(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "data") String data,
    @JsonProperty(required = true, value = "owner") String owner
  ) {
    this.name = name;
    this.data = data;
    this.owner = owner;
  }

  /**
   * The unique compsite id of the metadata record. Composed of a service domain and record name separated by a slash.
   **/
  public SENSEMetadata name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "JANUS/overview", required = true, value = "The unique compsite id of the metadata record. Composed of a service domain and record name separated by a slash.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value of the record, encoded as a JSON in string format.
   **/
  public SENSEMetadata data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(example = "{   \"controller\": {     \"foo\": \"bar\"   }, ...", required = true, value = "The value of the record, encoded as a JSON in string format.")
  @JsonProperty(required = true, value = "data")
  @NotNull public String getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(String data) {
    this.data = data;
  }

  /**
   * The user that created and is responsible for this record.
   **/
  public SENSEMetadata owner(String owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(example = "ajimenez", required = true, value = "The user that created and is responsible for this record.")
  @JsonProperty(required = true, value = "owner")
  @NotNull public String getOwner() {
    return owner;
  }

  @JsonProperty(required = true, value = "owner")
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * The timestamp of the record&#39;s creation.
   **/
  public SENSEMetadata created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(example = "2023-07-03 10:39:10.0", value = "The timestamp of the record's creation.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the record&#39;s last edit.
   **/
  public SENSEMetadata edited(String edited) {
    this.edited = edited;
    return this;
  }

  
  @ApiModelProperty(example = "2023-07-11 12:14:09.0", value = "The timestamp of the record's last edit.")
  @JsonProperty("edited")
  public String getEdited() {
    return edited;
  }

  @JsonProperty("edited")
  public void setEdited(String edited) {
    this.edited = edited;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SENSEMetadata seNSEMetadata = (SENSEMetadata) o;
    return Objects.equals(this.name, seNSEMetadata.name) &&
        Objects.equals(this.data, seNSEMetadata.data) &&
        Objects.equals(this.owner, seNSEMetadata.owner) &&
        Objects.equals(this.created, seNSEMetadata.created) &&
        Objects.equals(this.edited, seNSEMetadata.edited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, data, owner, created, edited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SENSEMetadata {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
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

