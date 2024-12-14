package lxg.xiaoge.io;

import java.io.*;

/**
 * FileInputStream#read()执行next下一个指针读取int(255)数据
 * returned:返回指针int数据 or -1表示返回末尾
 *
 * @author 刘
 * @version 1.0
 * @classname FileCreate
 * @description 复制文件、速率、进度、耗时
 * @date 2024/12/14 17:35
 * @see FileInputStream#read()
 * @since 1.8
 **/
public class FileBytCopy {
    public static void main(String[] args) {
        System.out.println("Message:程序开始");
        //创建初始化
        long start = System.currentTimeMillis();
        String src = "./javase/src/main/resources/1.txt";
        String src2 = "./javase/src/main/resources/2.txt";
        File file = new File(src);
        File file2 = new File(src);
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(src2);
            //执行
            int Message;
            while ((Message = inputStream.read()) != -1) {
                outputStream.write(Message);
                rate(src2, start);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("总用时:" + (double) (System.currentTimeMillis() - start) / 1000 + "秒");
        System.out.println("Message:程序结束");
    }

    /**
     * 速率
     *
     * @param src2  在写入文件中的对象
     * @param start 启动时间
     *
     * @class FileBytCopy
     * @see System#currentTimeMillis()
     */
    private static void rate(String src2, long start) {
        double v = (double) src2.length() / (System.currentTimeMillis() - start);
        if (v >= 1) {
            System.out.println("每秒:" + v + "M/s");
        } else {
            System.out.println("每秒:" + v * 1000 + "k/s");
        }

    }
}
