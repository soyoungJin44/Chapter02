package com.javaex.ex05;

public class Song {
	
	//<필드>
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//<생성자>
	//** 메모리에 올라간 부분에서 끊어서 표현x, 일렬로 한줄로 짤수있는 코드는 생성자에서 작성한다.
	/*
	public Song() {
		
	}
	*/
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	//<메서드>
	// [art + shift + s]
	
	//개발중 [art + shift + s]>>to string >>잘 만들어지고 있는지 체크하기위해서 출력임시로 만드는것
	


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getComposer() {
		return composer;
	}


	public void setComposer(String composer) {
		this.composer = composer;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getTrack() {
		return track;
	}


	public void setTrack(int track) {
		this.track = track;
	}


	public void showInfo() {
		System.out.println(artist +","+ title + "(" + album +", "+ year +", "+ track + "번 track, " + composer + " 작곡 )");
	}

}
