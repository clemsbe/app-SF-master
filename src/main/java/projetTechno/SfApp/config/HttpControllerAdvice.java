package projetTechno.SfApp.config;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import projetTechno.SfApp.exceptions.HttpException;
import projetTechno.SfApp.models.dtos.HttpExceptionDTO;

@ControllerAdvice
public class HttpControllerAdvice {

    @ExceptionHandler(value = {HttpException.class})
    public ResponseEntity<HttpExceptionDTO> httpExceptionHandler(HttpException exception) {
        return new ResponseEntity<>(exception.getException(), HttpStatusCode.valueOf(exception.getException().getStatus()));
    }


}
