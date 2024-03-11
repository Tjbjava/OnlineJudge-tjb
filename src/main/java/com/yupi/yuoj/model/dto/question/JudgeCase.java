package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * @Author: Tjb
 * @CreateTime: 2024-03-11  11:20
 * @Description: 题目用例
 * @Version: 1.0
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
