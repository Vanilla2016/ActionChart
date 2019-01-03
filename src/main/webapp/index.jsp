<!--  %@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<script type="text/javascript" src="javascript/jquery.js" ></script>
	<link rel="stylesheet" type="text/css" href="css/ActionChart.css" />
</head>
<body bgcolor="#ffffe6">

	<div class="rTable">
		<div class="rTableRow">
			<button class="youDiedButton" onclick="youDied()">You Died</button>
				<img id="grimreaper">
		</div>
	</div>
 	 <div id="nextChapter">Next<br>Book</div>
	 <div class="titleImage">
	 </div>
	 	<div class="rTableRollNewCharacter">
		<div class="rTableRow">
			<div class="rTableCell"><button class="rollNewCharacter" onclick="rollNewCharacter()">RollNewCharacter</button></div>
		</div>
	</div>
	<div class="rTableKaiTrainingLevel">
		<div class="rTableRow">
			 <div class="rTableCell" id="kaiTrainingLevel">
			 	
			 </div>
		</div>
	</div>
		<div class="rTableRandomNumber">
			<div class="rTableCell"><button class="randomNumberButton" onclick="randomNumber()">Random Number</button></div>
			<div class="randomNumberOutput"></div>
		</div>
	<div class="rTableVitalStats">
		<div class="rTableRow">
			<div class="rTableHead">Combat Skill</div>
			<div class="rTableHead">Endurance Points</div>
		</div>	
		<div class="rTableRow">
			<div class="rTableCell" id="combatSkill"></div>
			<div class="rTableCell" id="endurancePoints"></div>
		</div>	
	</div>
	</div>
	<div class="rTableCombatRecords">
	<div>
		<div class="rTableRow">
			<div class="rTableCell">Combat Records</div>	
		</div>	
		<div class="rTableRow">
			<div class="rTableHead"><strong>Lone Wolf EP</strong></div>
			<div class="rTableHead"><strong>Combat Ratio</strong></div>
			<div class="rTableHead"><strong>Enemy EP</strong></div>
			<div class="rTableHead"></div>
		</div>
		<c:forEach var="i" begin="1" end="6">
		<div class="rTableRow">
			<div class="rTableCell" id="LoneWolfEpBox_<%=pageContext.findAttribute("i") %>"></div>	
			<div class="rTableCell" id="combatRatio_<%=pageContext.findAttribute("i") %>"></div>	
			<div class="rTableCell"><div class="vitalStatBoxesInput"><input class="enemyEpBox" id="enemyEpBox_<%=pageContext.findAttribute("i") %>" type="text"/></div></div>	
			<div class="rTableCell"><button id="combatControl_<%=pageContext.findAttribute("i") %>"" class="combatControl" onclick="startCombat('<%=pageContext.findAttribute("i") %>')"></div>	
		</div>	
		</c:forEach>
			
		</div>
	</div>
	</div>
	 <div id="kaiDisciplines">
		<div class="rTable">
			<div class="rTableRow">
				<div class="rTableHead"><strong>Kai Disciplines</strong></div>
				<div class="rTableHead"><span style="font-weight: bold;">Known Effect</span></div>
			</div>
		</div>
		<c:forEach var="i" begin="1" end="4">
		<div class="rTable">
			<div class="rTableRow">
				<div class="rTableCell kaiDiscipline" id="kaiDiscipline_<%=pageContext.findAttribute("i") %>"></div>
				<div class="rTableCell"><input type="text" class="rInputText"/></div>
			</div>
		</div>
		</c:forEach>
	 </div>
	<div class="rTableGoldCrowns rTable">
		<div class="rTableRow">
			<div class="vitalStatBoxes">Belt Pouch</div>
			<div class="vitalStatBoxes"><button class="addCrown" onclick="updateCrowns('add')">addCrowns</button></div>
			<div class="goldCrowns" onclick="updateCrowns('remove')"></div>
		</div>
	</div>
	<div class="rTableWeapoms">
	<div>
		<div class="rTableRow">
			<div class="vitalStatBoxes">Weapons</div>
			<div class="rTableCell" id="weaponsBox1"><input type="text"/></div>
			<div class="rTableCell" id="weaponsBox2"><input type="text"/></div>
		</div>
	</div>
	</div>
	 <div class="rTableBackpackItems">
	 	<div class="rTableRow">
			<div class="rTableCell">Backpack Items</div>	
		</div>
		<div class="rTableRow">
		<c:forEach begin="1" end="6" var="i" >
			<div class="rTableCell">
				<strong><%=pageContext.findAttribute("i") %></strong><div class="vitalStatBoxesInput"><input id ="vitalStatBoxesInput_<%=pageContext.findAttribute("i") %>" type="text"/></div>
			</div>	
			<c:if test="${i%2==0}">
				</div>	
			<div class="rTableRow">
			</c:if>
		</c:forEach>
		</div>
	</div>
	<div class="rTableSpecialItems">
	 	<div class="rTableRow">
			<div class="rTableCell">Special Items</div>	
		</div>	
		<div class="rTableRow">
			<div class="rTableCell">
				<strong>1</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
			<div class="rTableCell">
				<strong>2</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
		</div>	
		<div class="rTableRow">
			<div class="rTableCell">
				<strong>3</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
			<div class="rTableCell">
				<strong>4</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
		</div>	
		<div class="rTableRow">
			<div class="rTableCell">
				<strong>5</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
			<div class="rTableCell">
				<strong>6</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
		</div>	
		<div class="rTableRow">
			<div class="rTableCell">
				<strong>7</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
			<div class="rTableCell">
				<strong>8</strong><div class="vitalStatBoxesInput"><input type="text"/></div>
			</div>	
		</div>
	</div>
</body>
<script>
	$( document ).ready(function() {
	    $( ".randomNumberOutput" ).hide();
	    
	    $(".combatControl").html("Begin");
	    $(".enemyEpBox").prop("disabled", true);
	    
	    var playerStats = '<%=session.getAttribute("playerstats")%>'.split(";");
	    var intGoldCrowns;
	    
	    for (var i=0; i<playerStats.length; i++){
   			var nameVal = playerStats[i].split('=');
   			$("#"+nameVal[0]).html(nameVal[1]);
   			
   			if (nameVal[0] == 'goldCrowns') {
   				intGoldCrowns = nameVal[1];
   			}
   		}

	    /* Initialize gold crowns */
	    var intNoOfCrowns = 0
	    for (var i=0; i < intNoOfCrowns; i++){
			intNoOfCrowns = intNoOfCrowns+25; 
			$(".goldCrowns").css("width", intNoOfCrowns);
	    }
	    	
	   	$(".rollNewCharacter").attr("disabled", "disabled");
	    
	    $.get( "getKaiDisciplines", function(data) {
	   		 $( ".kaiDiscipline" ).html( data );
	    } )
	   /*
	    $.get( "ActionChartServlet?function=getWeapons", function(data) {
	    	   	var rs = data.split(":");
	    		var str= "";
	    		str += "<select name='weapons'>"
		    	for (var i=0; i<rs.length-1; i++){
		    		 str +="<option value='"+rs[i]+"'>"+rs[i]+"</option>\n";
		    	}
	    		str += "</select>";
	   		 $( "#weaponsBox1" ).html( str );
	   		 $( "#weaponsBox2" ).html( str );
	    } )
	*/
	});
	
	$( "#nextChapter" ).hover(
		function(){
			//alert('hover');
		}		
	);
	
	/*Advance book cover banner*/
    $( "#nextChapter" ).click (
    	function() {
    		var imageUrl = $(".titleImage").css("background-image");
    		var imageNumber = imageUrl.substring(imageUrl.length-7, imageUrl.length-6);
    		imageNumber++;
    		  $(".titleImage").css("background-image", "url('images/title"+imageNumber+".png')");
    	});
    
	$( ".randomNumberButton" ).hover(
		function() {
		    $( ".randomNumberOutput" ).show("slow");
		},
		function() {
		    $( ".randomNumberOutput" ).hide("slow");
			$( ".randomNumberOutput" ).html( "" );
		}
	);

	/*Use this to animate death's head on death roll*/
	$( ".youDiedButton" ).click(function() {
		});
	
	function youDied() {
		alert('you died');
		  $( "#grimreaper" ).animate({
		    opacity: 0.75,
		    left: "+=50",
		    height: "toggle"
		  }, 1000, function() {
		    // Animation complete.
		  });
	}
	
	function updateCrowns(op) {
		var operand;
		if (op == 'add') {
			operand = 25;
		} else {
			operand = -25;
		}
		var intNoOfCrowns = parseInt($(".goldCrowns").css("width"), 10);
		intNoOfCrowns = intNoOfCrowns+operand; 
		$(".goldCrowns").css("width", intNoOfCrowns);
	}
	
	function startCombat(combatRow) {
		
		$("#enemyEpBox_"+combatRow).removeAttr("disabled");
	}
	
	function randomNumber () {
      $.get( "CalculationServlet?random=true", function( data ) {
    	  $( ".randomNumberOutput" ).html( data );
   		});
	}
	
	function rollNewCharacter () {
      $.get( "CalculationServlet?newcharacter=true&isLoneWolf=true", function( data ) {
    	  if (data) {
	    	  var str = data.split("&");
	    	  for (var i = 0; i < str.length; i++){
	    		  var keyValue = str[i].split(":");
	    		  $( "#"+keyValue[0]).html( keyValue[1] );
	    	  }
	    	  $(".rollNewCharacter").attr("disabled", "disabled");
	  	   }
    	});
	}
</script>
</html>
