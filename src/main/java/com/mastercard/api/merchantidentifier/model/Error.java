/*
 * Merchant Identifier API
 * Retrieve merchant data for a given merchant descriptor
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.merchantidentifier.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details of the error condition such as the source of the error, reason code for the error, if the error is recoverable, and details about the error
 */
@ApiModel(description = "Details of the error condition such as the source of the error, reason code for the error, if the error is recoverable, and details about the error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-15T12:12:45.478-05:00[America/Chicago]")
public class Error {
  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECOVERABLE = "Recoverable";
  @SerializedName(SERIALIZED_NAME_RECOVERABLE)
  private Boolean recoverable;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;


  public Error source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The application that generated this error
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "merchantid", required = true, value = "The application that generated this error")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public Error reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * A unique constant identifying the error case encountered during transaction processing
   * @return reasonCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TOO_MANY_MATCHES", required = true, value = "A unique constant identifying the error case encountered during transaction processing")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public Error description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Short description of the ReasonCode field
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Too many matches found.  Please refine search input", required = true, value = "Short description of the ReasonCode field")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Error recoverable(Boolean recoverable) {
    
    this.recoverable = recoverable;
    return this;
  }

   /**
   * Indicates whether this error will always be returned for this request, or retrying could change the outcome
   * @return recoverable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates whether this error will always be returned for this request, or retrying could change the outcome")

  public Boolean getRecoverable() {
    return recoverable;
  }


  public void setRecoverable(Boolean recoverable) {
    this.recoverable = recoverable;
  }


  public Error details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Description of the issue
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The search resulted in too many matches", value = "Description of the issue")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.source, error.source) &&
        Objects.equals(this.reasonCode, error.reasonCode) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.recoverable, error.recoverable) &&
        Objects.equals(this.details, error.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, reasonCode, description, recoverable, details);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

