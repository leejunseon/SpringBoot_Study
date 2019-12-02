package practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import practice.domain.ScheduleVO;
import practice.mapper.ScheduleMapper;

@Service
@AllArgsConstructor
public class ScheduleServiceImpl implements ScheduleService{

	ScheduleMapper mapper;
	
	@Override
	public int add(ScheduleVO schedule) throws Exception {
		// TODO Auto-generated method stub
		return mapper.add(schedule);
	}

	@Override
	public List<ScheduleVO> get(String start, String end) throws Exception {
		// TODO Auto-generated method stub
		return mapper.get(start,end);
	}

}
