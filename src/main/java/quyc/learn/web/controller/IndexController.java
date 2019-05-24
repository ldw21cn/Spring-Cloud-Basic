package quyc.learn.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: andy
 * @create: 2019/5/24 17:58
 * @description: index
 */
@RestController
@Api("indexController | 这是一个测试控制器")
public class IndexController {

    @ApiOperation(value = "首页接口",notes = "只会返回一个问候")
    @ApiImplicitParam(paramType = "hello", name = "name", value = "姓名", required = true, dataTypeClass = String.class)
    @RequestMapping("/index")
    public String index(@RequestParam String name) {
        return "welcome to my springboot progrem, " + name;
    }

}
