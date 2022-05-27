package com.simultechnology.vault;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Start!!");

        Map<String, String > map = new HashMap<>();
        map.put("jwt", "hvs.GvT19hdHDRLsMWsjU0qUrgCM");

        String uri = "http://127.0.0.1:8200/v1/auth/token/create";
        HttpPost httpPost = new HttpPost(uri);

        httpPost.setHeader("X-Vault-Token", "hvs.GvT19hdHDRLsMWsjU0qUrgCM");

        CloseableHttpClient client = HttpClientBuilder.create().build();
        CloseableHttpResponse response = client.execute(httpPost);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        String data = EntityUtils.toString(response.getEntity());
        System.out.println(data);
    }
}
