package com.mrs.app.db.vo;

import java.util.Date;

public class MovieVO {
	
	private int mNum;
	private String mName;
	private Date mDate;
	private int mPrice;
	private int mSheet;

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public int getmSeat() {
		return mSheet;
	}

	public void setmSeat(int mSeat) {
		this.mSheet = mSheet;
	}

}
