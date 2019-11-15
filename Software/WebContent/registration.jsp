<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style.css"></link>
<script src="functio.js"></script>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-sm-4  col-md-4  col-lg-4"></div>
			<div class="col-sm-6  col-md-6  col-lg-6">
				<form action="/Software/RegisterServlet" method="post">
					<h3>SIGN-UP</h3>
					<table>
						<tr>
							<td><h4>First Name:</h4></td>
							<td><input type="text" placeholder="Enter Your Name"
								name="name" id="name" onblur="checkname()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="fname" class="tx"></td>
						</tr>
						<tr>
							<td><h4>Username:</h4></td>
							<td><input type="text" placeholder="Enter UserName"
								name="username" id="username" onblur="checkusername()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="funame" class="tx"></td>
						</tr>
						<tr>
							<td><h4>Email-id:</h4></td>
							<td><input type="text" placeholder="Enter Email-id"
								name="email" id="email" onblur="checkemail()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="femail" class="tx"></td>
						</tr>
						<tr>
							<td><h4>Mobile No:</h4></td>
							<td><input type="text" placeholder="Enter Mobile No"
								name="mobile" id="mobile" onblur="checkmobile()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="fmobile" class="tx"></td>
						</tr>
						<tr>
							<td><h4>Password:</h4></td>
							<td><input type="password" placeholder="Enter Password"
								name="pswd" id="pswd" onblur="checkpass()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="fpswd" class="tx"></td>
						</tr>
						<tr>
							<td><h4>Re-Password:</h4></td>
							<td><input type="password" placeholder="Re-Enter Password"
								name="cpswd" id="cpswd" onblur="checkrepass()"></td>
						</tr>
						<tr>
							<td></td>
							<td id="fcpswd" class="tx"></td>
						</tr>

						<tr>
							<td></td>
							<td><input type="submit" value="Sign-up" name="btn" id="btn"></button></td>
						</tr>

					</table>
				</form>

			</div>
		</div>

	</div>
	
</body>
</html>