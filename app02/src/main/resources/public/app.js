(
		function (){
			if (typeof (Storage) !== void(0)) {
				
				window.localStorage.setItem('I',Number(window.localStorage.getItem('I')) === null ? 1 : Number(window.localStorage.getItem('I'))+1 );
				
				window.localStorage.setItem('H' + window.localStorage.getItem('I') ,window.location.href);
				
				console.log("History Length "+' => '+window.history.length	+' - '+window.localStorage.getItem("H"+ window.localStorage.getItem('I')));
				
				//window.document.getElementById("result").innerHTML = window.localStorage.getItem("H"+window.localStorage.getItem('I'));
				
				window.document.getElementById("result").innerHTML = JSON.stringify(window.localStorage);
				
				try {
					if(window.localStorage.getItem("loginFlag") === null || window.localStorage.getItem("loginFlag") !== 'Y'){
						window.location.assign("http://localhost:8081/baseapp");
					}
				} catch(e) {
					window.location.assign("http://localhost:8081/baseapp");
				}
				
			} else {
				window.document.getElementById("result").innerHTML = "Sorry, your browser does not support Web Storage...";
			}
		}
)();



function loginOut(){
	window.localStorage.setItem("loginFlag",'N');
	window.history.go(0);
}

function clearOut(){
	window.localStorage.clear();
	window.history.go(0);
}

function callApp01(){
	window.location.assign("http://localhost:8081/app01");
}