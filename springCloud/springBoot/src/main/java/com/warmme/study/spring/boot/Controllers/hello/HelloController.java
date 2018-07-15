package com.warmme.study.spring.boot.Controllers.hello;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.warmme.study.spring.boot.Controllers.Request;
import com.warmme.study.spring.boot.Controllers.Response;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/test")
public class HelloController {

	@ApiOperation(value = "hello", notes = "hello(开发责任人:刘林波)", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "fdsfjl") })
	// @ApiModelProperty(value = "基础请求类")
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public Response index(@RequestBody Request req) {
		Response res = new Response();
		res.setData("Hello World");
		return res;
	}

	@ApiOperation(value = "根据id查询", notes = "根据id查询(开发责任人:刘林波)", httpMethod = "POST")

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public Response search(@RequestBody HelloRequest req) {
		Response res = new Response();
		res.setData("Hello World" + req.getId());
		return res;
	}
}
