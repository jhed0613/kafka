//package com.example.d1023.config;
//
//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.json.jackson.JacksonJsonpMapper;
//import co.elastic.clients.transport.ElasticsearchTransport;
//import co.elastic.clients.transport.rest_client.RestClientTransport;
//import org.apache.http.Header;
//import org.apache.http.HttpHost;
//import org.apache.http.message.BasicHeader;
//import org.elasticsearch.client.RestClient;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ElasticsearchConfig {
//    String serverUrl = "https://localhost:9200";
//    String apiKey = "ZjQ4TzVwSUItYXFTZk9qaGlGTng6M2g0cDZLbkNUNHlYYjFOSjQ5TGFwUQ==";
//
//    // Create the low-level client
//    RestClient restClient = RestClient
//            .builder(HttpHost.create(serverUrl))
//            .setDefaultHeaders(new Header[]{
//                    new BasicHeader("Authorization", "ApiKey " + apiKey)
//            })
//            .build();
//
//    // Create the transport with a Jackson mapper
//    ElasticsearchTransport transport = new RestClientTransport(
//            restClient, new JacksonJsonpMapper());
//
//    // And create the API client
//    ElasticsearchClient esClient = new ElasticsearchClient(transport);
//}
