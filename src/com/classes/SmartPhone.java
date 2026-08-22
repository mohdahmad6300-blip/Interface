package com.classes;

public class SmartPhone implements Camera, MusicPlayer 
{

	@Override
	public void playMusic() {
		System.out.println("Play Music By Music Player .. ");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Takes Photo Via Camera .. ");
		
	}

	@Override
	public void takeVedio() {
		System.out.println("Shoot Vedio via Camera .. ");
		
	}

}
