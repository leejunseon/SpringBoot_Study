package practice.service;

import java.util.List;

import practice.domain.ScheduleVO;

public interface ScheduleService {

	int add(ScheduleVO schedule) throws Exception;

	List<ScheduleVO> get(String start, String end) throws Exception;

}
