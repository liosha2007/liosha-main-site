package org.liosha.main.site.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 11.12.13
 * Time: 14:54
 */
@Controller
//@RequestMapping("/application/*")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@ModelAttribute("model")ModelMap model /* , @RequestParam("name") String name */) {

        model.addAttribute("message", "Hello to sample application with Freemarker!");
        return "Home";
    }

    @RequestMapping(value = "/json-sample", method = RequestMethod.GET)
    public ResponseEntity<String> jsonSample(String path, HttpServletResponse response) {

        String sampleJson = "{path: '" + path + "'}";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>(sampleJson, responseHeaders, HttpStatus.CREATED);
    }
}
