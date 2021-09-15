package it.softwareinside.football.model;

public class Videos {

	
	
	private String title;
	private String embed;
	
	
	public Videos() {
	}


	public Videos(String title, String embed) {
		setTitle(title);
		setEmbed(embed);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEmbed() {
		return embed;
	}


	public void setEmbed(String embed) {
		this.embed = embed;
	}

	
	

	@Override
	public String toString() {
		return "Videos [title=" + title + ", embed=" + embed + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
