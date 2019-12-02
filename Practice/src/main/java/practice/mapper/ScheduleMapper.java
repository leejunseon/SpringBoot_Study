package practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import practice.domain.ScheduleVO;

@Mapper
public interface ScheduleMapper {

	int add(ScheduleVO schedule);

	List<ScheduleVO> get(String start, String end);

}
