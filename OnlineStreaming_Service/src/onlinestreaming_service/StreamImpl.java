package onlinestreaming_service;



public class StreamImpl implements Stream{

	@Override
	public void DisplayStream() {
		
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\t twitch stream per - hour \t"+ Stream.twitch_stream_per_hour);
		System.out.println("\t\t\t\t2\t youtube stream per - hour\t"+ Stream.youtube_stream_hour);
		System.out.println("\t\t\t\t3\t gaming stream per - hour\t"+ Stream.gaming_stream_hour);
		System.out.println("\t\t\t\t4\t play game with team per - hour "+ Stream.play_game_team_hour);
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
