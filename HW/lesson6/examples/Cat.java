package lesson6.examples;

public class Cat implements Animal {
	private String voice=" ";
	private String feed=" ";
	
	public Cat() {}

	public Cat(String voice, String feed) {
		this.voice = voice;
		this.feed = feed;
	}
	
	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	@Override
	public String voice() {
		return voice;
	}

	@Override
	public String feed() {
		return feed;
	}
	
	@Override
	public String toString() {
		return "Cat [voice=" + voice + ", feed=" + feed + "]";
	}
	
}
