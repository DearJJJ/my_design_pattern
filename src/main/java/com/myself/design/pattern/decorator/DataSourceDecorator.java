package com.myself.design.pattern.decorator;

public class DataSourceDecorator implements DataSource {

    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void readData() {
        dataSource.readData();
    }

    @Override
    public void writeData(int data) {
        dataSource.writeData(data);
    }
}
