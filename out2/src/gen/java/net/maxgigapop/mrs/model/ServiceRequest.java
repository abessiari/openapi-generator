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
 * This schema represents a request for service creation or modification.
 **/
@ApiModel(description = "This schema represents a request for service creation or modification.")
@JsonTypeName("ServiceRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class ServiceRequest   {
  private String alias;
  private String service;
  private Object data;
  private @Valid List<String> options = new ArrayList<>();
  private String serviceInstanceUuid;
  private String serviceProfileUuid;
  private @Valid List<Object> queries = new ArrayList<>();
  private String proceed;
  private String synchronous;

  public ServiceRequest() {
  }

  /**
   * Alias to give to the created service instance.
   **/
  public ServiceRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(example = "DNC-Test 3", value = "Alias to give to the created service instance.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * Service type: dnc, vcn, etc.
   **/
  public ServiceRequest service(String service) {
    this.service = service;
    return this;
  }

  
  @ApiModelProperty(example = "dnc", value = "Service type: dnc, vcn, etc.")
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  @JsonProperty("service")
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Intent data package.
   **/
  public ServiceRequest data(Object data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "Intent data package.")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(Object data) {
    this.data = data;
  }

  /**
   **/
  public ServiceRequest options(List<String> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(example = "[\"aws-form\"]", value = "")
  @JsonProperty("options")
  public List<String> getOptions() {
    return options;
  }

  @JsonProperty("options")
  public void setOptions(List<String> options) {
    this.options = options;
  }

  public ServiceRequest addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }

    this.options.add(optionsItem);
    return this;
  }

  public ServiceRequest removeOptionsItem(String optionsItem) {
    if (optionsItem != null && this.options != null) {
      this.options.remove(optionsItem);
    }

    return this;
  }
  /**
   * Pre-determined service instance UUID.
   **/
  public ServiceRequest serviceInstanceUuid(String serviceInstanceUuid) {
    this.serviceInstanceUuid = serviceInstanceUuid;
    return this;
  }

  
  @ApiModelProperty(example = "e94bb468-0de8-4cc1-beae-e3db7c5fdf47", value = "Pre-determined service instance UUID.")
  @JsonProperty("service_instance_uuid")
  public String getServiceInstanceUuid() {
    return serviceInstanceUuid;
  }

  @JsonProperty("service_instance_uuid")
  public void setServiceInstanceUuid(String serviceInstanceUuid) {
    this.serviceInstanceUuid = serviceInstanceUuid;
  }

  /**
   * Backing profile UUID.
   **/
  public ServiceRequest serviceProfileUuid(String serviceProfileUuid) {
    this.serviceProfileUuid = serviceProfileUuid;
    return this;
  }

  
  @ApiModelProperty(example = "5fe1bae9-1c16-44de-be4d-527dd2b354d6", value = "Backing profile UUID.")
  @JsonProperty("service_profile_uuid")
  public String getServiceProfileUuid() {
    return serviceProfileUuid;
  }

  @JsonProperty("service_profile_uuid")
  public void setServiceProfileUuid(String serviceProfileUuid) {
    this.serviceProfileUuid = serviceProfileUuid;
  }

  /**
   **/
  public ServiceRequest queries(List<Object> queries) {
    this.queries = queries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queries")
  public List<Object> getQueries() {
    return queries;
  }

  @JsonProperty("queries")
  public void setQueries(List<Object> queries) {
    this.queries = queries;
  }

  public ServiceRequest addQueriesItem(Object queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }

    this.queries.add(queriesItem);
    return this;
  }

  public ServiceRequest removeQueriesItem(Object queriesItem) {
    if (queriesItem != null && this.queries != null) {
      this.queries.remove(queriesItem);
    }

    return this;
  }
  /**
   * Whether to proceed automatically through provisioning.
   **/
  public ServiceRequest proceed(String proceed) {
    this.proceed = proceed;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Whether to proceed automatically through provisioning.")
  @JsonProperty("proceed")
  public String getProceed() {
    return proceed;
  }

  @JsonProperty("proceed")
  public void setProceed(String proceed) {
    this.proceed = proceed;
  }

  /**
   * Whether to operate in synchronous/blocking mode.
   **/
  public ServiceRequest synchronous(String synchronous) {
    this.synchronous = synchronous;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether to operate in synchronous/blocking mode.")
  @JsonProperty("synchronous")
  public String getSynchronous() {
    return synchronous;
  }

  @JsonProperty("synchronous")
  public void setSynchronous(String synchronous) {
    this.synchronous = synchronous;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequest serviceRequest = (ServiceRequest) o;
    return Objects.equals(this.alias, serviceRequest.alias) &&
        Objects.equals(this.service, serviceRequest.service) &&
        Objects.equals(this.data, serviceRequest.data) &&
        Objects.equals(this.options, serviceRequest.options) &&
        Objects.equals(this.serviceInstanceUuid, serviceRequest.serviceInstanceUuid) &&
        Objects.equals(this.serviceProfileUuid, serviceRequest.serviceProfileUuid) &&
        Objects.equals(this.queries, serviceRequest.queries) &&
        Objects.equals(this.proceed, serviceRequest.proceed) &&
        Objects.equals(this.synchronous, serviceRequest.synchronous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, service, data, options, serviceInstanceUuid, serviceProfileUuid, queries, proceed, synchronous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequest {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    serviceInstanceUuid: ").append(toIndentedString(serviceInstanceUuid)).append("\n");
    sb.append("    serviceProfileUuid: ").append(toIndentedString(serviceProfileUuid)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    proceed: ").append(toIndentedString(proceed)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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

