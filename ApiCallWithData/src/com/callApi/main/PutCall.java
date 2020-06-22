package com.callApi.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PutCall {

	public static void POSTRequest(int updateEmpId, String name, String email, int desId) throws IOException {
		final String POST_PARAMS = "{\n" + "\"emp_Id\": "+updateEmpId+",\r\n" +
				"    \"emp_Name\": \""+name+"\",\r\n" +
				"    \"emp_Email\": \""+email+"\",\r\n" +
				"    \"designation_Id\": "+ desId + "\n}";
		System.out.println(POST_PARAMS);
		URL obj = new URL("http://localhost:8080/employee/employee");
		HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		postConnection.setRequestMethod("PUT");
		//	    postConnection.setRequestProperty("userId", "a1bcdefgh");
		postConnection.setRequestProperty("Content-Type", "application/json");
		postConnection.setDoOutput(true);
		OutputStream os = postConnection.getOutputStream();
		os.write(POST_PARAMS.getBytes());
		os.flush();
		os.close();
		int responseCode = postConnection.getResponseCode();
		System.out.println("POST Response Code :  " + responseCode);
		System.out.println("POST Response Message : " + postConnection.getResponseMessage());
		if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					postConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in .readLine()) != null) {
				response.append(inputLine);
			} in .close();
			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST NOT WORKED");
		}
	}

}
