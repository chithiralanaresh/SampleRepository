package org.cartboot.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUserDetails(String userId,String password){
		if(userId.length() >= 1 && password.length() >= 1 ){
			return true;
		}else{
			return false;
		}
	}

}
