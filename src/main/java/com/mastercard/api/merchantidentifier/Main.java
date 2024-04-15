package com.mastercard.api.merchantidentifier;


import com.mastercard.api.merchantidentifier.client.MerchantsApi;
import com.mastercard.api.merchantidentifier.model.MerchantByCardAcceptorIdList;
import com.mastercard.api.merchantidentifier.model.MerchantList;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;

import java.security.PrivateKey;

public class Main {

    private static final String BASE_URL = "https://sandbox.api.mastercard.com/merchant-identifier";
    private static final String CONSUMER_KEY = "yourconsumerkeystring";
    private static final String PKCS_12_KEY_FILE_PATH = "./path/to/your/signing-key.p12";
    private static final String SIGNIN_KEY_ALIAS = "yourkeyalias";
    private static final String SIGNIN_KEY_PASSWORD = "yourpassword";

    public static void main(String[] args) throws Exception  {

        try {

            PrivateKey signingKey = AuthenticationUtils.loadSigningKey(PKCS_12_KEY_FILE_PATH, SIGNIN_KEY_ALIAS, SIGNIN_KEY_PASSWORD);

            ApiClient client = new ApiClient();
            client.setBasePath(BASE_URL);
            client.setConnectTimeout(60);
            client.setDebugging(false);
            client.setHttpClient(client
                    .getHttpClient()
                    .newBuilder()
                    .addInterceptor(new OkHttpOAuth1Interceptor(CONSUMER_KEY, signingKey))
                    .build()
            );

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #1 : Get merchants by merchant descriptor" );
            MerchantsApi apiMerchantsApiInstance = new MerchantsApi(client);
            MerchantList merchantsResponse = apiMerchantsApiInstance.getMerchants("DOLIUMPTYLTDWELSHPOOLWA", "FuzzyMatch");
            System.out.println("Test #1 : Result structure: ");
            System.out.println(merchantsResponse);

            System.out.println("-------------------------------------------------------------- " );
            System.out.println("Test #2 : Get merchants by card acceptor id" );
            MerchantByCardAcceptorIdList merchantsCardAcceptorIdResponse = apiMerchantsApiInstance.getMerchantByCardAcceptorId("C928456");
            System.out.println("Test #2 : Result structure: ");
            System.out.println(merchantsCardAcceptorIdResponse);

        } catch (ApiException e) {
            System.err.println("Exception when calling Apis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

}