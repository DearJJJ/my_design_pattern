package com.myself.design.pattern.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void readData() {
        System.out.println("判断是否编码");
        this.dataSource.readData();
    }

    @Override
    public void writeData(int data) {
        System.out.println("------进行编码------");
        this.dataSource.writeData(data);
    }
}
