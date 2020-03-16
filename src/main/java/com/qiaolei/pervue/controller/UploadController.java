package com.qiaolei.pervue.controller;

import com.qiaolei.pervue.api.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {


    @RequestMapping("upload")
    public ResultEntity upload(MultipartFile file){

        //文件上传
        if(!file.isEmpty() && file != null){
            //获取问价的原始名称
            String originalFilename = file.getOriginalFilename();
            //拼接一个新的名称
            String fileName = UUID.randomUUID()+"_"+originalFilename;
            //保存的文件地址
            File destFile = new File("D:\\pic",fileName);

            try {
                file.transferTo(destFile);
                String userface = "http://localhost:8083/img/"+fileName;
                return  ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ResultEntity.error();
    }
}
