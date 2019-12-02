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
        	events: '/schedule/get'
        });

        calendar.render();
	}
	
	return {
		getSchedules:getSchedules
	};	
})();