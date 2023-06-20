package projetTechno.SfApp.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import projetTechno.SfApp.models.dtos.HttpExceptionDTO;

@Getter
public abstract class HttpException extends RuntimeException {
    private HttpExceptionDTO exception;

    public HttpException(HttpStatus status, String message) {
        super(message);
        exception = HttpExceptionDTO.builder()
                .status(status.value())
                .message(message)
                .build();
    }
}