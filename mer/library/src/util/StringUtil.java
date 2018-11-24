package util;


/**
 *
 * @author yskn_sid25
 *
 *  プログラム内で使用する定数を用意する。
 *  このクラスに記述できる定数は、JSP・サーブレットのURLなど、その他の設定用文字列とします。
 *
 *  クエリ系の文字列 -> util.StringQuery.java に記述してください。
 *
 *	・Actionクラスは○...○...
 *	  ○は大文字。
 *
 *	・URLは○... +  . + ○...
 *
 *
 */

public class StringUtil {

	/**
	 *
	 * エンコーディング
	 *
	 */
	public static final String SET_ENCODING = "UTF-8";

	/**
	 *
	 * DB接続用文字列
	 *
	 */

	//ドライバクラス名
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

	//接続するDBのURL
	public static final String DRIVER_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	//DBに接続するためのユーザー名
	public static final String DRIVER_USER_NAME = "library";

	//DBに接続するためのパスワード
	public static final String DRIVER_PASSWORD = "systemsss";


	/**
	 *
	 * Servlet内用URL文字列
	 *
	 */

	//Action変換前
	public static final String BEFORE_REPLACE_a = ".a";

	//ACTION変換後
	public static final String AFTER_REPLACE_A = "A";

	//パッケージ名
	public static final String PACKAGE = "action.";

	// .
	public static final String DOT = ".";

	// /
	public static final String SLASH = "/";

	//viewフォルダ
	public static final String VIEW_FOLDER = "view";

	//jsp拡張子
	public static final String JSP_EXTENSION = "jsp";

	//エラー画面へ
	public static final String PAGE_ERROR = "error";

	//menuページ
	public static final String PAGE_MENU = "menu";

	//貸出ページ
	public static final String PAGE_BORROW = "borrow";

	//貸出確認ページ
	public static final String PAGE_LEND_CHECK = "lend_check";

	//貸出完了画面
	public static final String PAGE_LEND_COMPLETE = "lend_complete";

	//全件検索画面
	public static final String PAGE_SEARCH_ALL = "search_all";

	//蔵書登録画面
	public static final String PAGE_REGIST ="regist";

	//登録内容確認画面
	public static final String PAGE_REGIST_CHECK = "regist_check";

	//登録完了画面
	public static final String PAGE_REGIST_COMPLETE = "regist_complete";

	//返却確認画面
	public static final String PAGE_RETURN_CHECK = "return_check";

	//返却完了画面
	public static final String PAGE_RETURN_COMPLETE = "return_complete";

	//貸出中蔵書確認画面
	public static final String PAGE_BORROW_NOW = "borrow_now";

	//詳細確認画面
	public static final String PAGE_DETAIL = "detail";

	//tweet検索結果画面
	public static final String TWITTERRESULT = "twitterresult";


	/**
	 *
	 * JSP内用文字列
	 * <%= %> スクリプトレットを用いる。
	 *
	 */

	//コンテキストパス
	public static final String CONTEXTPATH = "http://localhost:8085/library";

	//fullパス
	public static final String FULL_PATH = "http://localhost:8085/library/Login.action";

	//menu.cssリンク
	public static final String MENUCSS = "/library/stylesheet/menu.css";

	//login.cssリンク
	public static final String LOGINCSS = "/stylesheet/login.css";

	//input.cssリンク
	public static final String INPUTCSS = "/stylesheet/input.css";


	//main.jsリンク
	public static final String MAINJS = "../stylesheet/main.js";

	//FrontControllerジャンプ用文字列
	public static final String CONTROLLER = ".action";

	//Login画面へログアウト
	public static final String LOGOUT = "Logout";

	//借りてる本の一覧(MyPage)へ
	public static final String KASHIDASHI = "BorrowNow";

	//全件検索へ
	public static final String SEARCHALL = "SearchAll";

	//登録ページへ
	public static final String REGIST = "Regist";

	//登録確認画面へ
	public static final String REGISTCHECK = "RegistCheck";

	//登録完了画面へ
	public static final String REGISTCOMPLETE = "RegistComplete";

	//返却ページへ
	public static final String RETURN = "Return";

	//返却確認画面へ
	public static final String RETURNCHECK = "ReturnCheck";

	//貸出確認ページへ
	public static final String LENDCHECK = "LendCheck";

	//貸出完了処理へ
	public static final String LENDCOMPLETE = "LendComplete";

	//詳細検索画面へ
	public static final String DETAILSEARCH = "DetailSearch";

	//twitter検索
	public static final String TWITTER_SEARCH = "TwitterSearch";

	//ログイン処理へ
	public static final String LOGINACTION = "/Login.action";

	//メニューへ戻る
	public static final String BACKTOP = "BackTop";


	/**
	 *
	 * エラーメッセージを記載する
	 *
	 *
	 *
	 * @param
	 * @return int型 JSPでエラーメッセージを切り替えるための変数
	 *
	 */

	public static final int MOJHI_OK = 0;

	public static final int MOJHI_NULL = 1;

	public static final int MOJHI_LENGTH = 2;

	public static final int NULL_EXCEPTION = 3;

	public static final int MOJHI_ERROR = 0;


//------------------------------------------------------------------------------

	/**
	 * 本の登録関係のエラー管理用数字
	 */

	public static final int BOOKTITLE_NULL = 1;

	public static final int BOOKTITLE_LENGTH = 2;

	public static final int AUTHOR_NULL = 3;

	public static final int YEAR_OVER = 4;

	public static final int NOT_NUMBER = 5;




	//IDかPASSWORDにエラー
	public static final String IDPASS_ERROR = "ID or PassWord is mistaken.";

	//すでにログアウト済みだが何らかの理由でログアウト処理をしてしまったとき
	public static final String LOGOUT_ERROR = "ログアウト済みだぞ♡";

	//本のタイトルがnull
	public static final String BOOKTITLE_IS_NULL = "BookTitle is neccesary.";

	//本のタイトルが長すぎる
	public static final String BOOKTITLE_OVER_LENGTH = "BookTitle can enter under 50 characters.";

	//著者がnull
	public static final String AUTHOR_IS_NULL = "Author is neccesary.";

	//出版年が未来の日付
	public static final String PUBLISHYEAR_FUTURE = "Published year can regist before this year.";

	//出版年に数字以外が入力されている
	public static final String PUBLISHYEAR_INVALIDATE = "Published year can regist only number.";


	/**
	 *
	 *
	 * スコープ変数名
	 *
	 */

	//IDがnull
	public static final String SCOPE_IDPASS_ERROR = "idpass_error";

	//すでにログアウト済みだが何らかの理由でログアウト処理をしてしまったとき
	public static final String SCOPE_LOGOUT_ERROR = "logout_error";





}
