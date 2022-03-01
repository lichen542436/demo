package com.yixuan.contorller;

import com.yixuan.pojo.DataJson;
import com.yixuan.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;


@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping("image")
    @ResponseBody
    public DataJson uploadImage(@RequestParam(value = "file")MultipartFile multipartFile){
        //调用图片上传工具类
        String imagePath = UploadUtils.upload(multipartFile);
        DataJson dataJson = new DataJson();
        if (imagePath != null || imagePath.equals("")) {
            dataJson.setCode(1);
            dataJson.setMsg("上传成功");
            HashMap<String,String> map = new HashMap();
            map.put("src",imagePath);
            dataJson.setData(map);
        }else{
            dataJson.setCode(0);
            dataJson.setMsg("上传失败");
        }

        return dataJson;
    }
}
