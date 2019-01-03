package com.gamebooks.lonewolf.actions;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gamebooks.lonewolf.LoneWolfDataConnector.ConnectorRetriever;
import com.gamebooks.lonewolf.combat.Combatant;
import com.gamebooks.lonewolf.combat.LoneWolf;
import com.gamebooks.lonewolf.enums.KaiDisciplinesEnum;
import com.mysql.jdbc.MySQLConnection;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/* Retrieve character profile from Database, 
 * create Combatant object,
 * set vital stats in session
 */
public class SetupAction extends ActionSupport {

	private MySQLConnection connection;
	private Combatant returningCharacter;
	
	public String execute () {
		
		returningCharacter = getCharacterSave();
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		
		session.setAttribute("playerstats", "combatSkill="+returningCharacter.getCombatSkill()+";endurancePoints="+
										returningCharacter.getEndurancePoints()+";goldCrowns="+returningCharacter.getGoldCrowns());
		
		return SUCCESS;
	}

	private Combatant getCharacterSave (){

		int savedCharacterID;
		int savedCharacterCombatSkill;
		int savedCharacterEndurancePoints;
		int savedCharacterGoldCrowns;
		Combatant savedCharacter = null;
		ResultSet savedCharacterSet;
		
		connection = ConnectorRetriever.getInstance();
		//Lookup LoneWolf
		String retrieveStatement = "SELECT * FROM ROLEPLAYING.PLAYERCHARACTER WHERE IDPLAYERCHARACTER = 1";
		
		try {
			
			PreparedStatement retrievePrep = connection.prepareStatement(retrieveStatement);
			savedCharacterSet = retrievePrep.executeQuery();
			savedCharacterSet.next();
			
			savedCharacterID = savedCharacterSet.getInt("idplayercharacter");
			savedCharacterCombatSkill = savedCharacterSet.getInt("combatskill");
			savedCharacterEndurancePoints = savedCharacterSet.getInt("endurancepoints");
			savedCharacterGoldCrowns = savedCharacterSet.getInt("goldcrowns");
			savedCharacter = new LoneWolf(savedCharacterCombatSkill, savedCharacterEndurancePoints, savedCharacterGoldCrowns);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return savedCharacter;
	}
}
