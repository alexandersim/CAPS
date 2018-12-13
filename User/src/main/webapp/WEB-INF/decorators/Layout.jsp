<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html lang="en">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-graduation-cap {font-size:200px}
</style>

<body>

<title><dec:title/></title>
<!-- !PAGE CONTENT! -->
<div class="w3-main">

<!-- Sidebar/menu -->
<!-- <nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-left" style="z-index:3;width:150px">
  <div class="w3-container w3-display-container">
    <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i> -->
     
    <div class="w3-sidebar w3-bar-block w3-black w3-collapse w3-xxlarge" style="width:200px">
    <div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>
    <dec:getProperty property = "sidebar"/>
  <!-- <a href="#" class="w3-bar-item w3-button"><i class="fa fa-home"></i></a> 
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-search"></i></a> 
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i></a> 
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-globe"></i></a>
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-trash"></i></a>  -->
</div>

</nav>

<!-- Header -->
<header class="w3-container w3-amber style="padding:16px">
  <h1 class="w3-margin w3-jumbo w3-center">National University of Singapore</h1>
  </header>


<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-twothird">
      <p class="w3-xlarge"><dec:head /></p>
    </div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-indigo"></i>
    </div>
  </div>
</div>

<!-- Second Grid -->
<div class="w3-row-padding w3-indigo w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-third w3-right">
      <i class="fa fa-graduation-cap w3-padding-64 w3-text-white w3-margin-right"></i>
    </div>

    <div class="w3-twothird">
      <dec:body/></div>
  </div>
</div>
<div class="w3-container w3-black w3-center w3-opacity">
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