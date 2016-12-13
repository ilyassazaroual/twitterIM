package esir3.im.libs;


import twitter4j.*;
import java.util.List;


public class SearchTweets {

	
    public static void main(String[] args) {
   
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query("@obama");
            QueryResult result;
            
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                int i = 0;
                for (Status tweet : tweets) {
                	i++;
                    System.out.println(i + " :=> @" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            

            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }
}