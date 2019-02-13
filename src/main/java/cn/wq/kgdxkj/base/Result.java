package cn.wq.kgdxkj.base;

import com.alibaba.fastjson.JSON;

/**
 * @program: SpringBoot_Demo
 * @description: 统一API响应结果封装
 * @author: Mr.Wu
 * @create: 2019-02-13 18:25
 **/
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
