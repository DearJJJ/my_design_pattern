package com.myself.design.pattern.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void readData() {
        System.out.println("解压文件");
        this.dataSource.readData();
    }

    @Override
    public void writeData(int data) {
        System.out.println("------压缩文件-----");
        this.dataSource.writeData(data);
    }
}
