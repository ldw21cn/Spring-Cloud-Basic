package com.quyc.apione.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: andy
 * @create: 2019/8/1 17:30
 * @description:
 */
@RestController
@RequestMapping("fallback")
public class FallbackController {

    @RequestMapping("")
    public String fallback() {
        return "this is fallback message";
    }

}
