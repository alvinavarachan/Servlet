function checkname() {

	var name = $("#name").val();
	var len = name.length;

	if (len >= 3) {
		document.getElementById("fname").innerHTML = "";
	} else {
		var t = ('Enter Valid Name');
		document.getElementById("fname").innerHTML = t;
	}
};

function checkusername() {

	var name = $("#username").val();
	var len = name.length;

	if (len >= 5) {
		document.getElementById("funame").innerHTML = "";
	} else {
		var t = ('Enter Valid UserName');
		document.getElementById("funame").innerHTML = t;
	}
};

function checkemail() {

	var ema = $("#email").val();
	

	if (ema.includes("@") && ema.includes(".")) {
		
		document.getElementById("femail").innerHTML = "";
	} else {
		
		var t = ('Enter Valid Email');
		document.getElementById("femail").innerHTML = t;

	}
	
};

function checkmobile() {

	var name = $("#mobile").val();
	var len = name.length;

	if (len == 10) {
		document.getElementById("fmobile").innerHTML = "";
	} else {
		var t = ('Enter Valid Mobile Number');
		document.getElementById("fmobile").innerHTML = t;
	}
};

function checkpass() {

	var pass = $("#pswd").val();
	var len = pass.length;

	if (len > 5) {
		document.getElementById("fpswd").innerHTML = "";
	} else {
		var t = ('Enter Strong Password');
		document.getElementById("fpswd").innerHTML = t;
	}
};

function checkrepass() {

	var pass = $("#pswd").val();
	var repass = $("#cpswd").val();
	var len = repass.length;

	if (pass == repass) {

		if (len < 1) {
			var t = ('Re-Enter Password');
			document.getElementById("fcpswd").innerHTML = t;

		} else {
			document.getElementById("fcpswd").innerHTML = "";

		}
	} else {
		var t = ('Password Mismatch');
		document.getElementById("fcpswd").innerHTML = t;
	}
};