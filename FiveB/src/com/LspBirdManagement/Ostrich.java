package com.LspBirdManagement;

public class Ostrich extends Bird{
	
	public void fly() throws Exception {
        throw new IllegalArgumentException("Ostriches cannot fly they only run on ground..");
    }

}
