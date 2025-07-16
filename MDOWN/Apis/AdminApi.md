# AdminApi

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPool**](AdminApi.md#createPool) | **POST** /address/pool | Add New Pool |
| [**deleteACLByUser**](AdminApi.md#deleteACLByUser) | **DELETE** /address/access/{poolName}/{username} | Delete Address Pool Access List |
| [**deletePool**](AdminApi.md#deletePool) | **DELETE** /address/pool/{poolName} | Delete Pool |
| [**instanceSiUUIDLastStatePut**](AdminApi.md#instanceSiUUIDLastStatePut) | **PUT** /instance/{siUUID}/last/{state} | Set instance last state |
| [**instanceSiUUIDStatusPhaseGet**](AdminApi.md#instanceSiUUIDStatusPhaseGet) | **GET** /instance/{siUUID}/status/phase | Get instance phase |
| [**removeACLs**](AdminApi.md#removeACLs) | **DELETE** /address/access/{pool} | Clear Address Pool Access List |
| [**updateACL**](AdminApi.md#updateACL) | **PUT** /address/access/{poolName}/{username}/{level} | Update Address Pool Access List |


<a name="createPool"></a>
# **createPool**
> createPool(CreateAddressPoolRequest)

Add New Pool

    Creates a new address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateAddressPoolRequest** | [**CreateAddressPoolRequest**](../Models/CreateAddressPoolRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

<a name="deleteACLByUser"></a>
# **deleteACLByUser**
> AddressPoolACL deleteACLByUser(poolName, username)

Delete Address Pool Access List

    Deletes the ACL associated with a specified address pool and user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **username** | **String**| Username to assign permissions. | [default to null] |

### Return type

[**AddressPoolACL**](../Models/AddressPoolACL.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deletePool"></a>
# **deletePool**
> deletePool(poolName)

Delete Pool

    Deletes a specific address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="instanceSiUUIDLastStatePut"></a>
# **instanceSiUUIDLastStatePut**
> instanceSiUUIDLastStatePut(siUUID, state)

Set instance last state

    Overwrites the last state of the instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **state** | **String**| New state. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="instanceSiUUIDStatusPhaseGet"></a>
# **instanceSiUUIDStatusPhaseGet**
> instanceSiUUIDStatusPhaseGet(siUUID)

Get instance phase

    Retrieves the instance&#39;s orchestration phase.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeACLs"></a>
# **removeACLs**
> removeACLs(pool)

Clear Address Pool Access List

    Deletes all ACLs associated with a specified address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pool** | **Long**| ID of the address pool. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="updateACL"></a>
# **updateACL**
> AddressPoolACL updateACL(poolName, username, level)

Update Address Pool Access List

    Updates the ACL entry for a specified address pool and user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **username** | **String**| Username to assign permissions. | [default to null] |
| **level** | **String**| New permission level to set. | [default to null] [enum: NONE, READ, WRITE] |

### Return type

[**AddressPoolACL**](../Models/AddressPoolACL.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

