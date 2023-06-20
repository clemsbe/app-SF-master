package projetTechno.SfApp.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class HttpNotFoundException extends HttpException {

    public HttpNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);

    }
}
