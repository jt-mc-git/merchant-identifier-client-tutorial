# Merchant Identifier API Client
[![](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/Mastercard/loyalty-user-management-reference/blob/master/LICENSE)


## Overview <a name="overview"/>
This project showcases the use case of retrieving location data and related information using the Merchant Identifier API [here](https://developer.mastercard.com/merchant-identifier/documentation/)

### Compatibility <a name="compatibility"></a>
* [Java 11](https://www.oracle.com/java/technologies/downloads/#java11) or later

### References <a name="references"></a>
* [Mastercard’s OAuth Signer library](https://github.com/Mastercard/oauth1-signer-java)
* [Using OAuth 1.0a to Access Mastercard APIs](https://developer.mastercard.com/platform/documentation/using-oauth-1a-to-access-mastercard-apis/)

### Tutorial <a name="tutorial"></a>
A tutorial can be found [here](https://developer.mastercard.com/merchant-identifier/documentation/tutorials-and-guides/tutorials/tutorial-client-1/) for setting up and using this service.

## Frameworks <a name="frameworks"></a>
- OpenAPI Generator
- [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
- [Maven](https://maven.apache.org/download.cgi)

## Setup <a name="setup"></a>

### Prerequisites <a name="prerequisites"></a>

* [Mastercard Developers Account](https://developer.mastercard.com/dashboard)
* A text editor or IDE
* [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
* [Apache Maven 3.3+](https://maven.apache.org/download.cgi)
* Set up the `JAVA_HOME` environment variable to match the location of your Java installation.

### Application Configuration <a name="configuration"> </a>
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Copy the [Merchant Identifier API Spec](https://developer.mastercard.com/merchant-identifier/documentation/api-reference/) to your local drive
3. Create a new project and add the 'Merchant Identifier' API to your project.
4. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
5. Copy the downloaded `.p12` file to your local drive.
6. Update the properties found in `src/main/java/com/mastercard/api/merchantidentifier/Main.java`.

```java

private static final String BASE_URL = "https://sandbox.api.mastercard.com/merchant-identifier";
private static final String CONSUMER_KEY = "yourconsumerkeystring";
private static final String PKCS_12_KEY_FILE_PATH = "./path/to/your/signing-key.p12";
private static final String SIGNIN_KEY_ALIAS = "yourkeyalias";
private static final String SIGNIN_KEY_PASSWORD = "yourpassword";

```

7. run `mvn compile exec:java` to run the project.


## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com/merchant-identifier*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MerchantsApi* | [**getMerchantByCardAcceptorId**](docs/MerchantsApi.md#getMerchantByCardAcceptorId) | **GET** /merchants-by-card-acceptor-ids | Get matched merchant information for a given card acceptor id
*MerchantsApi* | [**getMerchantByTaxId**](docs/MerchantsApi.md#getMerchantByTaxId) | **GET** /merchants-by-tax-ids | Get merchant information for a given tax id
*MerchantsApi* | [**getMerchants**](docs/MerchantsApi.md#getMerchants) | **GET** /merchants | Get matched merchants for a given merchant descriptor


## Documentation for Models

 - [Address](docs/Address.md)
 - [Country](docs/Country.md)
 - [CountrySubDivision](docs/CountrySubDivision.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Errors](docs/Errors.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantByCardAcceptorId](docs/MerchantByCardAcceptorId.md)
 - [MerchantByCardAcceptorIdList](docs/MerchantByCardAcceptorIdList.md)
 - [MerchantByTaxId](docs/MerchantByTaxId.md)
 - [MerchantByTaxIdList](docs/MerchantByTaxIdList.md)
 - [MerchantList](docs/MerchantList.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apisupport@mastercard.com

