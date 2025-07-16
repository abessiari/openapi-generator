# InstanceApi

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**instanceGet**](InstanceApi.md#instanceGet) | **GET** /instance | Generate random UUID |
| [**instanceSearchGet**](InstanceApi.md#instanceSearchGet) | **GET** /instance/{search} | Get instance details. |
| [**instanceSearchPost**](InstanceApi.md#instanceSearchPost) | **POST** /instance/{search} | Create new service instance |
| [**instanceSearchStatusGet**](InstanceApi.md#instanceSearchStatusGet) | **GET** /instance/{search}/status | Get instance status |
| [**instanceSiUUIDActionPut**](InstanceApi.md#instanceSiUUIDActionPut) | **PUT** /instance/{siUUID}/{action} | Operate on a service instance |
| [**instanceSiUUIDAliasPut**](InstanceApi.md#instanceSiUUIDAliasPut) | **PUT** /instance/{siUUID}/{alias} | Rename a service instance |
| [**instanceSiUUIDDeltasGet**](InstanceApi.md#instanceSiUUIDDeltasGet) | **GET** /instance/{siUUID}/deltas | Get instance deltas |
| [**instanceSiUUIDDriftingCorrectPut**](InstanceApi.md#instanceSiUUIDDriftingCorrectPut) | **PUT** /instance/{siUUID}/drifting/correct | Correct a drifted instance |
| [**instanceSiUUIDLastStatePut**](InstanceApi.md#instanceSiUUIDLastStatePut) | **PUT** /instance/{siUUID}/last/{state} | Set instance last state |
| [**instanceSiUUIDLockedModePut**](InstanceApi.md#instanceSiUUIDLockedModePut) | **PUT** /instance/{siUUID}/locked/{mode} | Set instance locked flag |
| [**instanceSiUUIDModifiableModePut**](InstanceApi.md#instanceSiUUIDModifiableModePut) | **PUT** /instance/{siUUID}/modifiable/{mode} | Set instance modifiable flag |
| [**instanceSiUUIDModifyPost**](InstanceApi.md#instanceSiUUIDModifyPost) | **POST** /instance/{siUUID}/modify | Modify a service instance |
| [**instanceSiUUIDPluginsGet**](InstanceApi.md#instanceSiUUIDPluginsGet) | **GET** /instance/{siUUID}/plugins | Get instance plugins. |
| [**instanceSiUUIDPluginsTypeGet**](InstanceApi.md#instanceSiUUIDPluginsTypeGet) | **GET** /instance/{siUUID}/plugins/{type} | Get instance plugin. |
| [**instanceSiUUIDPluginsTypePut**](InstanceApi.md#instanceSiUUIDPluginsTypePut) | **PUT** /instance/{siUUID}/plugins/{type} | Set instance plugin. |
| [**instanceSiUUIDProfileGet**](InstanceApi.md#instanceSiUUIDProfileGet) | **GET** /instance/{siUUID}/profile | Get instance deltas |
| [**instanceSiUUIDScheduleGet**](InstanceApi.md#instanceSiUUIDScheduleGet) | **GET** /instance/{siUUID}/schedule | Get instance schedule |
| [**instanceSiUUIDStatusConfigurationGet**](InstanceApi.md#instanceSiUUIDStatusConfigurationGet) | **GET** /instance/{siUUID}/status/configuration | Get instance configuration |
| [**instanceSiUUIDStatusPhaseGet**](InstanceApi.md#instanceSiUUIDStatusPhaseGet) | **GET** /instance/{siUUID}/status/phase | Get instance phase |
| [**instanceSiUUIDSubstatusGet**](InstanceApi.md#instanceSiUUIDSubstatusGet) | **GET** /instance/{siUUID}/substatus | Get instance substatus |
| [**instanceSiUUIDSuperstateStatePut**](InstanceApi.md#instanceSiUUIDSuperstateStatePut) | **PUT** /instance/{siUUID}/superstate/{state} | Change instance orchestration phase |


<a name="instanceGet"></a>
# **instanceGet**
> String instanceGet()

Generate random UUID

    Retrieves UUID for new instance from backend.

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSearchGet"></a>
# **instanceSearchGet**
> Root_Schema instanceSearchGet(search)

Get instance details.

    Retrieves the full status and details of a specified instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| Service instance UUID or alias. | [default to null] |

### Return type

[**Root_Schema**](../Models/Root_Schema.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSearchPost"></a>
# **instanceSearchPost**
> String instanceSearchPost(search, ServiceRequest)

Create new service instance

    Creates a new service instance with the given UUID and intent specification.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| Service instance UUID. | [default to null] |
| **ServiceRequest** | [**ServiceRequest**](../Models/ServiceRequest.md)| Service instance creation request object. | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="instanceSearchStatusGet"></a>
# **instanceSearchStatusGet**
> String instanceSearchStatusGet(search)

Get instance status

    Retrieves the full instance status.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| Service instance UUID. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDActionPut"></a>
# **instanceSiUUIDActionPut**
> instanceSiUUIDActionPut(siUUID, action, sync, verify, force, proceed, intent)

Operate on a service instance

    Commit an operation for specified service instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| service instance UUID | [default to null] |
| **action** | [**Operation**](../Models/.md)| Service operation requested  * &#x60;cancel&#x60; - Composite service to cancel, propagate, commit and verify instance.  * &#x60;release&#x60; - Composite service to cancel and propagate in 2-phase commit process.  * &#x60;verify&#x60; - Begin service verification process. | [default to null] [enum: cancel, force_cancel, release, force_release, provision, reinstate, rollback, force_retry, delete, force_delete, archive, unarchive, reset, verify, unverify] |
| **sync** | **Boolean**| Whether to commit the operation in a synchronous/blocking mode. | [optional] [default to true] |
| **verify** | **Boolean**| Whether to ensure service verifiction is run, even in the case of failure states. | [optional] [default to false] |
| **force** | **Boolean**| Whether to commit the operations in force mode. | [optional] [default to false] |
| **proceed** | **Boolean**| Whether to automatically proceed through propagate and commit. | [optional] [default to true] |
| **intent** | **String**| Explicit intent specified for certain operations. | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="instanceSiUUIDAliasPut"></a>
# **instanceSiUUIDAliasPut**
> String instanceSiUUIDAliasPut(siUUID, alias)

Rename a service instance

    Changes the instance alias of a specified UUID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **alias** | **String**| New alias to set. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDDeltasGet"></a>
# **instanceSiUUIDDeltasGet**
> _instance__siUUID__deltas_get_200_response instanceSiUUIDDeltasGet(search, siUUID)

Get instance deltas

    Retrieves the currently cached system and service deltas.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| Service instance UUID. | [default to null] |
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

[**_instance__siUUID__deltas_get_200_response**](../Models/_instance__siUUID__deltas_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDDriftingCorrectPut"></a>
# **instanceSiUUIDDriftingCorrectPut**
> instanceSiUUIDDriftingCorrectPut(siUUID)

Correct a drifted instance

    Commits the appropriate correction operation for an instance.

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

<a name="instanceSiUUIDLockedModePut"></a>
# **instanceSiUUIDLockedModePut**
> instanceSiUUIDLockedModePut(siUUID, mode)

Set instance locked flag

    Enables or disables the locked option for the instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **mode** | **Boolean**| New value. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="instanceSiUUIDModifiableModePut"></a>
# **instanceSiUUIDModifiableModePut**
> instanceSiUUIDModifiableModePut(siUUID, mode)

Set instance modifiable flag

    Enables or disables the modifiable option for the instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **mode** | **Boolean**| New value. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="instanceSiUUIDModifyPost"></a>
# **instanceSiUUIDModifyPost**
> instanceSiUUIDModifyPost(siUUID, ServiceRequest)

Modify a service instance

    Composite service to modify/recompile, propagate, commit and verify (will create a new intent)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| service instance UUID | [default to null] |
| **ServiceRequest** | [**ServiceRequest**](../Models/ServiceRequest.md)| Service instance creation request object. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

<a name="instanceSiUUIDPluginsGet"></a>
# **instanceSiUUIDPluginsGet**
> List instanceSiUUIDPluginsGet(siUUID)

Get instance plugins.

    Retrieves the array of plugin configurations for an instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDPluginsTypeGet"></a>
# **instanceSiUUIDPluginsTypeGet**
> _instance__siUUID__plugins__type__get_200_response instanceSiUUIDPluginsTypeGet(siUUID, type)

Get instance plugin.

    Retrieves a specific plugin configuration for an instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **type** | **String**| Service instance UUID. | [default to null] |

### Return type

[**_instance__siUUID__plugins__type__get_200_response**](../Models/_instance__siUUID__plugins__type__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDPluginsTypePut"></a>
# **instanceSiUUIDPluginsTypePut**
> instanceSiUUIDPluginsTypePut(siUUID, type, body)

Set instance plugin.

    Sets a specific plugin configuration for an instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **type** | **String**| Service instance UUID. | [default to null] |
| **body** | **Object**| New configuration value. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="instanceSiUUIDProfileGet"></a>
# **instanceSiUUIDProfileGet**
> _instance__siUUID__deltas_get_200_response instanceSiUUIDProfileGet(search, siUUID)

Get instance deltas

    Retrieves the currently cached system and service deltas.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| Service instance UUID. | [default to null] |
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

[**_instance__siUUID__deltas_get_200_response**](../Models/_instance__siUUID__deltas_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDScheduleGet"></a>
# **instanceSiUUIDScheduleGet**
> _instance__siUUID__schedule_get_200_response instanceSiUUIDScheduleGet(siUUID)

Get instance schedule

    Retrieves the current scheduling information for an instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

[**_instance__siUUID__schedule_get_200_response**](../Models/_instance__siUUID__schedule_get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDStatusConfigurationGet"></a>
# **instanceSiUUIDStatusConfigurationGet**
> String instanceSiUUIDStatusConfigurationGet(siUUID)

Get instance configuration

    Retrieves the instance&#39;s configuration status.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

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

<a name="instanceSiUUIDSubstatusGet"></a>
# **instanceSiUUIDSubstatusGet**
> String instanceSiUUIDSubstatusGet(siUUID)

Get instance substatus

    Retrieves only the backend service status.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="instanceSiUUIDSuperstateStatePut"></a>
# **instanceSiUUIDSuperstateStatePut**
> instanceSiUUIDSuperstateStatePut(siUUID, state)

Change instance orchestration phase

    Updates the orchestration phase of the specified service instance.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **siUUID** | **String**| Service instance UUID. | [default to null] |
| **state** | **String**| New orchestration phase. | [default to null] [enum: CREATE, CANCEL, REINSTATE, MODIFY] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

