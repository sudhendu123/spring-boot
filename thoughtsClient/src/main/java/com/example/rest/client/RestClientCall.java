package com.example.rest.client;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/User")
public class RestClientCall {

	//@Autowired
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
			//restTemplate.exchange(requestEntity, responseType)
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resp;
	}
	
	@RequestMapping(value = "/fetchClient",method=GET)
	public String getByUserId() {
		String httpURL="http://localhost:8080/retro/fetch";
		HttpMethod method=HttpMethod.GET;
		Map<String, String> params = new HashMap<String, String>();
		ResponseEntity<String> response = (ResponseEntity<String>) restTemplate.exchange(httpURL, method, null, String.class, params);
		System.out.println("response :"+response);
		return "OK";
	}

	
	@PostConstruct
	private void init() {
		try {
			RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.create();
			registryBuilder.register("http", PlainConnectionSocketFactory.getSocketFactory());
			registryBuilder.register("https", SSLConnectionSocketFactory.getSocketFactory());
			Registry<ConnectionSocketFactory> registry = registryBuilder.build();
			PoolingHttpClientConnectionManager httpConnectionManager = new PoolingHttpClientConnectionManager(registry);
			httpConnectionManager.setMaxTotal(100);
			httpConnectionManager.setDefaultMaxPerRoute(10);
			httpConnectionManager.closeExpiredConnections();
			httpConnectionManager.closeIdleConnections(900000, TimeUnit.MILLISECONDS);

			// Initialize HTTPClient connections for REST API calls
			RequestConfig.Builder reqConfigBuilder = RequestConfig.custom();
			RequestConfig reqConfig = reqConfigBuilder.setCircularRedirectsAllowed(true).build();
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create().setConnectionManager(httpConnectionManager)
					.setDefaultRequestConfig(reqConfig);
			CloseableHttpClient httpClient = httpClientBuilder.setKeepAliveStrategy((response, context) -> {
				return 9000;
			}).build();
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(
					httpClient);
			requestFactory.setConnectTimeout(5000);
			requestFactory.setReadTimeout(5000);
			restTemplate = new RestTemplate(requestFactory);
			List<HttpMessageConverter<?>> mc = new ArrayList<HttpMessageConverter<?>>();
			StringHttpMessageConverter json = new StringHttpMessageConverter(Charset.forName("UTF-8"));
			List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
			supportedMediaTypes.add(new MediaType("application", "json", Charset.forName("UTF-8")));
			supportedMediaTypes.add(new MediaType("text", "plain", Charset.forName("UTF-8")));
			supportedMediaTypes.add(new MediaType("application", "octet-stream", Charset.forName("UTF-8")));
			json.setSupportedMediaTypes(supportedMediaTypes);
			mc.add(json);
			restTemplate.setMessageConverters(mc);
		} catch (Exception e) {
		}
	}
}
