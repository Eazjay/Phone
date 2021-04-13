package com.codingdojo.phoneproject;

public class Galaxy extends IPhone implements Ringable{
	
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
		
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	
	@Override
	public String ring() {
		return "Galaxy...ring...ring...ring!!!";
	}
	
	@Override
	public String unlock() {
		return "Unlocking Galaxy Phone.";
	}

	@Override
	public void displayInfo() {
		System.out.println("Info:\nVersion Number: "  + this.getVersionNumber() + "\nBattery Percentage: " + 
							this.getBatteryPercentage() + "\nCarrier: " + this.getCarrier() + "\nRingtone: " + this.getRingTone());
	}	
	
}
