//package com.example.d1023.config;
//
//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.elc.ElasticsearchClients;
//import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.example.d1023.repository")
//@EnableConfigurationProperties(ELKProperties.class)
//public class ElasticsearchConfig extends ElasticsearchConfiguration {
//
//    private final ELKProperties elkProperties;
//
//    public ElasticSearchConfig(ELKProperties elkProperties) {
//        this.elkProperties = elkProperties;
//    }
//
//    @Override
//    @Bean
//    public ElasticsearchClient elasticsearchClient() {
//        return ElasticsearchClients.builder()
//                .connectedTo(elkProperties.getHost())
//                .build();
//    }
//}
