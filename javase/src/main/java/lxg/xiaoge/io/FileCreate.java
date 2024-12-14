package lxg.xiaoge.io;

import java.io.File;
import java.io.IOException;

/**
 * @author 刘
 * @version 1.0
 * @classname FileCreate
 * @description 创建文件
 * @date 2024/12/14 17:35
 * @see File#createNewFile()
 * @since 1.8
 **/
public class FileCreate {
    public static void main(String[] args) {
        System.out.println("Message:程序开始");
        //创建初始化
        File file = new File("./javase/src/main/resources/1.txt");
        //执行创建
        try {
            boolean isNewFile = file.createNewFile();
            //创建是否成功
            if (isNewFile) {
                System.out.println("创建成功");
            } else {
                System.out.println("文件已存在");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Message:程序结束");
    }
}
