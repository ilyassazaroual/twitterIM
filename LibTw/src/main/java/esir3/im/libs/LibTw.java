package esir3.im.libs;

import java.util.List;

import twitter4j.*;

public class LibTw implements LibTwI {

	private Twitter twitter;

	public LibTw() {
		twitter  = new TwitterFactory().getInstance();
	}


	public String getUser(List<String> params) {

		if(params.size()<1)
		{
			return "";
		}

		Paging paging = new Paging(1, 1000);
		StringBuilder sb = new StringBuilder("");

		try {
			List<Status> statuses = twitter.getUserTimeline(params.get(0),paging);
			for(Status statut : statuses){
				if(isValid(statut, params)){
					sb.append(statut.getText()).append("\n");
				}
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
	}

	public float getPropPositif(List<String> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getPropNegatif(List<String> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean isValid(Status tweet, List<String> params) 
	{

		for(int i=1;i<params.size();i++)
		{
			if(!tweet.getText().toLowerCase().contains(params.get(i).toLowerCase()))
			{
				return false;
			}
		}
		return true;
	}

	public String getLocation(List<String> params) {

		try {
			Query query = new Query();
			query.geoCode(new GeoLocation(37.781157,-122.398720),1000.0,"mi");
			QueryResult result;
			System.out.println("Searching...");
			int Count=0;

			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					if(tweet.getGeoLocation()!=null)
						System.out.println(tweet.getGeoLocation());
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while ((query = result.nextQuery()) != null);
			System.out.println(Count);
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
			System.exit(-1);
		}

		return "";
	}

}
