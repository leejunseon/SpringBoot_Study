console.log("Schedule js Module");


var scheduleService=(function(){
	
	function getSchedules() {
        var calendarEl = document.getElementById('calendar');

        var calendar = new FullCalendar.Calendar(calendarEl, {
        	plugins: [ 'timeGrid' ],
            timeZone: 'UTC',
            defaultView: 'timeGridWeek',
            header: {
              left: 'prev,next today',
              center: 'title',
              right: 'timeGridWeek,timeGridDay'
            },
            minTime:"06:00:00",
            maxTime:"22:00:00",
        	eventClick: function(info) {
        	    alert('Event: ' + info.event.title+"\nstart: "+info.event.start+"\nend: "+info.event.end+"\nuser: "+info.event.id);
        	},
        	events:[
        		 {
       			    "title": "All Day Event",
       			    "start": "2019-12-01T16:00:00",
           			"end": "2019-12-01T20:00:00",
           			"id":"이준선",
           			"textColor":"white"
       			  },
       			  {
       			    "title": "Long Event",
       			    "start": "2019-12-07",
       			    "end": "2019-12-10"
       			  },
       			  {
       			    "id": "999",
       			    "title": "Repeating Event",
       			    "start": "2019-12-09T16:00:00"
       			  },
       			  {
       			    "id": "999",
       			    "title": "Repeating Event",
       			    "start": "2019-12-16T16:00:00"
       			  },
       			  {
       			    "title": "Conference",
       			    "start": "2019-12-11",
       			    "end": "2019-12-13"
       			  },
       			  {
       			    "title": "Meeting",
       			    "start": "2019-12-12T10:30:00",
       			    "end": "2019-12-12T12:30:00"
       			  },
       			  {
       			    "title": "Lunch",
       			    "start": "2019-12-12T12:30:00"
       			  },
       			  {
       			    "title": "Meeting",
       			    "start": "2019-12-12T14:30:00"
       			  },
       			  {
       			    "title": "Happy Hour",
       			    "start": "2019-12-12T17:30:00"
       			  },
       			  {
       			    "title": "Dinner",
       			    "start": "2019-12-12T20:00:00"
       			  },
       			  {
       			    "title": "Birthday Party",
       			    "start": "2019-12-13T07:00:00"
       			  },
        	]
        });

        calendar.render();
	}
	
	return {
		getSchedules:getSchedules
	};	
})();