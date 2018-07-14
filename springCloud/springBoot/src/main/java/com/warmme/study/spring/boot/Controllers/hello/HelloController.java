package com.warmme.study.spring.boot.Controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
public class HelloController {

	@ApiOperation(value="获取用户列表", notes="")
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String index() {
		return "Hello World";
	}
	
	@ApiOperation(value="根据id查询", notes="")
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String search(@RequestParam HelloRequest req) {
		return "Hello World"+req.getId();
	}
}
