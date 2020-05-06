package com.yuling.zhang.web.user.controller;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author zhangshixiang
 * @date 2020-04-30 14:43
 */
@RestController
@RequestMapping("/file")
public class FileController {

    private static final String path = "C:/Users/ifnxs04/Desktop/upload/";


    @PostMapping("/upload")
    public String uploadFile(MultipartFile file) {
        if (file.isEmpty()) {
            return "file empty";
        }
        String fileName = file.getOriginalFilename();
        File saveFile = new File(path + fileName);
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdir();
        }
        try {
            file.transferTo(saveFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "upload fail";
        }
        return "success";
    }

    @GetMapping("/down")
    public String downFile(HttpServletResponse response, String fileName) throws UnsupportedEncodingException {
        if (fileName == null) {
            return "fileName is empty";
        }
        File file = new File(path + fileName);
        if (!file.exists()) {
            return "file not find";
        } else {
            response.addHeader("content-type", "application/octet-stream");
            response.addHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType("application/octet-stream");
            response.setCharacterEncoding("UTF-8");
            try {
                //创建输入对象
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream buff = new BufferedInputStream(fis);
                //创建输出对象
                OutputStream os = response.getOutputStream();
                //输出文件
                byte[] buf = new byte[1024];
                int len = buff.read(buf);
                while (len != -1) {
                    os.write(buf, 0, buf.length);
//                    System.out.println(new String(buf, 0, len));
                    len = buff.read(buf);
                }
                fis.close();
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }
}
