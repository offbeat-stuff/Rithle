package me.theclashfruit.rithle.models

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModrinthSearchHitsModel(
  @SerializedName("project_id"         ) var projectId         : String?           = null,
  @SerializedName("project_type"       ) var projectType       : String?           = null,
  @SerializedName("slug"               ) var slug              : String?           = null,
  @SerializedName("author"             ) var author            : String?           = null,
  @SerializedName("title"              ) var title             : String?           = null,
  @SerializedName("description"        ) var description       : String?           = null,
  @SerializedName("categories"         ) var categories        : ArrayList<String> = arrayListOf(),
  @SerializedName("display_categories" ) var displayCategories : ArrayList<String> = arrayListOf(),
  @SerializedName("versions"           ) var versions          : ArrayList<String> = arrayListOf(),
  @SerializedName("downloads"          ) var downloads         : Int?              = null,
  @SerializedName("follows"            ) var follows           : Int?              = null,
  @SerializedName("icon_url"           ) var iconUrl           : String?           = null,
  @SerializedName("date_created"       ) var dateCreated       : String?           = null,
  @SerializedName("date_modified"      ) var dateModified      : String?           = null,
  @SerializedName("latest_version"     ) var latestVersion     : String?           = null,
  @SerializedName("license"            ) var license           : String?           = null,
  @SerializedName("client_side"        ) var clientSide        : String?           = null,
  @SerializedName("server_side"        ) var serverSide        : String?           = null,
  @SerializedName("gallery"            ) var gallery           : ArrayList<String> = arrayListOf()
)