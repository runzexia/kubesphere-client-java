/*
 * KubeSphere Advanced
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0.0
 * Contact: kubesphere@yunify.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.kubesphere.client.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WorkspaceList contains a list of Workspace */
@ApiModel(description = "WorkspaceList contains a list of Workspace")
public class ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace> items =
      new ArrayList<ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList apiVersion(
      String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList items(
      List<ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace> items) {
    this.items = items;
    return this;
  }

  public ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList addItemsItem(
      ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   *
   * @return items
   */
  @ApiModelProperty(required = true, value = "")
  public List<ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace> getItems() {
    return items;
  }

  public void setItems(
      List<ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2Workspace> items) {
    this.items = items;
  }

  public ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList metadata(
      V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @ApiModelProperty(value = "")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList
        comGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList =
            (ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList) o;
    return Objects.equals(
            this.apiVersion,
            comGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList.apiVersion)
        && Objects.equals(
            this.items, comGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList.items)
        && Objects.equals(
            this.kind, comGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList.kind)
        && Objects.equals(
            this.metadata,
            comGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubRunzexiaKubesphereCrdSamplePkgApisIamV1alpha2WorkspaceList {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
