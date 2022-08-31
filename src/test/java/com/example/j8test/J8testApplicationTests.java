package com.example.j8test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.io.*;
import java.net.*;
import static com.jayway.jsonpath.internal.path.PathCompiler.fail;

@SpringBootTest
class J8testApplicationTests {

	@Test
	public void lekeresteszt() throws Exception {
			String urlToRead="http://localhost:8081/employees/";
			System.out.println(getHTML(urlToRead));
	}

		public static String getHTML (String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(conn.getInputStream()))) {
			for (String line; (line = reader.readLine()) != null; ) {
				result.append(line);
			}
		}
		return result.toString();
	}
	}

