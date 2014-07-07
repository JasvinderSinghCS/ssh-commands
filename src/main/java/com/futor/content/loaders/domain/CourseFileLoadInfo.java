package com.futor.content.loaders.domain;

import java.io.Serializable;

public class CourseFileLoadInfo implements Serializable
{
	private String nid;
	private String filePath;
	private String fileName;
	private String status = -1+"";
	private int noOfRows;
	private int rowsInserted;
	private int rowsUpdated;
	private int rowsNotLoaded;
	private long startTime;
	private long endTime;
	private String fileUploadedBy;
	private long fileUploadedOn;
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNoOfRows() {
		return noOfRows;
	}
	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}
	public int getRowsInserted() {
		return rowsInserted;
	}
	public void setRowsInserted(int rowsInserted) {
		this.rowsInserted = rowsInserted;
	}
	public int getRowsUpdated() {
		return rowsUpdated;
	}
	public void setRowsUpdated(int rowsUpdated) {
		this.rowsUpdated = rowsUpdated;
	}
	public int getRowsNotLoaded() {
		return rowsNotLoaded;
	}
	public void setRowsNotLoaded(int rowsNotLoaded) {
		this.rowsNotLoaded = rowsNotLoaded;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public String getFileUploadedBy() {
		return fileUploadedBy;
	}
	public void setFileUploadedBy(String fileUploadedBy) {
		this.fileUploadedBy = fileUploadedBy;
	}
	public long getFileUploadedOn() {
		return fileUploadedOn;
	}
	public void setFileUploadedOn(long fileUploadedOn) {
		this.fileUploadedOn = fileUploadedOn;
	}
	

}

