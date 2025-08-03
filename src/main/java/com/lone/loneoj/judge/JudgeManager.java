package com.lone.loneoj.judge;

import com.lone.loneoj.judge.strategy.DefaultJudgeStrategy;
import com.lone.loneoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.lone.loneoj.judge.strategy.JudgeContext;
import com.lone.loneoj.judge.strategy.JudgeStrategy;
import com.lone.loneoj.model.dto.questionsubmit.JudgeInfo;
import com.lone.loneoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy=new DefaultJudgeStrategy();
        if("java".equals(language)){
            judgeStrategy=new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}