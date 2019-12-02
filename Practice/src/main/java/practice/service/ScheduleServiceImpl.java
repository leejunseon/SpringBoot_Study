package practice.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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
	    Date startInput=new SimpleDateFormat("yyyy-MM-dd").parse(start);
	    Date endInput=new SimpleDateFormat("yyyy-MM-dd").parse(end);
	    List<ScheduleVO> result=mapper.get(startInput,endInput);
	    for(ScheduleVO sc:result) {
	    	sc.setStart(LocalDateTime.ofInstant(sc.getStartTime().toInstant(), ZoneId.systemDefault()));
	    	sc.setEnd(LocalDateTime.ofInstant(sc.getEndTime().toInstant(), ZoneId.systemDefault()));
	    }
		return result;
	}

}
