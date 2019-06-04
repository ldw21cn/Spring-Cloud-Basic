package com.quyc.serviceone.controller;

import com.quyc.serviceone.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: andy
 * @create: 2019/6/3 19:36
 * @description: index
 */
@RestController
@RequestMapping("index")
@Slf4j
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("")
    public String indexTwo(String name, HttpServletRequest httpServletRequest) {
        log.info("indexTwo name={}", name);
        return indexService.index(name);
    }

}
