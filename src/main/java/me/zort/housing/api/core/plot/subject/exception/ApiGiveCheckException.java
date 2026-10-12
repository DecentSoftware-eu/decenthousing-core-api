package me.zort.housing.api.core.plot.subject.exception;

import lombok.Getter;
import me.zort.housing.api.core.plot.subject.ApiGiveCheckError;

@Getter
public class ApiGiveCheckException extends RuntimeException {
    private final ApiGiveCheckError error;

    public ApiGiveCheckException(ApiGiveCheckError error) {
        super(String.format("Failed rewards give check: %s", error.name()));
        this.error = error;
    }
}
