package me.zort.housing.api.core.plot.subject.exception;

import lombok.Getter;
import me.zort.housing.api.core.plot.subject.ApiGiveCheckError;

@Getter
public class ApiConditionsNotSatisfiedException extends ApiGiveCheckException {
    private final String errorMessage;

    public ApiConditionsNotSatisfiedException(String errorMessage) {
        super(ApiGiveCheckError.CONDITIONS_NOT_SATISFIED);
        this.errorMessage = errorMessage;
    }
}
