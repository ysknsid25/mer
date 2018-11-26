package bean;

import java.util.Date;

public class Book  implements java.io.Serializable{

	private int bookId;
	private String bookTitle;
	private String author;
	private String publisher;
	private Date publishDay;
	private String runame;
	private Date registDay;
	private String buname;
	private Date returnDay;
	private int returnFlg;
	private int category;


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getRuname() {
		return runame;
	}


	public void setRuname(String runame) {
		this.runame = runame;
	}


	public Date getPublishDay() {
		return publishDay;
	}


	public void setPublishDay(Date publishDay) {
		this.publishDay = publishDay;
	}


	public Date getRegistDay() {
		return registDay;
	}


	public void setRegistDay(Date registDay) {
		this.registDay = registDay;
	}


	public String getBuname() {
		return buname;
	}


	public void setBuname(String buname) {
		this.buname = buname;
	}


	public Date getReturnDay() {
		return returnDay;
	}


	public void setReturnDay(Date returnDay) {
		this.returnDay = returnDay;
	}


	public int getReturnFlg() {
		return returnFlg;
	}


	public void setReturnFlg(int returnFlg) {
		this.returnFlg = returnFlg;
	}


	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}



}
