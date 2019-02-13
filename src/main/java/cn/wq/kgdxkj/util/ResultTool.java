package cn.wq.kgdxkj.util;

import cn.wq.kgdxkj.base.Result;
import cn.wq.kgdxkj.base.ResultCode;

/**
 * @program: SpringBoot_Demo
 * @description: 生成响应结果工具类
 * @author: Mr.Wu
 * @create: 2019-02-13 18:23
 **/
public class ResultTool {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result().setCode(ResultCode.SUCCESS).setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result().setCode(ResultCode.SUCCESS).setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result().setCode(ResultCode.FAIL).setMsg(message);
    }

    public static Result genErrorResult(String message) {
        return new Result().setCode(ResultCode.INTERNAL_SERVER_ERROR).setMsg(message);
    }
}

