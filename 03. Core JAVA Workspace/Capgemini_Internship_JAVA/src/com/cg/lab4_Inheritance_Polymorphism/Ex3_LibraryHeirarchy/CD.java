package com.cg.lab4_Inheritance_Polymorphism.Ex3_LibraryHeirarchy;

public class CD extends MediaItem {
	private String artist;
	private String genre;

	CD(int id, String title, int nC, int runTime, String artist, String genre) {
		super(id, title, nC, runTime);
		this.artist = artist;
		this.genre = genre;
	}

//    Getters
	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumberOfCopies() {
		return super.getNumberOfCopies();
	}

//    Methods
	public void print() {
		super.print();
		System.out.println("Artist is: " + artist);
		System.out.println("Genre is: " + genre);
	}

//    toString
	public String toString() {
		return super.toString() + artist + genre;
	}
}
