package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.Admin;

@Service
public class AdminValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(Admin.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","unmKey", "user name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass", "passKey","password required");
		
		Admin admin = (Admin)target;
		if(admin.getUserPass()!=null) {
			if(admin.getUserPass().length()<5) { 
				errors.rejectValue("userPass", "passKey", "password should contain more 4 chars");
			}
		}
		
		}
	
	

}
