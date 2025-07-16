# MetadataApi

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**metaDomainGet**](MetadataApi.md#metaDomainGet) | **GET** /meta/{domain} | Get Domain Records |
| [**metaDomainNameDelete**](MetadataApi.md#metaDomainNameDelete) | **DELETE** /meta/{domain}/{name} | Delete a Record |
| [**metaDomainNameGet**](MetadataApi.md#metaDomainNameGet) | **GET** /meta/{domain}/{name} | Retrieve a Record |
| [**metaDomainNamePolicyGet**](MetadataApi.md#metaDomainNamePolicyGet) | **GET** /meta/{domain}/{name}/policy | Retrieve Record Policies |
| [**metaDomainNamePolicyIdIdGet**](MetadataApi.md#metaDomainNamePolicyIdIdGet) | **GET** /meta/{domain}/{name}/policy/id/{id} | Retrieve a Policy |
| [**metaDomainNamePolicyPost**](MetadataApi.md#metaDomainNamePolicyPost) | **POST** /meta/{domain}/{name}/policy | Register a Policy |
| [**metaDomainNamePost**](MetadataApi.md#metaDomainNamePost) | **POST** /meta/{domain}/{name} | Register a Record |
| [**metaDomainNameUpdatePut**](MetadataApi.md#metaDomainNameUpdatePut) | **PUT** /meta/{domain}/{name}/update | Updates a Record |
| [**metaGet**](MetadataApi.md#metaGet) | **GET** /meta | Get All Records |


<a name="metaDomainGet"></a>
# **metaDomainGet**
> List metaDomainGet(domain)

Get Domain Records

    Retrieves all accessible metadata records under a specific domain.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metaDomainNameDelete"></a>
# **metaDomainNameDelete**
> metaDomainNameDelete(domain, name)

Delete a Record

    Removes a metadata record from the service.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="metaDomainNameGet"></a>
# **metaDomainNameGet**
> metaDomainNameGet(domain, name, full)

Retrieve a Record

    Retrieves a specific metadata record value, or optionally the full record view.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |
| **full** | **Boolean**| Whether to return the full entity object instead of just the parsed JSON value. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metaDomainNamePolicyGet"></a>
# **metaDomainNamePolicyGet**
> metaDomainNamePolicyGet(domain, name)

Retrieve Record Policies

    Gets the list of associated policies with a metadata record.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metaDomainNamePolicyIdIdGet"></a>
# **metaDomainNamePolicyIdIdGet**
> metaDomainNamePolicyIdIdGet(domain, name, id)

Retrieve a Policy

    Gets the a specific policy by its ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |
| **id** | **BigDecimal**| The specified ID number of the policy. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metaDomainNamePolicyPost"></a>
# **metaDomainNamePolicyPost**
> SENSE_Metadata_Policy_1 metaDomainNamePolicyPost(domain, name, SENSE\_Metadata\_Policy)

Register a Policy

    Creates or updates a metadata policy against the specified record.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |
| **SENSE\_Metadata\_Policy** | [**SENSE_Metadata_Policy**](../Models/SENSE_Metadata_Policy.md)| A policy update request object. | |

### Return type

[**SENSE_Metadata_Policy_1**](../Models/SENSE_Metadata_Policy_1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="metaDomainNamePost"></a>
# **metaDomainNamePost**
> SENSE_Metadata metaDomainNamePost(domain, name, \_meta\_\_domain\_\_\_name\_\_post\_request)

Register a Record

    Creates or updates a metadata record with a new value object.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |
| **\_meta\_\_domain\_\_\_name\_\_post\_request** | [**_meta__domain___name__post_request**](../Models/_meta__domain___name__post_request.md)| The new JSON value for the record. | |

### Return type

[**SENSE_Metadata**](../Models/SENSE_Metadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="metaDomainNameUpdatePut"></a>
# **metaDomainNameUpdatePut**
> metaDomainNameUpdatePut(domain, name, SENSE\_Metadata\_Update\_DTO)

Updates a Record

    Updates a metadata record with updates to specific values.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The domain of the metadata record, representing which platform or third party it relates to. | [default to null] |
| **name** | **String**| The registered name of the metadata record. | [default to null] |
| **SENSE\_Metadata\_Update\_DTO** | [**List**](../Models/SENSE_Metadata_Update_DTO.md)| A JSON array of update objects. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="metaGet"></a>
# **metaGet**
> List metaGet()

Get All Records

    Retrieves all accessible metadata records.

### Parameters
This endpoint does not need any parameter.

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

