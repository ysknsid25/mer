package action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import util.StringUtil;

public class TwitterSearchAction extends Action{

	/**
	 * post処理
	 */
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//検索したいハッシュタグ
		String searchTarget = "#" + req.getParameter("searchTarget");

		//Twitterのインスタンス取得
        Twitter twitter = new TwitterFactory().getInstance();

        //Queryのインスタンス生成
        Query query = new Query();

        //検索ワードを設定する
        query.setQuery(searchTarget);

        //検索結果を格納する変数を設定
        QueryResult queryResult = null;

        try {
        	//検索を実行
			queryResult = twitter.search(query);
		} catch (TwitterException e1) {
			e1.printStackTrace();
		}

        //検索した結果のヒット数を標準出力(デフォルトはMAX15件)
		System.out.println("ヒット数:" + queryResult.getTweets().size());

		List<String> result = new ArrayList<String>();

		//Listに検索結果を格納する
		for(Status tweet : queryResult.getTweets()){

			result.add(tweet.getText());

		}

		req.setAttribute("result", result);

		return StringUtil.VIEW_FOLDER + StringUtil.SLASH + StringUtil.TWITTERRESULT
				+ StringUtil.DOT + StringUtil.JSP_EXTENSION;

	}

}