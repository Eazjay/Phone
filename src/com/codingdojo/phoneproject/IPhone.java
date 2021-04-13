package com.codingdojo.phoneproject;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		return "iPhone...ring...ring...ring!!!";
	}
	
	@Override
	public String unlock() {
		return "Unlocking iPhone.";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Info:\nVersion Number: "  + this.getVersionNumber() + "\nBattery Percentage: " + 
				this.getBatteryPercentage() + "\nCarrier: " + this.getCarrier() + "\nRingtone: " + this.getRingTone());
}

}
