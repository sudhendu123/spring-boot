package com.example.rest.client;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/User")
public class RestClientCall {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/uploadClient", method = POST)
	public Object uploadClient() {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = null;
		Object resp = null;
		try {
			Resource res = new ClassPathResource("static"+File.separator+"sample.json");
			InputStream fileInputStream = res.getInputStream();
			Object obj = jsonParser.parse(new InputStreamReader(fileInputStream));
			jsonObject = (JSONObject) obj;
			MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		    bodyMap.add("file", res);
		    HttpHeaders headers = new HttpHeaders();
		    //headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		    //headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, null);
			resp = restTemplate.postForObject("http://localhost:8080/uploadFile", requestEntity, Object.class);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resp;
	}

}
