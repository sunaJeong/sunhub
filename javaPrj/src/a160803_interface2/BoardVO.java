package a160803_interface2;

import java.util.Date;
public class BoardVO {//엔티티 클래스
	private int bbsno;
	private String writer;
	private String title;
	private String contents;
	private Date writeDate;
	
	//기본생성자
	//데이터가 없더라도 기본생성자로 만든다음 set메서드로 할당
	public BoardVO(){};
	
	//source - constructor using Fields
	public BoardVO(int bbsno, String writer, String title, String contents,
			Date writeDate) {
		super();
		this.bbsno = bbsno;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.writeDate = writeDate;
	}
	//Source - getter setter
	public int getBbsno() {
		return bbsno;
	}

	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	//Source -> generate toString
	@Override
	public String toString() {
		return "BoardVO [bbsno=" + bbsno + ", writer=" + writer + ", title="
				+ title + ", contents=" + contents + ", writeDate=" + writeDate
				+ "]";
	}

}
