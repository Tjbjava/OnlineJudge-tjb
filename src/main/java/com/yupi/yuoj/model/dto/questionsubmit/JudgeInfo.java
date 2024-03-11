package com.yupi.yuoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * @Author: Tjb
 * @CreateTime: 2024-03-11  11:20
 * @Description: 判题信息
 * @Version: 1.0
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;

}
