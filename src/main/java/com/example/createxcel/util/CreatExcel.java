package com.example.createxcel.util;

import com.example.createxcel.pojo.User;
import org.apache.poi.hssf.usermodel.*;

import java.io.*;
import java.util.List;

public class CreatExcel {
    public static void getHSSFWorkbook(List<User> users){
        //创建excel文件
        HSSFWorkbook wb=new HSSFWorkbook();
        //根据excel文件创建sheet
       HSSFSheet sheet= wb.createSheet();
       //在sheet中创建第一行(标题行)
        HSSFRow row=sheet.createRow(0);

        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

        //在titleRow   里创建列   遍历titles
        //声明列对象
        HSSFCell cell = null;
            //创建标题行
            row.createCell(0).setCellValue("用户id");
            row.createCell(1).setCellValue("用户姓名");
            row.createCell(2).setCellValue("用户性别");
            row.createCell(3).setCellValue("用户年龄");

        //创建以下的表格内容   外循环控制创建人的行数
        for(int i=0;i<users.size();i++){
            row=sheet.createRow(i+1);
            for (User user : users) {
                row.createCell(0).setCellValue(users.get(i).getId());
                row.createCell(1).setCellValue(users.get(i).getName());
                row.createCell(2).setCellValue(users.get(i).getSex());
                row.createCell(3).setCellValue(users.get(i).getAge());
            }
        }
      //定义上传位置  excel保存路径
        File file=new File("D:\\2019\\05\\29");
        OutputStream out=null;
        //判断路径是否存在
        if(file.exists()){
            file.mkdirs();
        }
        //定义文件名
        long name=System.currentTimeMillis();
        //文件输出保存
        try {
            out=new FileOutputStream(new File(file,name+".xls"));
            wb.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }





}
