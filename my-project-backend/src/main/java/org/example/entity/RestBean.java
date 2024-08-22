package org.example.entity;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;

public record RestBean<T>(int code, T data, String message) {

    //带参数success
    public static <T> RestBean<T> success( T data) {
        return new RestBean<>(200, data, "请求成功！");
    }

    //不带参数success
    public static <T> RestBean<T> success() {
        return success(null);
    }

    //未验证，返回401
    public static <T>RestBean<T> unAuthorized(String message) {
        return failure(401, message);
    }

    //失败
    public static <T>RestBean<T> failure(int code, String message) {
        return new RestBean<>(code, null, message);
    }

    //没有权限，返回403
    public static <T>RestBean<T> forbidden(String message) {
        return failure(403, message);
    }

    //转换为JSON格式
    public String asJsonString() {
        return JSONObject.toJSONString(this, JSONWriter.Feature.WriteNulls);
    }





}
