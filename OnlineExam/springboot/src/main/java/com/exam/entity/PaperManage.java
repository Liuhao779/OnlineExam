package com.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class PaperManage {
    private Integer paperId;

    public PaperManage(Integer paperId, Integer questionType, Integer questionId) {
        this.paperId = paperId;
        this.questionType = questionType;
        this.questionId = questionId;
    }
    public PaperManage() {

    }

    private Integer questionType;

    private Integer questionId;


}