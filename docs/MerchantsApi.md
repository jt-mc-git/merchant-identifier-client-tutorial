# MerchantsApi

All URIs are relative to *https://api.mastercard.com/merchant-identifier*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantByCardAcceptorId**](MerchantsApi.md#getMerchantByCardAcceptorId) | **GET** /merchants-by-card-acceptor-ids | Get matched merchant information for a given card acceptor id
[**getMerchantByTaxId**](MerchantsApi.md#getMerchantByTaxId) | **GET** /merchants-by-tax-ids | Get merchant information for a given tax id
[**getMerchants**](MerchantsApi.md#getMerchants) | **GET** /merchants | Get matched merchants for a given merchant descriptor


<a name="getMerchantByCardAcceptorId"></a>
# **getMerchantByCardAcceptorId**
> MerchantByCardAcceptorIdList getMerchantByCardAcceptorId(cardAcceptorId)

Get matched merchant information for a given card acceptor id

Returns merchant details for matched merchants given a card acceptor id.  (IMPORTANT - Only card acceptor ids that can be uniquely mapped to one merchant location are accepted)

### Example
```java
// Import classes:
import com.mastercard.api.merchantidentifier.ApiClient;
import com.mastercard.api.merchantidentifier.ApiException;
import com.mastercard.api.merchantidentifier.Configuration;
import com.mastercard.api.merchantidentifier.models.*;
import com.mastercard.api.merchantidentifier.client.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/merchant-identifier");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String cardAcceptorId = "C928456"; // String | Card Acceptor Id
    try {
      MerchantByCardAcceptorIdList result = apiInstance.getMerchantByCardAcceptorId(cardAcceptorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getMerchantByCardAcceptorId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardAcceptorId** | **String**| Card Acceptor Id |

### Return type

[**MerchantByCardAcceptorIdList**](MerchantByCardAcceptorIdList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information for this merchant identifier |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

<a name="getMerchantByTaxId"></a>
# **getMerchantByTaxId**
> MerchantByTaxIdList getMerchantByTaxId(taxId, countryCode)

Get merchant information for a given tax id

Returns a list merchants details for matched merchant given a tax id

### Example
```java
// Import classes:
import com.mastercard.api.merchantidentifier.ApiClient;
import com.mastercard.api.merchantidentifier.ApiException;
import com.mastercard.api.merchantidentifier.Configuration;
import com.mastercard.api.merchantidentifier.models.*;
import com.mastercard.api.merchantidentifier.client.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/merchant-identifier");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String taxId = "30499260000114"; // String | The tax id assigned by government entity for location
    String countryCode = "BRA"; // String | ISO 3166-1 alpha-3 country code of tax id
    try {
      MerchantByTaxIdList result = apiInstance.getMerchantByTaxId(taxId, countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getMerchantByTaxId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxId** | **String**| The tax id assigned by government entity for location |
 **countryCode** | **String**| ISO 3166-1 alpha-3 country code of tax id |

### Return type

[**MerchantByTaxIdList**](MerchantByTaxIdList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information for this merchant identifier |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

<a name="getMerchants"></a>
# **getMerchants**
> MerchantList getMerchants(merchantDescriptor, matchType)

Get matched merchants for a given merchant descriptor

Returns merchant details for matched merchants given a merchant descriptor as input. (IMPORTANT - Please remove all spaces from the merchant descriptor before submitting your API request)

### Example
```java
// Import classes:
import com.mastercard.api.merchantidentifier.ApiClient;
import com.mastercard.api.merchantidentifier.ApiException;
import com.mastercard.api.merchantidentifier.Configuration;
import com.mastercard.api.merchantidentifier.models.*;
import com.mastercard.api.merchantidentifier.client.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/merchant-identifier");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String merchantDescriptor = "DOLIUMPTYLTDWELSHPOOLWA"; // String | Merchant Descriptor
    String matchType = "ExactMatch"; // String | The type of match to perform
    try {
      MerchantList result = apiInstance.getMerchants(merchantDescriptor, matchType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getMerchants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantDescriptor** | **String**| Merchant Descriptor |
 **matchType** | **String**| The type of match to perform | [optional] [default to ExactMatch]

### Return type

[**MerchantList**](MerchantList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information for this merchant identifier |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

