package com.smartificials.aida.data.model.others;


import com.smartificials.aida.data.model.db.Option;
import com.smartificials.aida.data.model.db.Question;

import java.util.List;


public class QuestionCardData {

    public boolean mShowCorrectOptions;

    public List<Option> options;

    public Question question;

    public QuestionCardData(Question question, List<Option> options) {
        this.question = question;
        this.options = options;
    }
}
