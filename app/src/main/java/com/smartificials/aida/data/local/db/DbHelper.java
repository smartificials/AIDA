package com.smartificials.aida.data.local.db;



import com.smartificials.aida.data.model.db.Option;
import com.smartificials.aida.data.model.db.Question;
import com.smartificials.aida.data.model.db.User;

import java.util.List;

import io.reactivex.Observable;


public interface DbHelper {

    Observable<List<Question>> getAllQuestions();

    Observable<List<User>> getAllUsers();

    Observable<List<Option>> getOptionsForQuestionId(Long questionId);

    Observable<Boolean> insertUser(final User user);

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveOptionList(List<Option> optionList);

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveQuestionList(List<Question> questionList);
}
