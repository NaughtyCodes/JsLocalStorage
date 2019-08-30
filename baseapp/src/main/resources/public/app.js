var callBackUrl = window.localStorage.getItem("H"+window.localStorage.getItem('I'));

window.document.getElementById("result").innerHTML = "Application From : "+callBackUrl;

function login(){
	window.localStorage.setItem("loginFlag",'Y');
	window.location.assign(callBackUrl);
}