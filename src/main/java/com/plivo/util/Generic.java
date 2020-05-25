package com.plivo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Generic {

    public Map<Object, Object> pojoObjToMap(Object pojoGsonObject) {
        Gson gson = new Gson();
        Type type = new TypeToken<Map<Object, Object>>() {
        }.getType();
        return gson.fromJson(gson.toJson(pojoGsonObject), type);
    }

    public Map queryParam(Object queryParam) {
        Map body;
        if (queryParam.getClass().getSuperclass() == HashMap.class) {
            body = (Map) queryParam;
        } else {
            body = pojoObjToMap(queryParam);
        }
        return body;
    }
}
