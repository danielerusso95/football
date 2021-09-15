package it.softwareinside.football.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Partite {
	
	@Id
	private String title;
	private String competition;
	private String matchviewUrl;
	private String competitionUrl;
	private String thumbnail;
	private String date;
	private List<Videos> video;
	
	
	
	public Partite() {
	}



	public Partite(String title, String competition, String matchviewUrl, String competitionUrl, String thumbnail,
			String date, List<Videos> video) {
		this.title = title;
		this.competition = competition;
		this.matchviewUrl = matchviewUrl;
		this.competitionUrl = competitionUrl;
		this.thumbnail = thumbnail;
		this.date = date;
		this.video = video;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getCompetition() {
		return competition;
	}



	public void setCompetition(String competition) {
		this.competition = competition;
	}



	public String getMatchviewUrl() {
		return matchviewUrl;
	}



	public void setMatchviewUrl(String matchviewUrl) {
		this.matchviewUrl = matchviewUrl;
	}



	public String getCompetitionUrl() {
		return competitionUrl;
	}



	public void setCompetitionUrl(String competitionUrl) {
		this.competitionUrl = competitionUrl;
	}



	public String getThumbnail() {
		return thumbnail;
	}



	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}


	public List<Videos> getVideo() {
		return video;
	}



	public void setVideo(List<Videos> video) {
		this.video = video;
	}



	@Override
	public String toString() {
		return "Partite [title=" + title + ", competition=" + competition + ", matchviewUrl=" + matchviewUrl
				+ ", competitionUrl=" + competitionUrl + ", thumbnail=" + thumbnail + ", date=" + date + ", video="
				+ video + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}