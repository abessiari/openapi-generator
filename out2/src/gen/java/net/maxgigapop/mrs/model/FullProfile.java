package net.maxgigapop.mrs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import net.maxgigapop.mrs.model.ProfileLicense;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This schema represents the structure of a service intent profile.
 **/
@ApiModel(description = "This schema represents the structure of a service intent profile.")
@JsonTypeName("FullProfile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-07-14T09:48:17.450161-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class FullProfile   {
  private String uuid;
  private String name;
  private String json;
  private String owner;
  private String description;
  private Date created;
  private Date lastEdited;
  private Boolean authorized;
  private Boolean editable;
  private String edit;
  private @Valid List<@Valid ProfileLicense> licenses = new ArrayList<>();

  public FullProfile() {
  }

  @JsonCreator
  public FullProfile(
    @JsonProperty(required = true, value = "uuid") String uuid,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.uuid = uuid;
    this.name = name;
  }

  /**
   * The profile&#39;s ID.
   **/
  public FullProfile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(example = "[\"d1898051-fcfa-4920-bb3b-7f5918194def\"]", required = true, value = "The profile's ID.")
  @JsonProperty(required = true, value = "uuid")
  @NotNull public String getUuid() {
    return uuid;
  }

  @JsonProperty(required = true, value = "uuid")
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The profile&#39;s user-given name.
   **/
  public FullProfile name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "[\"DNC-102 for SENSE\"]", required = true, value = "The profile's user-given name.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The profile intent itself, stored as a trimmed JSON string.
   **/
  public FullProfile json(String json) {
    this.json = json;
    return this;
  }

  
  @ApiModelProperty(value = "The profile intent itself, stored as a trimmed JSON string.")
  @JsonProperty("json")
  public String getJson() {
    return json;
  }

  @JsonProperty("json")
  public void setJson(String json) {
    this.json = json;
  }

  /**
   * The username of the profile owner.
   **/
  public FullProfile owner(String owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(example = "[\"aejimenez\"]", value = "The username of the profile owner.")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  @JsonProperty("owner")
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * The profile&#39;s description.
   **/
  public FullProfile description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "[\"For Tom and Jerry to use for pilot testing.\"]", value = "The profile's description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The profile&#39;s timestamp for creation.
   **/
  public FullProfile created(Date created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(value = "The profile's timestamp for creation.")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   * The timestamp for when the profile was last edited.
   **/
  public FullProfile lastEdited(Date lastEdited) {
    this.lastEdited = lastEdited;
    return this;
  }

  
  @ApiModelProperty(value = "The timestamp for when the profile was last edited.")
  @JsonProperty("lastEdited")
  public Date getLastEdited() {
    return lastEdited;
  }

  @JsonProperty("lastEdited")
  public void setLastEdited(Date lastEdited) {
    this.lastEdited = lastEdited;
  }

  /**
   * Whether the profile carries an admin&#39;s authorization with it.
   **/
  public FullProfile authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the profile carries an admin's authorization with it.")
  @JsonProperty("authorized")
  public Boolean getAuthorized() {
    return authorized;
  }

  @JsonProperty("authorized")
  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  /**
   * Whether the profile can be edited by licensed users.
   **/
  public FullProfile editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the profile can be edited by licensed users.")
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  @JsonProperty("editable")
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  /**
   * The JSON string for user-configured editable fields.
   **/
  public FullProfile edit(String edit) {
    this.edit = edit;
    return this;
  }

  
  @ApiModelProperty(value = "The JSON string for user-configured editable fields.")
  @JsonProperty("edit")
  public String getEdit() {
    return edit;
  }

  @JsonProperty("edit")
  public void setEdit(String edit) {
    this.edit = edit;
  }

  /**
   * The profile&#39;s collection of given licenses.
   **/
  public FullProfile licenses(List<@Valid ProfileLicense> licenses) {
    this.licenses = licenses;
    return this;
  }

  
  @ApiModelProperty(example = "[\"\"]", value = "The profile's collection of given licenses.")
  @JsonProperty("licenses")
  @Valid public List<@Valid ProfileLicense> getLicenses() {
    return licenses;
  }

  @JsonProperty("licenses")
  public void setLicenses(List<@Valid ProfileLicense> licenses) {
    this.licenses = licenses;
  }

  public FullProfile addLicensesItem(ProfileLicense licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }

    this.licenses.add(licensesItem);
    return this;
  }

  public FullProfile removeLicensesItem(ProfileLicense licensesItem) {
    if (licensesItem != null && this.licenses != null) {
      this.licenses.remove(licensesItem);
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
    FullProfile fullProfile = (FullProfile) o;
    return Objects.equals(this.uuid, fullProfile.uuid) &&
        Objects.equals(this.name, fullProfile.name) &&
        Objects.equals(this.json, fullProfile.json) &&
        Objects.equals(this.owner, fullProfile.owner) &&
        Objects.equals(this.description, fullProfile.description) &&
        Objects.equals(this.created, fullProfile.created) &&
        Objects.equals(this.lastEdited, fullProfile.lastEdited) &&
        Objects.equals(this.authorized, fullProfile.authorized) &&
        Objects.equals(this.editable, fullProfile.editable) &&
        Objects.equals(this.edit, fullProfile.edit) &&
        Objects.equals(this.licenses, fullProfile.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, json, owner, description, created, lastEdited, authorized, editable, edit, licenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullProfile {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastEdited: ").append(toIndentedString(lastEdited)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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

