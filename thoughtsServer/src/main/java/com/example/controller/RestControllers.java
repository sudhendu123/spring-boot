package com.example.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.annotation.ReqHeaderAnno;
import com.example.dto.Users;
import com.example.exception.PhoneNotFoundException;
import com.example.service.UserService;
import com.example.service.UtilService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/User")
public class RestControllers implements InitializingBean, DisposableBean{

	private static final Logger logger = LogManager.getLogger(RestControllers.class);
	
	@Autowired
	@Qualifier(value="getUtilServiceImpl")
	UtilService utilService;
	
	@Autowired
	UserService userService;
	
	@Value("${UtilServiceImplBean.stringVar}")
	public String elString;
	
	@ApiOperation(value = "Creates user.",
		    notes = "Create a new user.")
	@RequestMapping(value = "/create",method=POST)
	@ApiResponses( {
	    @ApiResponse( code = 201, message = "user is created." )    
	} )
	public ResponseEntity<Users> createUser(
			@ApiParam(value = "This is the user resource.")
			@Valid @RequestBody Users user) {
		if(user.getPhone()<1) {
			throw new PhoneNotFoundException("phone mandatory");
		}
		userService.insert(user);
		return new ResponseEntity<Users>(user,HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Creates batch of users.",
		    notes = "Create a list of new user.")
	@RequestMapping(value = "/createUserBatch",method=POST)
	@ApiResponses( {
	    @ApiResponse( code = 201, message = "users are created." )    
	} )
	public ResponseEntity<List<Users>> createBatchUser(
			@ApiParam(value = "This is the user resource.")
			@Valid @RequestBody List<Users> user) {
		
		userService.batchCreate(user);
		return new ResponseEntity<List<Users>>(user,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/fetch/{id}",method=GET)
	public Users getByUserId(@PathVariable long id) {
		logger.debug("getByUserId debug");
		
		logger.info(utilService.getAns());
		logger.info("elString :"+elString);
		logger.info("add : "+utilService.add(1, 2));
		Users user = userService.getUserById(id);
		logger.info ("getByUserId info",user);
		return user;
	}
	
	@ReqHeaderAnno(value = "#httpRequest.getHeader(\"Content-Type\")")
	@RequestMapping(value = "/fetch",method=GET)
	public List<Users> getAllUsers(HttpServletRequest httpRequest) {
		logger.debug("getAllUsers debug");
		List<Users> user = userService.findAll();
		logger.info ("getAllUsers info");
		return user;
	}
	
	@RequestMapping(value="/delete/{id}",method=DELETE)
	public ResponseEntity<Users> deleteUser(@PathVariable long id) {
		userService.deleteById(id);
		
		return new ResponseEntity<Users>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/update",method=PUT)
	public ResponseEntity<Users> updateUser(@RequestBody Users user) {
		userService.update(user);
		
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	
	@RequestMapping(value="/upload", method=POST)
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		String readFile=null;
		BufferedReader br;
		try {
			
			InputStream is = file.getInputStream();
		     br = new BufferedReader(new InputStreamReader(is));
		     readFile =br.readLine();
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		logger.info(" uploaded file :"+readFile);
		//logger.info("user info "+user);
		return "ok";
		
	}

	@Override
	public void destroy() throws Exception {
		logger.info(" destroy() :");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info(" afterPropertiesSet() ");
	}
}
