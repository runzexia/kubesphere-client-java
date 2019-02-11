# DevopsKubesphereIoV1alpha2Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#createDevOpsProject) | **POST** /apis/devops.kubesphere.io/v1alpha2/devopsprojects | 
[**deleteCollectionDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#deleteCollectionDevOpsProject) | **DELETE** /apis/devops.kubesphere.io/v1alpha2/devopsprojects | 
[**deleteDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#deleteDevOpsProject) | **DELETE** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name} | 
[**getAPIResources**](DevopsKubesphereIoV1alpha2Api.md#getAPIResources) | **GET** /apis/devops.kubesphere.io/v1alpha2/ | 
[**listDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#listDevOpsProject) | **GET** /apis/devops.kubesphere.io/v1alpha2/devopsprojects | 
[**patchDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#patchDevOpsProject) | **PATCH** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name} | 
[**patchDevOpsProjectStatus**](DevopsKubesphereIoV1alpha2Api.md#patchDevOpsProjectStatus) | **PATCH** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name}/status | 
[**readDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#readDevOpsProject) | **GET** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name} | 
[**readDevOpsProjectStatus**](DevopsKubesphereIoV1alpha2Api.md#readDevOpsProjectStatus) | **GET** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name}/status | 
[**replaceDevOpsProject**](DevopsKubesphereIoV1alpha2Api.md#replaceDevOpsProject) | **PUT** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name} | 
[**replaceDevOpsProjectStatus**](DevopsKubesphereIoV1alpha2Api.md#replaceDevOpsProjectStatus) | **PUT** /apis/devops.kubesphere.io/v1alpha2/devopsprojects/{name}/status | 


<a name="createDevOpsProject"></a>
# **createDevOpsProject**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject createDevOpsProject(body, includeUninitialized, pretty, dryRun)



create a DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = new ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject(); // ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject | 
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.createDevOpsProject(body, includeUninitialized, pretty, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#createDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)|  |
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionDevOpsProject"></a>
# **deleteCollectionDevOpsProject**
> V1Status deleteCollectionDevOpsProject(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1Status result = apiInstance.deleteCollectionDevOpsProject(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#deleteCollectionDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteDevOpsProject"></a>
# **deleteDevOpsProject**
> V1Status deleteDevOpsProject(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    V1Status result = apiInstance.deleteDevOpsProject(name, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#deleteDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

### Return type

[**V1Status**](V1Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAPIResources"></a>
# **getAPIResources**
> V1APIResourceList getAPIResources()



get available resources

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
try {
    V1APIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#getAPIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1APIResourceList**](V1APIResourceList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="listDevOpsProject"></a>
# **listDevOpsProject**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList listDevOpsProject(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList result = apiInstance.listDevOpsProject(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#listDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProjectList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchDevOpsProject"></a>
# **patchDevOpsProject**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject patchDevOpsProject(name, body, pretty, dryRun)



partially update the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.patchDevOpsProject(name, body, pretty, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#patchDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchDevOpsProjectStatus"></a>
# **patchDevOpsProjectStatus**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject patchDevOpsProjectStatus(name, body, pretty, dryRun)



partially update status of the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
Object body = null; // Object | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.patchDevOpsProjectStatus(name, body, pretty, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#patchDevOpsProjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **body** | **Object**|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readDevOpsProject"></a>
# **readDevOpsProject**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject readDevOpsProject(name, pretty)



read the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.readDevOpsProject(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#readDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readDevOpsProjectStatus"></a>
# **readDevOpsProjectStatus**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject readDevOpsProjectStatus(name, pretty)



read status of the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.readDevOpsProjectStatus(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#readDevOpsProjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceDevOpsProject"></a>
# **replaceDevOpsProject**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject replaceDevOpsProject(name, body, pretty, dryRun)



replace the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = new ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject(); // ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.replaceDevOpsProject(name, body, pretty, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#replaceDevOpsProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **body** | [**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceDevOpsProjectStatus"></a>
# **replaceDevOpsProjectStatus**
> ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject replaceDevOpsProjectStatus(name, body, pretty, dryRun)



replace status of the specified DevOpsProject

### Example
```java
// Import classes:
//import io.kubesphere.client.ApiException;
//import io.kubesphere.client.apis.DevopsKubesphereIoV1alpha2Api;


DevopsKubesphereIoV1alpha2Api apiInstance = new DevopsKubesphereIoV1alpha2Api();
String name = "name_example"; // String | name of the DevOpsProject
ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject body = new ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject(); // ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
try {
    ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject result = apiInstance.replaceDevOpsProjectStatus(name, body, pretty, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevopsKubesphereIoV1alpha2Api#replaceDevOpsProjectStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the DevOpsProject |
 **body** | [**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]

### Return type

[**ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject**](ComGithubRunzexiaKubesphereCrdSamplePkgApisDevopsV1alpha2DevOpsProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

