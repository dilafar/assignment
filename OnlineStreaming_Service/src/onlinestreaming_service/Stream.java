package onlinestreaming_service;

public interface Stream {
		
	public int twitch_stream_per_hour = 1000;
	public int youtube_stream_hour = 2000;
	public int gaming_stream_hour = 4000;
	public int play_game_team_hour = 3000;
	
	public void DisplayStream();
	
	public int calculateBill(int qty , int price);
	
	
}
