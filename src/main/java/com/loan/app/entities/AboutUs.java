
package com.loan.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class AboutUs {
	
    
	private static String aboutUs;
	
	private static String history;
	 
    private static String boardOfDirectors;
	 
	private static String investorRelation;
	 
	private static String noticeBoard;

	/**
	 * @return the aboutUs
	 */
	public static String getAboutUs() {
		return aboutUs;
	}

	/**
	 * @param aboutUs the aboutUs to set
	 */
	public static void setAboutUs(String aboutUs) {
		AboutUs.aboutUs = aboutUs;
	}

	/**
	 * @return the history
	 */
	public static String getHistory() {
		return history;
	}

	/**
	 * @param history the history to set
	 */
	public static void setHistory(String history) {
		AboutUs.history = history;
	}

	/**
	 * @return the boardOfDirectors
	 */
	public static String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	/**
	 * @param boardOfDirectors the boardOfDirectors to set
	 */
	public static void setBoardOfDirectors(String boardOfDirectors) {
		AboutUs.boardOfDirectors = boardOfDirectors;
	}

	/**
	 * @return the investorRelation
	 */
	public static String getInvestorRelation() {
		return investorRelation;
	}

	/**
	 * @param investorRelation the investorRelation to set
	 */
	public static void setInvestorRelation(String investorRelation) {
		AboutUs.investorRelation = investorRelation;
	}

	/**
	 * @return the noticeBoard
	 */
	public static String getNoticeBoard() {
		return noticeBoard;
	}

	/**
	 * @param noticeBoard the noticeBoard to set
	 */
	public static void setNoticeBoard(String noticeBoard) {
		AboutUs.noticeBoard = noticeBoard;
	}

	@Override
	public String toString() {
		return "AboutUs []";
	}

	
	}
