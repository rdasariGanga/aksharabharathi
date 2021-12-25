package com.schoolmgmt.aksharabharathi.constants;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public enum Subject {
    ENGLISH("English"),
    HINDI("Hindi"),
    MATHEMATICS("MatheMatics"),
    GENERAL_KNOWLEDGE("General Knowledge"),
    SOCIAL_STUDIES("Social Studies");

    private final String subject;

    private Subject(String subject) {
        this.subject = subject;
    }

    public String getUserReadableValue() {
        return subject;
    }

    public static Subject getSubject(String subjectDesc) {
        return Stream.of(values()).filter(sub -> Objects.equals(sub.getUserReadableValue(), subjectDesc)).findAny().orElse(null);
    }
}
