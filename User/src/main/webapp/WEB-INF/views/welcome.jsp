<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/style.css'/>" rel="stylesheet"
	type="text/css" />
<title>Congratulations</title>
</head>
<body>
	<h1>YOU MADE IT!</h1>

<form:form action="${pageContext.request.contextPath}/login/new.html"
		method="POST" ModelAttribute="user">
Username: <input type ="text" name="UserID"> <br/>
Password: <input type ="text" name="Password"> <br/>

<input type="submit" value ="Submit"/> <br/><br/>
    <input type="reset" value ="Cancel"/> <br/>


</form:form>

<!-- Header -->
<header class="w3-container w3-red w3-right" style="padding:128px 16px">
  <h1 class="w3-margin w3-jumbo">National University of Singapore</h1>
  <p class="w3-xlarge">Include login here</p>
  <button class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Login</button> &nbsp &nbsp
<button class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Cancel</button>

</header>


<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-twothird">
      <h1>About NUS</h1>
      <h5 class="w3-padding-32">The National University of Singapore aspires to be a vital community of academics, researchers, staff, students and alumni working together in a spirit of innovation and enterprise for a better world.

<br>Our singular focus on talent will be the cornerstone of a truly great university that is dedicated to quality education, influential research and visionary enterprise, in service of country and society.</h5>

      <p class="w3-text-grey">
      <center>VISION
<br>a leading global university
<br>shaping the future

<br><br>MISSION
<br>to educate, inspire and transform

<br><br>VALUES
<br>innovation, resilience 
<br>excellence, respect, integrity
</center>
</p>
    </div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
    </div>
  </div>
</div>

<!-- Second Grid -->
<div class="w3-row-padding w3-light-grey w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-third w3-center">
      <i class="fa fa-coffee w3-padding-64 w3-text-red w3-margin-right"></i>
    </div>

    <div class="w3-twothird">
      <h1>About IVLE</h1>
      <h5 class="w3-padding-32">The Integrated Virtual Learning Environment (IVLE) is a NUS' custom designed and built Learning Management System for the NUS community. It is designed to facilitate and supplement teaching at the National University of Singapore (NUS).</h5>

      <p class="w3-text-grey"> IVLE is designed to:
      <br>1. Ease the administrative work of the teaching staff
<br>2. Provide more opportunities and avenues for staff and students to collaborate and communicate
<br>3. Acts as a teaching portfolio for staff
<br>4. Facilitate student-to-student collaboration
<br>5. Promote explorative and independent learning
<br>6. Promote greater understanding of subjects taught through the use of self-assessments and polls
<br>7. Provide a one-stop acess to all the learning resources at NUS
<br><br>To achieve its objectives, IVLE has a rich set of online tools and resources. From class rosters with photographs, online syllabus, assignment repositories, lesson plans, forums, chat rooms, assessments, surveys, project and peer management, web lectures, class and exam time tables, library e-reserves and virtual communities, NUS’ learning management system combines all the resources needed to manage and supplement course modules effectively.</p>
    </div>
  </div>
</div>

<div class="w3-container w3-black w3-center w3-opacity w3-padding-10">
		<h1 class="w3-margin w3-large">Made by SA47 Team 13</h1>
	</div>
	<footer class="w3-container w3-padding-10 w3-center w3-opacity">
		<div class="w3-xlarge w3-padding-10">
			<a href="https://www.facebook.com/NationalUniversityofSingapore/" class="fa fa-facebook-official w3-hover-opacity" ></a>
				<a href="https://www.instagram.com/nus_singapore/" class="fa fa-instagram w3-hover-opacity"></a>
				<a href = "https://www.youtube.com/user/NUScast" class="fa fa-youtube w3-hover-opacity"></a>
				<a href = "https://twitter.com/NUSingapore" class="fa fa-twitter w3-hover-opacity"></a>
				<a href = "https://www.linkedin.com/school/national-university-of-singapore/" class="fa fa-linkedin w3-hover-opacity"></a>
		</div>
		<p>
			<h4>Powered by <a
				href="https://www.iss.nus.edu.sg/about-us/staff/detail/272/Suriya%20Priya%20ASAITHAMBI"
				target="_blank" >Suria</a></h4>
		</p>
	</footer>

	<script>
		// Used to toggle the menu on small screens when clicking on the menu button
		function myFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>

</body>
</html>