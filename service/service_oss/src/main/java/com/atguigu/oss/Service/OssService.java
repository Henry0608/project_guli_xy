package com.atguigu.oss.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface OssService {
    //上传头像到oss
    String uploadFileAvatar(MultipartFile file);
}
