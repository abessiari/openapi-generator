package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * This schema represents the structure of a service intent, used to create or modify a service instance.
 **/
@ApiModel(description = "This schema represents the structure of a service intent, used to create or modify a service instance.")
@JsonTypeName("ServiceIntent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class ServiceIntent   {
  private String service;
  private @Valid List<String> options = new ArrayList<>();
  private Object data = null;
  private String alias;

  public ServiceIntent() {
  }

  @JsonCreator
  public ServiceIntent(
    @JsonProperty(required = true, value = "service") String service,
    @JsonProperty(required = true, value = "data") Object data
  ) {
    this.service = service;
    this.data = data;
  }

  /**
   * The type of service being created.
   **/
  public ServiceIntent service(String service) {
    this.service = service;
    return this;
  }

  
  @ApiModelProperty(example = "dnc", required = true, value = "The type of service being created.")
  @JsonProperty(required = true, value = "service")
  @NotNull public String getService() {
    return service;
  }

  @JsonProperty(required = true, value = "service")
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Array of option flags.
   **/
  public ServiceIntent options(List<String> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "Array of option flags.")
  @JsonProperty("options")
  public List<String> getOptions() {
    return options;
  }

  @JsonProperty("options")
  public void setOptions(List<String> options) {
    this.options = options;
  }

  public ServiceIntent addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }

    this.options.add(optionsItem);
    return this;
  }

  public ServiceIntent removeOptionsItem(String optionsItem) {
    if (optionsItem != null && this.options != null) {
      this.options.remove(optionsItem);
    }

    return this;
  }
  /**
   **/
  public ServiceIntent data(Object data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull public Object getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
  public void setData(Object data) {
    this.data = data;
  }

  /**
   * Alias to give to the created service instance.
   **/
  public ServiceIntent alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(example = "DNC Demo", value = "Alias to give to the created service instance.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(String alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceIntent serviceIntent = (ServiceIntent) o;
    return Objects.equals(this.service, serviceIntent.service) &&
        Objects.equals(this.options, serviceIntent.options) &&
        Objects.equals(this.data, serviceIntent.data) &&
        Objects.equals(this.alias, serviceIntent.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, options, data, alias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceIntent {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

