package com.translate.wordapp.converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.translate.wordapp.entity.BaseEntity;
import com.translate.wordapp.model.BaseModel;

/**
 * created by Abdulaziz Erel on 19:05 20.06.2020
 **/
public class WordConverter<E extends BaseEntity, M extends BaseModel> {

    private static final ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <M> M convertDto(Object from, Class<M> clazz) {
        return MAPPER.convertValue(from, clazz);
    }

    public static <E> E convertList(Object from, TypeReference<E> typeReference) {
        return MAPPER.convertValue(from, typeReference);
    }

}
