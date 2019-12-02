package practice.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import practice.domain.ScheduleVO;

@Mapper
public interface ScheduleMapper {

	int add(ScheduleVO schedule);

	List<ScheduleVO> get(@Param("start") Date startInput, @Param("end")Date endInput);

}
