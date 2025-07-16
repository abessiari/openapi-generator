# TaskApi

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**taskAssignedAssignedDelete**](TaskApi.md#taskAssignedAssignedDelete) | **DELETE** /task/assigned/{assigned} | Delete assigned tasks |
| [**taskAssignedAssignedGet**](TaskApi.md#taskAssignedAssignedGet) | **GET** /task/assigned/{assigned} | Retrieve all assigned tasks |
| [**taskUuidUuidDelete**](TaskApi.md#taskUuidUuidDelete) | **DELETE** /task/uuid/{uuid} | Delete a task |
| [**taskUuidUuidGet**](TaskApi.md#taskUuidUuidGet) | **GET** /task/uuid/{uuid} | Retrieve specific task |
| [**taskUuidUuidPut**](TaskApi.md#taskUuidUuidPut) | **PUT** /task/uuid/{uuid} | Update a task |
| [**taskUuidUuidStatusPut**](TaskApi.md#taskUuidUuidStatusPut) | **PUT** /task/uuid/{uuid}/{status} | Update a task status |


<a name="taskAssignedAssignedDelete"></a>
# **taskAssignedAssignedDelete**
> _task_assigned__assigned__delete_204_response taskAssignedAssignedDelete(assigned)

Delete assigned tasks

    Removes all tasks assigned to a specific agent.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assigned** | **String**| The agent or application used as a task delineation. | [default to null] |

### Return type

[**_task_assigned__assigned__delete_204_response**](../Models/_task_assigned__assigned__delete_204_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="taskAssignedAssignedGet"></a>
# **taskAssignedAssignedGet**
> taskAssignedAssignedGet(assigned, archived)

Retrieve all assigned tasks

    Queries all tasks assigned to a specific agent.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assigned** | **String**| The agent or application used as a task delineation. | [default to null] |
| **archived** | **Boolean**| Whether to retrieve archived tasks as well. | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="taskUuidUuidDelete"></a>
# **taskUuidUuidDelete**
> _task_assigned__assigned__delete_204_response taskUuidUuidDelete(uuid)

Delete a task

    Removes a task by uuid.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**| The uuid of the requested task. | [default to null] |

### Return type

[**_task_assigned__assigned__delete_204_response**](../Models/_task_assigned__assigned__delete_204_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="taskUuidUuidGet"></a>
# **taskUuidUuidGet**
> _task_uuid__uuid__get_200_response taskUuidUuidGet(uuid)

Retrieve specific task

    Queries a task by uuid.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**| The uuid of the requested task. | [default to null] |

### Return type

[**_task_uuid__uuid__get_200_response**](../Models/_task_uuid__uuid__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="taskUuidUuidPut"></a>
# **taskUuidUuidPut**
> taskUuidUuidPut(uuid, SENSE\_Task\_Update\_DTO)

Update a task

    Updates a task via full update DTO.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**| The uuid of the requested task. | [default to null] |
| **SENSE\_Task\_Update\_DTO** | [**SENSE_Task_Update_DTO**](../Models/SENSE_Task_Update_DTO.md)| A task update DTO. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="taskUuidUuidStatusPut"></a>
# **taskUuidUuidStatusPut**
> taskUuidUuidStatusPut(uuid, status, body)

Update a task status

    Updates a task&#39;s status and message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**| The uuid of the requested task. | [default to null] |
| **status** | **String**| The new status of the requested task. | [default to null] [enum: PENDING, ACCEPTED, WAITING, FINISHED, FAILED] |
| **body** | **Object**| The new status message. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

