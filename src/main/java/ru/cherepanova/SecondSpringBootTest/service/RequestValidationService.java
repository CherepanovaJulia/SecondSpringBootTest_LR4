package ru.cherepanova.SecondSpringBootTest.service;

import jdk.jfr.Frequency;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.cherepanova.SecondSpringBootTest.exception.UnsupportedCodeException;
import ru.cherepanova.SecondSpringBootTest.exception.ValidationFailedException;
import ru.cherepanova.SecondSpringBootTest.model.Request;

@Service
public class RequestValidationService implements ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
    @Override
    public void isCodeValid(Request request) throws UnsupportedCodeException{
        if (!request.isUidValid()){
            throw new UnsupportedCodeException("uid не должен быть равен 123");
        }
    }


}





