# Root_Schema
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **state** | **String** | The concatenated phase and state string. | [optional] [default to null] |
| **superState** | **String** |  | [optional] [default to null] |
| **subState** | **String** |  | [optional] [default to null] |
| **configState** | **String** |  | [optional] [default to null] |
| **lastState** | **String** |  | [optional] [default to null] |
| **lastError** | **String** | The last error encountered by the instance. | [optional] [default to null] |
| **alias** | **String** | The instance alias. | [optional] [default to null] |
| **uuid** | **String** | The UUID of the instance. | [optional] [default to null] |
| **owner** | **String** | The username of the owner of the instance. | [optional] [default to null] |
| **timestamp** | **String** | The creation timestamp of the instance. | [optional] [default to null] |
| **type** | **String** | The service type of the instance. | [optional] [default to null] |
| **subType** | **String** | The subsype of the instance&#39;s service type. | [optional] [default to null] |
| **archived** | **Boolean** | Whether the instance is archived (hidden from default view). | [optional] [default to null] |
| **locked** | **Boolean** | Whether the instance is locked (prevents most operations). | [optional] [default to null] |
| **modifiable** | **Boolean** | Whether the instance is modifiable (allows MODIFY operations). | [optional] [default to null] |
| **intents** | [**Object**](.md) | The service intents that belong to the instance. | [optional] [default to null] |
| **drifted** | **Boolean** | Whether the instance has been marked as unstable (service is no longer confirmed as online or valid). | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

