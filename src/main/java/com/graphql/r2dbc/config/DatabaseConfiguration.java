package com.graphql.r2dbc.config;

import io.r2dbc.h2.CloseableConnectionFactory;
import io.r2dbc.h2.H2Connection;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.reactivestreams.Publisher;
import org.springframework.boot.r2dbc.ConnectionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import reactor.core.publisher.Mono;

import static io.r2dbc.spi.ConnectionFactoryOptions.*;


//@Configuration
//@EnableR2dbcRepositories
public class DatabaseConfiguration {

//    public static Mono<Connection> getConnection() {
//
//        ConnectionFactoryOptions options = ConnectionFactoryOptions.builder()
//                .option(DRIVER, "h2")
//                .option(PROTOCOL, "mem")
//                .option(USER, "sa")
//                .option(PASSWORD, "password2")
//                .option(DATABASE, "testdb2")
//                .build();
//
//        ConnectionFactory connectionFactory = ConnectionFactories.get(options);
//
//        Mono<Connection> connectionMono = Mono.from(connectionFactory.create());
//
//        return connectionMono;
//    }
//
//    @Bean
//    public static ConnectionFactory getConnectionFactory() {
//
//        ConnectionFactoryOptions options = ConnectionFactoryOptions.builder()
//                .option(DRIVER, "h2")
//                .option(PROTOCOL, "mem")
//                .option(USER, "sa")
//                .option(PASSWORD, "password2")
//                .option(DATABASE, "testdb2")
//                .build();
//
//
//        ConnectionFactory connectionFactory = ConnectionFactories.get(options);
//        return ConnectionFactoryBuilder.withOptions(options.mutate()).build();
//
//    }
}
