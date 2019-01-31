package com.songsm.baidu.Exceptionhandle;

import com.songsm.baidu.response.BaseReponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author: ShiMing Song
 * @create: 2019-01-31 14:44
 * @description: 用一句话来描述此类的作用
 **/
@RestControllerAdvice
public class RequestExceptionHandle {


       @ExceptionHandler(MethodArgumentNotValidException.class)
       public BaseReponse valitedException(MethodArgumentNotValidException exception){

           BaseReponse baseReponse = new BaseReponse();

           baseReponse.setCode(0);
           BindingResult bindingResult = exception.getBindingResult();
           List<ObjectError> allErrors = bindingResult.getAllErrors();
           allErrors.forEach(p -> {
               FieldError fieldError = (FieldError)p;
               baseReponse.setMessage(fieldError.getDefaultMessage());
           });

           return  baseReponse;
       }
}
