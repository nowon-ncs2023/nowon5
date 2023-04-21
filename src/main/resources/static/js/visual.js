/**
 * 
 */
var items;
var target_idx=0;

var delay=3000;
var timmer;
var bullets;

$(function(){
	items=$(".slide1 .images1");
});

function playStopClicked(){
	$(this).hide();
	$(this).siblings().show();
	var playOrStop=$(this).index(); //0:play 1:stop
	if(playOrStop==0)auto();
	if(playOrStop==1)stop();
}

function auto(){
	stop();
	timmer=setTimeout(start, delay);
	//console.log("타이머 시작");
}
function stop(){
	clearTimeout(timmer);
	//console.log("타이머 멈춤");
}
function start(){
	move(1);
	auto();
}

//클릭한 인덱스번호가 타켓이 되도록
function bulletClicked(){
	var bi=$(this).index();
	target_idx=bi;
	move(0);
}
//이미지를 좌(1)또는 우(-1)로 이동하는 함수
function move(dir){
	//var target_idx=$(".item.target").index();
	target_idx=(target_idx+dir) % items.length;
	var next=(target_idx+1) % items.length;
	var prev=(target_idx-1) % items.length;
	items.removeClass("target next prev");
	items.eq(target_idx).addClass("target");
	items.eq(next).addClass("next");
	items.eq(prev).addClass("prev");
	
	bullets.removeClass("target");
	bullets.eq(target_idx).addClass("target");
	
	$(".txt .target").text($(".item.target").index()+1);
}

