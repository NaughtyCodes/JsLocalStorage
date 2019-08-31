var callBackUrl = window.localStorage.getItem("H"+window.localStorage.getItem('I'));

window.document.getElementById("result").innerHTML = "Application From : "+callBackUrl;

function login(){
	window.localStorage.setItem("loginFlag",'Y');
	window.location.assign(callBackUrl);
}

function validate(){
	let error = "";
	let value = window.document.getElementById("testField01").value;
	console.log(value);

	if(value === void(0) || isNaN(value) || (value+'').trim().length == 0){
		error = "Only positive numbers and non decimal value allowed";
	} else if(parseFloat(value) <= 0){
		error = "Value should be grater then zero and non decimal";
	} else if((value+'').split('.').length >= 2){
		error  = "Value should not be in decimal and less then zero";
	} else {
		error = "No Error .....!!";
	}
	
	window.document.getElementById("validate").innerHTML = error;
}