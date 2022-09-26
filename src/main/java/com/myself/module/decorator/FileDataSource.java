package com.myself.module.decorator;

public class FileDataSource implements DataSource {

    @Override
    public void readData() {
        System.out.println("读取文件内容");
    }

    @Override
    public void writeData(int data) {
        System.out.println("写入文件内容 ---> " + data);
    }
}
