# _task_uuid__uuid__get_200_response
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **BigDecimal** | Auto-generated ID. | [optional] [default to null] |
| **uuid** | **String** | The natural UUID of the task. | [optional] [default to null] |
| **taskClass** | **String** | The Java class that maps the task&#39;s configuration. | [optional] [default to null] |
| **assigned** | **String** | The assigned agent or application. This can be likened to a tag or queue/topic name. | [optional] [default to null] |
| **archived** | **Boolean** | Whether the task has been archived. | [optional] [default to null] |
| **created** | **String** | The timestamp of the task&#39;s creation. | [optional] [default to null] |
| **expires** | **String** | The timestamp of the task&#39;s expiration. | [optional] [default to null] |
| **status** | **Object** |  | [optional] [default to null] |
| **statusTime** | **String** | The timestamp of the task&#39;s last status update. | [optional] [default to null] |
| **statusMessage** | **String** | An optional message or JSON string to attach to any status update. | [optional] [default to null] |
| **config** | [**Object**](.md) | The immutable configuration of the task itself. | [optional] [default to null] |
| **expired** | **Boolean** | Whether the task has expired. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

