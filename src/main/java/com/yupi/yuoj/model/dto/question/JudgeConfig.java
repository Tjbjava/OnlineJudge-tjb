package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * @Author: Tjb
 * @CreateTime: 2024-03-11  11:20
 * @Description: 题目配置
 * @Version: 1.0
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;

}
