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
import com.mastercard.api.merchantidentifier.model.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Available information the merchant such as Address, matchConfidenceScore, and locationId
 */
@ApiModel(description = "Available information the merchant such as Address, matchConfidenceScore, and locationId")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-15T12:12:45.478-05:00[America/Chicago]")
public class MerchantByCardAcceptorId {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CARD_ACCEPTOR_ID = "cardAcceptorId";
  @SerializedName(SERIALIZED_NAME_CARD_ACCEPTOR_ID)
  private String cardAcceptorId;

  public static final String SERIALIZED_NAME_LEGAL_CORPORATE_NAME = "legalCorporateName";
  @SerializedName(SERIALIZED_NAME_LEGAL_CORPORATE_NAME)
  private String legalCorporateName;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Integer locationId;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY = "merchantCategory";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY)
  private String merchantCategory;

  public static final String SERIALIZED_NAME_MERCHANT_DBA_NAME = "merchantDbaName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DBA_NAME)
  private String merchantDbaName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_SOLE_PROPRIETOR_NAME = "soleProprietorName";
  @SerializedName(SERIALIZED_NAME_SOLE_PROPRIETOR_NAME)
  private String soleProprietorName;


  public MerchantByCardAcceptorId address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public MerchantByCardAcceptorId brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * The brand name of the merchant
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DOLIUM PTY LTD", value = "The brand name of the merchant")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public MerchantByCardAcceptorId cardAcceptorId(String cardAcceptorId) {
    
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

   /**
   * The Card Acceptor ID assigned by the acquirer
   * @return cardAcceptorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C928456", value = "The Card Acceptor ID assigned by the acquirer")

  public String getCardAcceptorId() {
    return cardAcceptorId;
  }


  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }


  public MerchantByCardAcceptorId legalCorporateName(String legalCorporateName) {
    
    this.legalCorporateName = legalCorporateName;
    return this;
  }

   /**
   * Corporate legal name of the merchant
   * @return legalCorporateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DOLIUM PTY LTD", value = "Corporate legal name of the merchant")

  public String getLegalCorporateName() {
    return legalCorporateName;
  }


  public void setLegalCorporateName(String legalCorporateName) {
    this.legalCorporateName = legalCorporateName;
  }


  public MerchantByCardAcceptorId locationId(Integer locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Merchant specific location identifier
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "344147943", value = "Merchant specific location identifier")

  public Integer getLocationId() {
    return locationId;
  }


  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }


  public MerchantByCardAcceptorId merchantCategory(String merchantCategory) {
    
    this.merchantCategory = merchantCategory;
    return this;
  }

   /**
   * Merchant category code and description associated with the merchant category code for the merchant
   * @return merchantCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5533 - AUTOMOTIVE PARTS  ACCESSORIES STORES", value = "Merchant category code and description associated with the merchant category code for the merchant")

  public String getMerchantCategory() {
    return merchantCategory;
  }


  public void setMerchantCategory(String merchantCategory) {
    this.merchantCategory = merchantCategory;
  }


  public MerchantByCardAcceptorId merchantDbaName(String merchantDbaName) {
    
    this.merchantDbaName = merchantDbaName;
    return this;
  }

   /**
   * The business name of the merchant
   * @return merchantDbaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DOLIUM PTY LTD", value = "The business name of the merchant")

  public String getMerchantDbaName() {
    return merchantDbaName;
  }


  public void setMerchantDbaName(String merchantDbaName) {
    this.merchantDbaName = merchantDbaName;
  }


  public MerchantByCardAcceptorId phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "893582575", value = "phoneNumber")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public MerchantByCardAcceptorId soleProprietorName(String soleProprietorName) {
    
    this.soleProprietorName = soleProprietorName;
    return this;
  }

   /**
   * The name of the proprietor
   * @return soleProprietorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sole Proprietor Name example", value = "The name of the proprietor")

  public String getSoleProprietorName() {
    return soleProprietorName;
  }


  public void setSoleProprietorName(String soleProprietorName) {
    this.soleProprietorName = soleProprietorName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantByCardAcceptorId merchantByCardAcceptorId = (MerchantByCardAcceptorId) o;
    return Objects.equals(this.address, merchantByCardAcceptorId.address) &&
        Objects.equals(this.brandName, merchantByCardAcceptorId.brandName) &&
        Objects.equals(this.cardAcceptorId, merchantByCardAcceptorId.cardAcceptorId) &&
        Objects.equals(this.legalCorporateName, merchantByCardAcceptorId.legalCorporateName) &&
        Objects.equals(this.locationId, merchantByCardAcceptorId.locationId) &&
        Objects.equals(this.merchantCategory, merchantByCardAcceptorId.merchantCategory) &&
        Objects.equals(this.merchantDbaName, merchantByCardAcceptorId.merchantDbaName) &&
        Objects.equals(this.phoneNumber, merchantByCardAcceptorId.phoneNumber) &&
        Objects.equals(this.soleProprietorName, merchantByCardAcceptorId.soleProprietorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, brandName, cardAcceptorId, legalCorporateName, locationId, merchantCategory, merchantDbaName, phoneNumber, soleProprietorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantByCardAcceptorId {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    legalCorporateName: ").append(toIndentedString(legalCorporateName)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    merchantCategory: ").append(toIndentedString(merchantCategory)).append("\n");
    sb.append("    merchantDbaName: ").append(toIndentedString(merchantDbaName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    soleProprietorName: ").append(toIndentedString(soleProprietorName)).append("\n");
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

