package practice.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ScheduleVO {

	private int bno;
	private String writer;
	private String title;
	private Date startTime;
	private Date endTime;
	
}
