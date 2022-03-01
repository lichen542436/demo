package com.yixuan.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtils {
    //定义上传路径
    private static final String BASE_PATH = "C:\\Users\\李晨\\IdeaProjects\\demo\\src\\main\\resources\\static\\images\\";

    //定义访问路径
    private static final String SERVER_PATH="http://localhost:8080/images/";

    public static String upload(MultipartFile file){
        //获取上传图片的名称
        String fileName = file.getOriginalFilename();
        //UUID对fileName改写
        String uuid = UUID.randomUUID().toString().replace("-","");
        //uuid拼接fileName
        String newFileName = uuid+"-"+fileName;
        //创建实例对象
        File image = new File(BASE_PATH,newFileName);
        //文件上传
        try{
            file.transferTo(image);
        }catch (IOException e){
            return null;
        }
        return SERVER_PATH+newFileName;
    }
}
