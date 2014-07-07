package com.futor.content.loaders.domain;

public class CourseFileErrorsInfo {

	private String nid;
	private String loadInfoId;
	private String rowNo;
	private String columnNo;
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getLoadInfoId() {
		return loadInfoId;
	}
	public void setLoadInfoId(String loadInfoId) {
		this.loadInfoId = loadInfoId;
	}
	public String getRowNo() {
		return rowNo;
	}
	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
	}
	public String getColumnNo() {
		return columnNo;
	}
	public void setColumnNo(String columnNo) {
		this.columnNo = columnNo;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	private String errorType;
	private String errorDesc;
}
