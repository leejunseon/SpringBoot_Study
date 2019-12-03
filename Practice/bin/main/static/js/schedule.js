console.log("Schedule js Module");

var scheduleService=(function(){	
	
	function remove(reply,callback,error){
		console.log("scheduleService.remove");
		console.log(reply);
		
		$.ajax({
			type:'delete',
			url:'/replies/'+reply.rno,
			data:JSON.stringify(reply),
			contentType:"application/json; charset=utf-8",
			beforeSend: function(xhr){   
                xhr.setRequestHeader(reply.csrf_header, reply.csrf_token);
            },
			success:function(deleteResult,status,xhr){
				if(callback){
					callback(deleteResult);
				}
			},
			error:function(xhr,status,er){
				if(error){
					error(status);
				}
			}
		});
	}
	
	function update(reply,callback,error){
		console.log("scheduleService.update");
		console.log(reply);
		
		$.ajax({
			type:'put',
			url:'/replies/'+reply.rno,
			data:JSON.stringify(reply),
			contentType:"application/json; charset=utf-8",
			beforeSend: function(xhr){   
                xhr.setRequestHeader(reply.csrf_header, reply.csrf_token);
            },
			success:function(result,status,xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr,status,er){
				if(error){
					error(status);
				}
			}
		});
	}
	
	return {
		remove:remove,
		update:update
	};	
})();