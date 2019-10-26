console.log("Reply js Module");

var replyService=(function(){
	
	function add(reply,callback,error){
		console.log("replyService.add()");
		$.ajax({
			type:'post',
			url:'/replies/new',
			data:JSON.stringify(reply),
			contentType:"application/json; charset=utf-8",
			success:function(result,status,xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr,status,er){
				if(error){
					error(er);
				}
			}
		});
	}
	
	
	function getReplies(param,callback,error){
		console.log("replyService.getReplies()");
		
		$.ajax({
			type:'get',
			url:'/replies/pages/'+param.bno+'/'+param.page,
			dataType:'json',
			success:function(result){
				if(callback)
					callback(result);
			},
			error:function(xhr,status,er){
				if(error){
					error(er);
				}
			}
		});
	}
	
	return {
		add:add,
		getReplies:getReplies
	};	
})();