package com.mobileapp.service;

import com.mobileapp.exception.MobException;
import com.mobileapp.model.*;

public class MobService implements MobileService {

	@Override
		// TODO Auto-generated method stub
	public Mobile getbyMobileId(int mobileId) throws MobException {
			boolean b=false;
			Mobile umobile = null;
			for (Mobile mobile : allMobiles()) {
				if ((mobile.getMobileId())==mobileId) {
					b = true;
					umobile = mobile;
				}

			}
			if (b==false) {
				throw new MobException("Invalid MobileId");
			}

			return umobile;

		}

		@Override
		public Mobile[] getAll() {

			return allMobiles();
		}

		@Override
		public Mobile[] getbyBrand(String brand) throws MobException {
			boolean b=false;
			int i=0;
			Mobile[] umobile=new Mobile[6];
			for (Mobile mobile : allMobiles()) {
				if ((mobile.getBrand()).equals(brand)) {
					b = true;
					umobile[i++] = mobile;
				}

			}
			if (b==false) {
				throw new MobException("Invalid brand name");
			}

			return umobile;
			
		}

		private Mobile[] allMobiles() {
			Mobile[] kmobile = new Mobile[6];
			kmobile[0] = new Mobile("J6","SAMSUNG",37458d,65);
			kmobile[1] = new Mobile("11","APPLE",64937d,85);
			kmobile[2] = new Mobile("V15","VIVO",6492d,78);
			kmobile[3] = new Mobile("F11","OPPO",73038d,89);
			kmobile[4] = new Mobile("U11","REALME",74038d,04);
			kmobile[5] = new Mobile("Note5","MI",74028d,064);
			return kmobile;

		

	
	}

		

}
