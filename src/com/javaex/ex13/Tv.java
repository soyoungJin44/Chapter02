package com.javaex.ex13;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
		
	}
	
	public Tv(int channel, int volum, boolean power) {
		this.channel = channel;
		this.volume = volum;
		this.power = power;
	}

	//메서드 gs
	public int getChannel() {
		return channel;
	}
	public int getVolum() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	//메서드 일반
	public void power(boolean on) { //전원
		if(on == true) {
			power = true;
		}else if(on != true) {
			power = false;
		}
	} //전원
	
	public void channel(int channel) {
		if(channel >0 && channel <=255) {
			this.channel = channel;
		}else if(channel > 255){
			this.channel = 0;
		}
	} //채널
	
	public void channel(boolean up) {
		if(channel >0 && channel <=255) {
			channel++;
		}else if(up != true) {
			channel--;
		}
		
	} //채널 업다운

	
	public void volume(int volume) {
		if(volume >=0 && volume <=100) {
			this.volume = volume;
		}else if(volume > 100) {
			this.volume = 100;
		}
	} //볼륨
	public void volume(boolean up) {
		if(up == true) {
			volume++;
		}else if(up != true) {
			volume--;
		}
	} //볼륨 업다운
	
	
	
	public void status() {
		System.out.println("채널: " + channel);
		System.out.println("전원: " + power);
		System.out.println("볼륨: " + volume);
	}

}
