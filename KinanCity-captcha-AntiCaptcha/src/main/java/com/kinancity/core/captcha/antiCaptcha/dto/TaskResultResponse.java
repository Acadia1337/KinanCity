package com.kinancity.core.captcha.antiCaptcha.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskResultResponse {
	private Integer errorId;
	private String errorCode;
	private String errorDescription;
	private String status;
	private CatpchaSolutionDto solution;
	private Double cost;
	private Integer solveCount;
	
	public static final String PROCESSING = "processing";
	public static final String READY = "ready";
}
