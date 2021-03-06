package com.humblecoder.pyp.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by User on 19-Sep-14.
 */
@ParseClassName("Question")
public class Question extends ParseObject {

    public Question() {}

    public static String getParseClassName() {
        return "Question";
    }

    public String getQuestionID() {
        return getObjectId();
    }

    public String getContent() {
        return getString("content");
    }

    public void setContent(String content) {
        put("content", content);
    }

    public int getContentType() {
        return getInt("contentType");
    }

    public void setContentType(int contentType) {
        put("contentType", contentType);
    }

    public String getQuestionNo() {
        return getString("questionNo");
    }

    public void setQuestionNo(String questionNo) {
        put("questionNo", questionNo);
    }

    public ParseObject getPaper() {
        return getParseObject("paper");
    }

    public void setPaper(Paper paper) {
        put("paper", paper);
    }
}
