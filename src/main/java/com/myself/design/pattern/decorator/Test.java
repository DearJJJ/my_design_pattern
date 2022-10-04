package com.myself.design.pattern.decorator;

public class Test {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource();
        fileDataSource.readData();
        fileDataSource.writeData(123);

        System.out.println();
        System.out.println();
        System.out.println();

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        encryptionDecorator.readData();
        encryptionDecorator.writeData(123);

        System.out.println();
        System.out.println();
        System.out.println();

        CompressionDecorator compressionDecorator = new CompressionDecorator(fileDataSource);
        compressionDecorator.readData();
        compressionDecorator.writeData(123);
    }
}
