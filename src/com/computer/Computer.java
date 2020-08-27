package com.computer;

public class Computer {
    private HardDrive drive = new HardDrive();
    public void storeDocument (String document){
      drive.storeDocument(document);
        // System.out.println(document);
    }
}
