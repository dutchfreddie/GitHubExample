package collectionexamples;

public class DVDInfo implements Comparable<DVDInfo>{
	String title;
	String genre;
	int year;
	DVDInfo(String title, String genre, int year) {
	this.title = title; this.genre = genre; this.year = year;
	}
	public String toString() {
	return title + " " + genre + " " + year + "\n";
	}
	
	public String getTitle() {
		return title;	
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
		}
	
}
