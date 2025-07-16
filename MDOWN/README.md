# Documentation for StackV Orchestrator Developer API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AddressApi* | [**affiliateAddress**](Apis/AddressApi.md#affiliateaddress) | **PUT** /address/affiliate/{poolName}/{address}/{scope}/{uri} | Set affiliate to an allocated scoped address. |
*AddressApi* | [**affiliateAddressByName**](Apis/AddressApi.md#affiliateaddressbyname) | **PUT** /address/affiliate/{poolName}/name/{name}/{scope}/{uri} | Set affiliate to an allocated scoped address name. |
*AddressApi* | [**allocateAddress**](Apis/AddressApi.md#allocateaddress) | **POST** /address/allocate/{poolName} | Allocate Address |
*AddressApi* | [**freeAddress**](Apis/AddressApi.md#freeaddress) | **DELETE** /address/allocate/{poolName}/{address}/{scope} | Delete Allocation |
*AddressApi* | [**freeAddressByName**](Apis/AddressApi.md#freeaddressbyname) | **DELETE** /address/allocate/{poolName}/name/{name}/{scope} | Removes a named allocation from a pool. |
*AddressApi* | [**freeAddressScope**](Apis/AddressApi.md#freeaddressscope) | **DELETE** /address/allocate/{poolName}/{scope} | Delete Allocations by Scope |
*AddressApi* | [**retrieveACLByUser**](Apis/AddressApi.md#retrieveaclbyuser) | **GET** /address/access/{poolName}/{username} | Retrieve Address Pool Access List |
*AddressApi* | [**retrieveACLs**](Apis/AddressApi.md#retrieveacls) | **GET** /address/access/{pool} | Retrieve Address Pool Access List |
*AddressApi* | [**retrieveAllocations**](Apis/AddressApi.md#retrieveallocations) | **GET** /address/allocate/{poolName} | Retrieve Address Pool Allocations |
*AddressApi* | [**retrieveAllocationsByScope**](Apis/AddressApi.md#retrieveallocationsbyscope) | **GET** /address/allocate/{poolName}/{scope} | Retrieve Address Pool Allocations by Scope |
*AddressApi* | [**retrievePoolByName**](Apis/AddressApi.md#retrievepoolbyname) | **GET** /address/pool/{poolName} | Retrieve Pool |
*AddressApi* | [**retrievePools**](Apis/AddressApi.md#retrievepools) | **GET** /address/pool | Retrieve Pools |
| *AdminApi* | [**createPool**](Apis/AdminApi.md#createpool) | **POST** /address/pool | Add New Pool |
*AdminApi* | [**deleteACLByUser**](Apis/AdminApi.md#deleteaclbyuser) | **DELETE** /address/access/{poolName}/{username} | Delete Address Pool Access List |
*AdminApi* | [**deletePool**](Apis/AdminApi.md#deletepool) | **DELETE** /address/pool/{poolName} | Delete Pool |
*AdminApi* | [**instanceSiUUIDLastStatePut**](Apis/AdminApi.md#instancesiuuidlaststateput) | **PUT** /instance/{siUUID}/last/{state} | Set instance last state |
*AdminApi* | [**instanceSiUUIDStatusPhaseGet**](Apis/AdminApi.md#instancesiuuidstatusphaseget) | **GET** /instance/{siUUID}/status/phase | Get instance phase |
*AdminApi* | [**removeACLs**](Apis/AdminApi.md#removeacls) | **DELETE** /address/access/{pool} | Clear Address Pool Access List |
*AdminApi* | [**updateACL**](Apis/AdminApi.md#updateacl) | **PUT** /address/access/{poolName}/{username}/{level} | Update Address Pool Access List |
| *InstanceApi* | [**instanceGet**](Apis/InstanceApi.md#instanceget) | **GET** /instance | Generate random UUID |
*InstanceApi* | [**instanceSearchGet**](Apis/InstanceApi.md#instancesearchget) | **GET** /instance/{search} | Get instance details. |
*InstanceApi* | [**instanceSearchPost**](Apis/InstanceApi.md#instancesearchpost) | **POST** /instance/{search} | Create new service instance |
*InstanceApi* | [**instanceSearchStatusGet**](Apis/InstanceApi.md#instancesearchstatusget) | **GET** /instance/{search}/status | Get instance status |
*InstanceApi* | [**instanceSiUUIDActionPut**](Apis/InstanceApi.md#instancesiuuidactionput) | **PUT** /instance/{siUUID}/{action} | Operate on a service instance |
*InstanceApi* | [**instanceSiUUIDAliasPut**](Apis/InstanceApi.md#instancesiuuidaliasput) | **PUT** /instance/{siUUID}/{alias} | Rename a service instance |
*InstanceApi* | [**instanceSiUUIDDeltasGet**](Apis/InstanceApi.md#instancesiuuiddeltasget) | **GET** /instance/{siUUID}/deltas | Get instance deltas |
*InstanceApi* | [**instanceSiUUIDDriftingCorrectPut**](Apis/InstanceApi.md#instancesiuuiddriftingcorrectput) | **PUT** /instance/{siUUID}/drifting/correct | Correct a drifted instance |
*InstanceApi* | [**instanceSiUUIDLastStatePut**](Apis/InstanceApi.md#instancesiuuidlaststateput) | **PUT** /instance/{siUUID}/last/{state} | Set instance last state |
*InstanceApi* | [**instanceSiUUIDLockedModePut**](Apis/InstanceApi.md#instancesiuuidlockedmodeput) | **PUT** /instance/{siUUID}/locked/{mode} | Set instance locked flag |
*InstanceApi* | [**instanceSiUUIDModifiableModePut**](Apis/InstanceApi.md#instancesiuuidmodifiablemodeput) | **PUT** /instance/{siUUID}/modifiable/{mode} | Set instance modifiable flag |
*InstanceApi* | [**instanceSiUUIDModifyPost**](Apis/InstanceApi.md#instancesiuuidmodifypost) | **POST** /instance/{siUUID}/modify | Modify a service instance |
*InstanceApi* | [**instanceSiUUIDPluginsGet**](Apis/InstanceApi.md#instancesiuuidpluginsget) | **GET** /instance/{siUUID}/plugins | Get instance plugins. |
*InstanceApi* | [**instanceSiUUIDPluginsTypeGet**](Apis/InstanceApi.md#instancesiuuidpluginstypeget) | **GET** /instance/{siUUID}/plugins/{type} | Get instance plugin. |
*InstanceApi* | [**instanceSiUUIDPluginsTypePut**](Apis/InstanceApi.md#instancesiuuidpluginstypeput) | **PUT** /instance/{siUUID}/plugins/{type} | Set instance plugin. |
*InstanceApi* | [**instanceSiUUIDProfileGet**](Apis/InstanceApi.md#instancesiuuidprofileget) | **GET** /instance/{siUUID}/profile | Get instance deltas |
*InstanceApi* | [**instanceSiUUIDScheduleGet**](Apis/InstanceApi.md#instancesiuuidscheduleget) | **GET** /instance/{siUUID}/schedule | Get instance schedule |
*InstanceApi* | [**instanceSiUUIDStatusConfigurationGet**](Apis/InstanceApi.md#instancesiuuidstatusconfigurationget) | **GET** /instance/{siUUID}/status/configuration | Get instance configuration |
*InstanceApi* | [**instanceSiUUIDStatusPhaseGet**](Apis/InstanceApi.md#instancesiuuidstatusphaseget) | **GET** /instance/{siUUID}/status/phase | Get instance phase |
*InstanceApi* | [**instanceSiUUIDSubstatusGet**](Apis/InstanceApi.md#instancesiuuidsubstatusget) | **GET** /instance/{siUUID}/substatus | Get instance substatus |
*InstanceApi* | [**instanceSiUUIDSuperstateStatePut**](Apis/InstanceApi.md#instancesiuuidsuperstatestateput) | **PUT** /instance/{siUUID}/superstate/{state} | Change instance orchestration phase |
| *MetadataApi* | [**metaDomainGet**](Apis/MetadataApi.md#metadomainget) | **GET** /meta/{domain} | Get Domain Records |
*MetadataApi* | [**metaDomainNameDelete**](Apis/MetadataApi.md#metadomainnamedelete) | **DELETE** /meta/{domain}/{name} | Delete a Record |
*MetadataApi* | [**metaDomainNameGet**](Apis/MetadataApi.md#metadomainnameget) | **GET** /meta/{domain}/{name} | Retrieve a Record |
*MetadataApi* | [**metaDomainNamePolicyGet**](Apis/MetadataApi.md#metadomainnamepolicyget) | **GET** /meta/{domain}/{name}/policy | Retrieve Record Policies |
*MetadataApi* | [**metaDomainNamePolicyIdIdGet**](Apis/MetadataApi.md#metadomainnamepolicyididget) | **GET** /meta/{domain}/{name}/policy/id/{id} | Retrieve a Policy |
*MetadataApi* | [**metaDomainNamePolicyPost**](Apis/MetadataApi.md#metadomainnamepolicypost) | **POST** /meta/{domain}/{name}/policy | Register a Policy |
*MetadataApi* | [**metaDomainNamePost**](Apis/MetadataApi.md#metadomainnamepost) | **POST** /meta/{domain}/{name} | Register a Record |
*MetadataApi* | [**metaDomainNameUpdatePut**](Apis/MetadataApi.md#metadomainnameupdateput) | **PUT** /meta/{domain}/{name}/update | Updates a Record |
*MetadataApi* | [**metaGet**](Apis/MetadataApi.md#metaget) | **GET** /meta | Get All Records |
| *TaskApi* | [**taskAssignedAssignedDelete**](Apis/TaskApi.md#taskassignedassigneddelete) | **DELETE** /task/assigned/{assigned} | Delete assigned tasks |
*TaskApi* | [**taskAssignedAssignedGet**](Apis/TaskApi.md#taskassignedassignedget) | **GET** /task/assigned/{assigned} | Retrieve all assigned tasks |
*TaskApi* | [**taskUuidUuidDelete**](Apis/TaskApi.md#taskuuiduuiddelete) | **DELETE** /task/uuid/{uuid} | Delete a task |
*TaskApi* | [**taskUuidUuidGet**](Apis/TaskApi.md#taskuuiduuidget) | **GET** /task/uuid/{uuid} | Retrieve specific task |
*TaskApi* | [**taskUuidUuidPut**](Apis/TaskApi.md#taskuuiduuidput) | **PUT** /task/uuid/{uuid} | Update a task |
*TaskApi* | [**taskUuidUuidStatusPut**](Apis/TaskApi.md#taskuuiduuidstatusput) | **PUT** /task/uuid/{uuid}/{status} | Update a task status |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AddressAllocation](./Models/AddressAllocation.md)
 - [AddressPool](./Models/AddressPool.md)
 - [AddressPoolACL](./Models/AddressPoolACL.md)
 - [AddressPoolDTO](./Models/AddressPoolDTO.md)
 - [AddressRangeDTO](./Models/AddressRangeDTO.md)
 - [AllocateAddressRequest](./Models/AllocateAddressRequest.md)
 - [AllocateParams](./Models/AllocateParams.md)
 - [CreateAddressPoolRequest](./Models/CreateAddressPoolRequest.md)
 - [Delta](./Models/Delta.md)
 - [FullProfile](./Models/FullProfile.md)
 - [Intent](./Models/Intent.md)
 - [IntentExpanded](./Models/IntentExpanded.md)
 - [Operation](./Models/Operation.md)
 - [ProfileLicense](./Models/ProfileLicense.md)
 - [Root_Schema](./Models/Root_Schema.md)
 - [SENSE_Metadata](./Models/SENSE_Metadata.md)
 - [SENSE_Metadata_Policy](./Models/SENSE_Metadata_Policy.md)
 - [SENSE_Metadata_Policy_1](./Models/SENSE_Metadata_Policy_1.md)
 - [SENSE_Metadata_Update_DTO](./Models/SENSE_Metadata_Update_DTO.md)
 - [SENSE_Task_Update_DTO](./Models/SENSE_Task_Update_DTO.md)
 - [ServiceIntent](./Models/ServiceIntent.md)
 - [ServiceProfileRef](./Models/ServiceProfileRef.md)
 - [ServiceRequest](./Models/ServiceRequest.md)
 - [SlimProfile](./Models/SlimProfile.md)
 - [VerificationResult](./Models/VerificationResult.md)
 - [_instance__siUUID__deltas_get_200_response](./Models/_instance__siUUID__deltas_get_200_response.md)
 - [_instance__siUUID__deltas_get_200_response_system](./Models/_instance__siUUID__deltas_get_200_response_system.md)
 - [_instance__siUUID__plugins__type__get_200_response](./Models/_instance__siUUID__plugins__type__get_200_response.md)
 - [_instance__siUUID__schedule_get_200_response](./Models/_instance__siUUID__schedule_get_200_response.md)
 - [_instance__siUUID__schedule_get_200_response_end](./Models/_instance__siUUID__schedule_get_200_response_end.md)
 - [_instance__siUUID__schedule_get_200_response_start](./Models/_instance__siUUID__schedule_get_200_response_start.md)
 - [_meta__domain___name__post_request](./Models/_meta__domain___name__post_request.md)
 - [_task_assigned__assigned__delete_204_response](./Models/_task_assigned__assigned__delete_204_response.md)
 - [_task_uuid__uuid__get_200_response](./Models/_task_uuid__uuid__get_200_response.md)
 - [inline_object](./Models/inline_object.md)
 - [inline_object_data](./Models/inline_object_data.md)
 - [inline_object_meta](./Models/inline_object_meta.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://auth.dev3.virnao.com/auth/realms/StackV/protocol/openid-connect/auth
- **Scopes**: 
  - openid: OIDC Mode.

