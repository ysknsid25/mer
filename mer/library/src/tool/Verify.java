package tool;

import java.util.Calendar;

import util.StringUtil;

public class Verify {

	/**
	 *
	 * @param
	 * @return JSPでエラーメッセージを切り替えるための変数
	 *
	 */


	public int passwordVeryfy(String password){

		if(password.length()==0 || password.isEmpty()){

			return StringUtil.MOJHI_NULL;

		}

		return StringUtil.MOJHI_OK;


	}

	public int useidVerify(String userId){

		if(userId.length() == 0 || userId.isEmpty()){

			return StringUtil.MOJHI_NULL;

		}else if(userId.length() < 8 || userId.length() > 16){

			return StringUtil.MOJHI_LENGTH;

		}

		return StringUtil.MOJHI_OK;

	}

	public int booktitleVerify(String booktitle){

		if(booktitle == null || booktitle.isEmpty()){

			return StringUtil.BOOKTITLE_NULL;

		}else if(booktitle.length() > 50){

			return StringUtil.BOOKTITLE_LENGTH;

		}

		return StringUtil.MOJHI_OK;

	}

	public int authorVerify(String author){

		if(author == null || author.isEmpty()){

			return StringUtil.AUTHOR_NULL;

		}

		return StringUtil.MOJHI_OK;

	}

	public int publishedYearVerify(String publishday){

		try {

			int checkNum = Integer.parseInt(publishday);
			Calendar cal = Calendar.getInstance();

			if(checkNum > cal.get(Calendar.YEAR) ){

				return StringUtil.YEAR_OVER;

			}

			return StringUtil.MOJHI_OK;

		} catch (NumberFormatException e) {

			return StringUtil.NOT_NUMBER;

		}

	}
}

