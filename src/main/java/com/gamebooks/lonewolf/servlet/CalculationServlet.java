package com.gamebooks.lonewolf.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gamebooks.lonewolf.LoneWolfDataConnector.ConnectorRetriever;
import com.gamebooks.lonewolf.combat.CharacterUtils;
import com.gamebooks.lonewolf.combat.Combatant;
import com.gamebooks.lonewolf.combat.GenericCombatant;
import com.gamebooks.lonewolf.combat.LoneWolf;
import com.mysql.jdbc.MySQLConnection;

/**
 * Servlet implementation class CalculationServlet
 */
public class CalculationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private MySQLConnection inputConnection;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//(char)new Integer(CombatUtils.getRandomNumber()).intValue()
		if (request.getParameter("random")!=null && request.getParameter("random").equalsIgnoreCase("true")) {
			int randomNumber = getRandomNumber();
			response.getWriter().append(new Integer(randomNumber).toString());
		} else if (request.getParameter("newcharacter")!=null && request.getParameter("newcharacter").equalsIgnoreCase("true")) {
			Combatant newChar ;
			if (request.getParameter("isLoneWolf")!=null && request.getParameter("isLoneWolf").equalsIgnoreCase("true")){
				newChar = createNewCharacter(true);
			} else {
				newChar = createNewCharacter(false);
			}
			
				if (newChar!=null){
					response.getWriter().append("combatSkill:").append(new Integer(newChar.getCombatSkill()).toString())
					.append("&").append("endurancePoints:").append(new Integer(newChar.getEndurancePoints()).toString())
					.append("&").append("goldCrowns:").append(new Integer(newChar.getGoldCrowns()).toString());
				}
		}
	}

	private int getRandomNumber(){
		return CharacterUtils.getRandomNumber();
	}
	
	private Combatant createNewCharacter(boolean isLoneWolf) {
		
		Combatant newChar = null;
		String titleString;
		int combatSkill = CharacterUtils.getRandomNumber()+10; 
		int endurancePoints = CharacterUtils.getRandomNumber()+20;
		int goldCrowns = CharacterUtils.getRandomNumber();
		ResultSet newCharResultSet = null;
		inputConnection = ConnectorRetriever.getInstance();
		
		try {
			String insertStatement = "INSERT INTO ROLEPLAYING.PLAYERCHARACTER "
					+ "(IDPLAYERCHARACTER, PLAYERCHARACTERNAME, COMBATSKILL, ENDURANCEPOINTS, GOLDCROWNS, RANK) "
					+ "VALUES(1, ?, ?, ?, ?, 'Initiate')";
			
			PreparedStatement insertNewCharPrepStat = inputConnection.prepareStatement(insertStatement);
			
			if (isLoneWolf) {
				titleString = "Lone Wolf";
				newChar = new LoneWolf(combatSkill, endurancePoints, goldCrowns);
			} else {
				titleString = "Some Schlep";
				newChar = new GenericCombatant(titleString, combatSkill, endurancePoints);
			}
			
			insertNewCharPrepStat.setString(1, titleString);
			insertNewCharPrepStat.setInt(2, combatSkill);
			insertNewCharPrepStat.setInt(3, endurancePoints);
			insertNewCharPrepStat.setInt(4, goldCrowns);
			                 
			insertNewCharPrepStat.execute();
			/*
			String retrieveStatement = "SELECT * FROM ROLEPLAYING.PLAYERCHARACTER";
			PreparedStatement retrieveNewCharPrepStat = inputConnection.prepareStatement(retrieveStatement);
			if (retrieveNewCharPrepStat.execute())
				System.out.println("Create success");
			newCharResultSet = retrieveNewCharPrepStat.getResultSet();
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newChar;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
