<html>
<head>
<script type="text/javascript" src="javascript/jquery.js" ></script>
<style type="text/css">
	.randomNumber {
		border="2";
		color: red;
	}
	.vitalStats {
		valign: top;
		font-size: 12px;
		color: red;
		padding: 5px;
		margin:10px;
		height: 20px;
	}
	.vitalStatBoxes {
		
	}
</style>
</head>
<body>
<img alt="" src="images/title.png">

<table border="2" width=100%>
<tr>
	<td align="middle" width="90%">
		<button class="randomNumberButton" onclick="randomNumber()">Random Number</button>
	</td>
	<td align="middle" class="randomNumber" width="10%" />
</tr>
<tr height="200">
<td width="50%" class="vitalStatBoxes" valign="top" align="middle">
	<table border="0" width="100%">
	<tr>
		<td width="50%" bgcolor="red">
		<table>
			<tr>
				<td>Combat Skill</td>
			</tr>
			<tr>
				<td><input type="text" /></td>
			</tr>
		</table>
		</td>
		<td width="50%">Endurance Points<input type="text" /></td>
	</tr>
	<tr>
		<td width="50%">Combat Record</td>
		<td>
			<table>
			
			</table>
		</td>
	</tr>
	
	
	</table>
</td>

<td width="50%" align="middle">
<table border="2">
	
	<tr>
		<td colspan="1">
			<img src="images/acstats.png">
		</td>
	</tr>
</table>
</tr>
<tr height="200">
<td width="50%" align="middle" valign="top">
<table border="0">
	<td width="50%" align="middle" valign="middle">
		<img src="images/acbckpck.png">
		<img src="images/acdscplz.png">
	</td>
</table>
<td width="50%" align="middle">
	<img src="images/acspcl.png" />
</td>
</tr>
</table>
	
</body>
<script>
	$( document ).ready(function() {
	    $( ".randomNumber" ).hide();
	});
	
	$( ".randomNumberButton" ).hover(
		function() {
		    $( ".randomNumber" ).show("slow");
		},
		function() {
		    $( ".randomNumber" ).hide("slow");
			$( ".randomNumber" ).html( "" );
		}
	);

	function randomNumber () {
      $.get( "CalculationServlet?random=true", function( data ) {
    	  $( ".randomNumber" ).html( data );
   		});
	}

</script>
</html>
