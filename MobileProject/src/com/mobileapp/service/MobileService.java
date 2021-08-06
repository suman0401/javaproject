package com.mobileapp.service;

import com.mobileapp.exception.MobException;
import com.mobileapp.model.*;

public interface MobileService {
	Mobile getbyMobileId(int mobileId) throws MobException;
	Mobile[] getAll();
	Mobile[] getbyBrand(String brand) throws MobException;

}
