package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song music1 = new Song();
		Song music2 = new Song();
		Song music3 = new Song();
		
		music1.setTitle("좋은날");
		music1.setArtist("아이유");
		music1.setAlbum("Real");
		music1.setYear(2010);
		music1.setTrack(3);
		music1.setComposer("이민수");
		
		music1.showInfo();
		
		music2.setTitle("거짓말");
		music2.setArtist("BIGBANG");
		music2.setAlbum("Always");
		music2.setYear(2007);
		music2.setTrack(2);
		music2.setComposer("G-DRAGON");
		
		music2.showInfo();
		
		music3.setTitle("벛꽃엔딩");
		music3.setArtist("버스커버스커");
		music3.setAlbum("버스커버스커1집");
		music3.setYear(2012);
		music3.setTrack(4);
		music3.setComposer("장범준");
		
		music3.showInfo();
		
	
	}

}
