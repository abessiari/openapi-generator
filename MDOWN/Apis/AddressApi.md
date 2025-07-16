# AddressApi

All URIs are relative to *https://stackv.dev3.virnao.com/StackV-web/restapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**affiliateAddress**](AddressApi.md#affiliateAddress) | **PUT** /address/affiliate/{poolName}/{address}/{scope}/{uri} |  |
| [**affiliateAddressByName**](AddressApi.md#affiliateAddressByName) | **PUT** /address/affiliate/{poolName}/name/{name}/{scope}/{uri} |  |
| [**allocateAddress**](AddressApi.md#allocateAddress) | **POST** /address/allocate/{poolName} | Allocate Address |
| [**freeAddress**](AddressApi.md#freeAddress) | **DELETE** /address/allocate/{poolName}/{address}/{scope} | Delete Allocation |
| [**freeAddressByName**](AddressApi.md#freeAddressByName) | **DELETE** /address/allocate/{poolName}/name/{name}/{scope} |  |
| [**freeAddressScope**](AddressApi.md#freeAddressScope) | **DELETE** /address/allocate/{poolName}/{scope} | Delete Allocations by Scope |
| [**retrieveACLByUser**](AddressApi.md#retrieveACLByUser) | **GET** /address/access/{poolName}/{username} | Retrieve Address Pool Access List |
| [**retrieveACLs**](AddressApi.md#retrieveACLs) | **GET** /address/access/{pool} | Retrieve Address Pool Access List |
| [**retrieveAllocations**](AddressApi.md#retrieveAllocations) | **GET** /address/allocate/{poolName} | Retrieve Address Pool Allocations |
| [**retrieveAllocationsByScope**](AddressApi.md#retrieveAllocationsByScope) | **GET** /address/allocate/{poolName}/{scope} | Retrieve Address Pool Allocations by Scope |
| [**retrievePoolByName**](AddressApi.md#retrievePoolByName) | **GET** /address/pool/{poolName} | Retrieve Pool |
| [**retrievePools**](AddressApi.md#retrievePools) | **GET** /address/pool | Retrieve Pools |


<a name="affiliateAddress"></a>
# **affiliateAddress**
> affiliateAddress(poolName, address, scope, uri)



    Set affiliate to an allocated scoped address.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **address** | **String**| UTF-8 Encoded address | [default to null] |
| **scope** | **String**| Allocation scope | [default to null] |
| **uri** | **String**| Affiliated resource URI | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="affiliateAddressByName"></a>
# **affiliateAddressByName**
> affiliateAddressByName(poolName, name, scope, uri)



    Set affiliate to an allocated scoped address name.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **name** | **String**| Allocation Name. | [default to null] |
| **scope** | **String**| Scope of the allocation. | [default to null] |
| **uri** | **String**| Affiliated resource URI | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="allocateAddress"></a>
# **allocateAddress**
> List allocateAddress(poolName, AllocateAddressRequest)

Allocate Address

    Allocates a new address from an address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **AllocateAddressRequest** | [**AllocateAddressRequest**](../Models/AllocateAddressRequest.md)| Allocation request parameters. | |

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="freeAddress"></a>
# **freeAddress**
> freeAddress(poolName, address, scope)

Delete Allocation

    Remove a specific allocation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **address** | **String**| Specific UTF-8 encoded address (or &#39;all&#39; for every address in scope). | [default to null] |
| **scope** | **String**| Scope of the allocation. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="freeAddressByName"></a>
# **freeAddressByName**
> freeAddressByName(poolName, name, scope)



    Removes a named allocation from a pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **name** | **String**| Name of the allocation. | [default to null] |
| **scope** | **String**| Scope of the allocation. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="freeAddressScope"></a>
# **freeAddressScope**
> freeAddressScope(poolName, scope)

Delete Allocations by Scope

    Remove all allocations within a pool matching a specific scope.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **scope** | **String**| Scope of the allocations requested. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="retrieveACLByUser"></a>
# **retrieveACLByUser**
> AddressPoolACL retrieveACLByUser(poolName, username)

Retrieve Address Pool Access List

    Retrieve the ACL entry for a specified address pool and user.

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

<a name="retrieveACLs"></a>
# **retrieveACLs**
> List retrieveACLs(pool)

Retrieve Address Pool Access List

    Retrieves all ACLs from a specified address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pool** | **String**| Name of the address pool. | [default to null] |

### Return type

[**List**](../Models/AddressPoolACL.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveAllocations"></a>
# **retrieveAllocations**
> List retrieveAllocations(poolName)

Retrieve Address Pool Allocations

    Retrieves all allocations from a specified address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |

### Return type

[**List**](../Models/AddressAllocation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveAllocationsByScope"></a>
# **retrieveAllocationsByScope**
> List retrieveAllocationsByScope(poolName, scope)

Retrieve Address Pool Allocations by Scope

    Retrieves all allocations from a specified address pool with a specific scope.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |
| **scope** | **String**| Scope of the allocations requested. | [default to null] |

### Return type

[**List**](../Models/AddressAllocation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrievePoolByName"></a>
# **retrievePoolByName**
> AddressPoolDTO retrievePoolByName(poolName)

Retrieve Pool

    Retrieves a specific address pool.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **poolName** | **String**| Name of the address pool. | [default to null] |

### Return type

[**AddressPoolDTO**](../Models/AddressPoolDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrievePools"></a>
# **retrievePools**
> List retrievePools()

Retrieve Pools

    Retrieves all accessible address pools.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/AddressPoolDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

