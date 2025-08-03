package com.lone.loneoj.judge.codesandbox.impl;

import com.lone.loneoj.judge.codesandbox.CodeSandbox;
import com.lone.loneoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lone.loneoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}