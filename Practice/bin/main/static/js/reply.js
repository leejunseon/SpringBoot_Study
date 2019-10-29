console.log("Reply js Module");

var replyService=(function(){
	
	function add(reply,callback,error){
		console.log("replyService.add ");
		console.log(reply);
		
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
		console.log("replyService.getReplies");
		console.log(param);
		
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
	
	function remove(rno,callback,error){
		console.log("replyService.remove");
		console.log(rno);
		
		$.ajax({
			type:'delete',
			url:'/replies/'+rno,
			success:function(deleteResult,status,xhr){
				if(callback){
					callback(deleteResult);
				}
			},
			error:function(xhr,status,er){
				if(error){
					error(er);
				}
			}
		});
	}
	
	function update(reply,callback,error){
		console.log("replyService.update");
		console.log(reply);
		
		$.ajax({
			type:'put',
			url:'/replies/'+reply.rno,
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
	
	return {
		add:add,
		getReplies:getReplies,
		remove:remove,
		update:update
	};	
})();