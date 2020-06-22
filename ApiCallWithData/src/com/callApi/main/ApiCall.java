package com.callApi.main;

import java.io.IOException;

public class ApiCall {

	public static void main(String[] args) {
		
		try {
			//GetCall.MyGETRequest();
			//PostCall.POSTRequest("Arther Morgan", "am@gmail.com", 1);
			PutCall.POSTRequest(10, "Dena1", "Denas1@gmail.com", 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
