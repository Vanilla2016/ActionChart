<html>
<head>
<script type="text/javascript" src="javascript/jquery.js" ></script>
<style type="text/css">
	.randomNumber {
		border="0";
		color: red;
	}
	.vitalStatBoxes {
		height: 55px;
	}
	.vitalStatBoxesInput {
		height: 75px;
		align: middle;
	}
	.combatRecords {
		width: 33%;
		bgcolor:red;
	}
	.combatRecordInput {
		height: 18px;
		bgcolor:red;
	}
</style>
</head>
<body>
<img alt="" src="images/title.png">

<table border="0" width=100%>
<tr>
	<td align="middle" width="90%">
		<button class="randomNumberButton" onclick="randomNumber()">Random Number</button>
	</td>
	<td align="middle" class="randomNumber" width="10%" />
</tr>
<tr height="200">
<td width="50%" valign="top" >
	<table border="0" width="100%">
	<tr>
		<td width="50%">
		<table>
			<tr>
				<td>Combat Skill</td>
			</tr>
			<tr>
				<td class="vitalStatBoxes" >
					<input type="text" class="vitalStatBoxesInput"/>
				</td>
			</tr>
		</table>
		</td>
		<td width="50%">
		<table>
			<tr>
				<td>Endurance Points</td>
			</tr>
			<tr>
				<td class="vitalStatBoxes">
					<input type="text" class="vitalStatBoxesInput"/>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
	<td colspan="2">
		<table border="2" width="100%">
		<tr>
			<td width="100%" >Combat Record</td>
		</tr>
		<tr>
			<td width="100%">
				<table border="0" width="100%">
					<thead>
					<tr>
						<th class="combatRecords">Lone Wolf EP</th>
						<th class="combatRecords">Combat Ratio</th>
						<th class="combatRecords">Enemy EP</th>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					<tr>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
						<td class="combatRecordInput"><input type="text"/></td>
					</tr>
					</thead>
				</table>
			</td>
		</tr>
		</table>
	</td>
	</tr>
	
	
	</table>
</td>

<td width="50%" align="middle">
<table border="2">
	<tr>
		<td colspan="1">
			<img src="images/acitems.png">
		</td>
	</tr>
</table>
</tr>

<td width="100%" align="middle" valign="top" bgcolor="blue">
<table border="2">
	<td width="100%" align="middle" valign="middle">
		<table border="0" width="100%">
		<tr>
			<th width="100%" class="combatRecords">Backpack Items</th>
		</tr>
		<tr>
			<td class="backpackItem"><b>1</b><input type="text"/></td>
			<td class="backpackItem"><b>2</b><input type="text"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>3</b><input type="text"/></td>
			<td class="backpackItem"><b>4</b><input type="text"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>5</b><input type="text"/></td>
			<td class="backpackItem"><b>6</b><input type="text"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>7</b><input type="text"/></td>
			<td class="backpackItem"><b>8</b><input type="text"/></td>
		</tr>
		</table>
	</td>
</table>
<table border="2">
	<td width="100%" align="middle" valign="middle">
		<table border="0" width="100%">
		<tr>
			<th width="100%" class="combatRecords">Kai Disciplines</th>
			<th width="100%" class="combatRecords">Rank</th>
		</tr>
		<tr>
			<td class="backpackItem"><b>1</b><input type="text"/></td>
			<td class="backpackItem"><input type="text" value="Novice"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>2</b><input type="text"/></td>
			<td class="backpackItem"><input type="text" value="Intuit"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>3</b><input type="text"/></td>
			<td class="backpackItem"><input type="text" value="Doan"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>4</b><input type="text"/></td>
			<td class="backpackItem"><input type="text" value="Acolyte"/></td>
		</tr>
		<tr>
			<td class="backpackItem"><b>5</b><input type="text"/></td>
			<td class="backpackItem"><input type="text" value="Initiate"/></td>
		</tr>
		</table>
	</td>
</table>
</td>
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
