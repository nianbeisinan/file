package com.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
        public static void main(String[] args) {
            Thread thread = new Thread() {

                SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

                //重写run()方法
                public void run() {
                    while (true) {
                        String str = s.format(new Date());
                        System.out.println(str);
                        try {
                            //间隔时间1秒
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };thread.start();

        }



}




