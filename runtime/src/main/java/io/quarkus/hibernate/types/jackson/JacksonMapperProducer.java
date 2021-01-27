package io.quarkus.hibernate.types.jackson;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.Unremovable;
import io.quarkus.hibernate.types.json.JsonMapper;

@Singleton
public class JacksonMapperProducer {

    @Produces
    @Singleton
    @Unremovable
    @DefaultBean
    public JsonMapper jsonb(ObjectMapper objectMapper) {
        return new JacksonMapper(objectMapper);
    }

}