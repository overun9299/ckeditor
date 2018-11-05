package soap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ZhangPY on 2018/11/4
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */
@Controller
@RequestMapping(value = "/CKEditor")
public class test {

    @RequestMapping("test")
    public String test() {

        return "index";
    }

    @RequestMapping("imageUpload")
    public void uploadEditorImage(HttpServletRequest request, HttpServletResponse response, @RequestParam("upload") MultipartFile file) {

    }
}
