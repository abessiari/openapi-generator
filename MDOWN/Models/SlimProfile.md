# SlimProfile
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **uuid** | **String** | The profile&#39;s ID. | [default to null] |
| **name** | **String** | The profile&#39;s user-given name. | [default to null] |
| **owner** | **String** | The username of the profile owner. | [optional] [default to null] |
| **description** | **String** | The profile&#39;s description. | [optional] [default to null] |
| **created** | **Date** | The profile&#39;s timestamp for creation. | [optional] [default to null] |
| **lastEdited** | **Date** | The timestamp for when the profile was last edited. | [optional] [default to null] |
| **authorized** | **Boolean** | Whether the profile carries an admin&#39;s authorization with it. | [optional] [default to null] |
| **editable** | **Boolean** | Whether the profile can be edited by licensed users. | [optional] [default to null] |
| **licenses** | [**List**](ProfileLicense.md) | The profile&#39;s collection of given licenses. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

