package com.lone.loneoj.judge;

import com.lone.loneoj.model.entity.QuestionSubmit;
import com.lone.loneoj.model.vo.QuestionSubmitVO;

public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);
}