package com.sw.activite.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ActivityNotFoundException extends RuntimeException {
public ActivityNotFoundException() {
	
}

public ActivityNotFoundException(String message) {
	super(message);
}

public ActivityNotFoundException(String message,Throwable cause) {
	super(message,cause);
}

public ActivityNotFoundException(Throwable cause) {
	super(cause);
}


}
