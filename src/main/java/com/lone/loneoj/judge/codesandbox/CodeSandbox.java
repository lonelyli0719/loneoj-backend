package com.lone.loneoj.judge.codesandbox;

import com.lone.loneoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lone.loneoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}