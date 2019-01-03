package com.gamebooks.lonewolf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gamebooks.lonewolf.LoneWolfDataConnector.ConnectorRetriever;
import com.gamebooks.lonewolf.enums.KaiDisciplinesEnum;
import com.gamebooks.lonewolf.enums.KaiRankEnum;
import com.gamebooks.lonewolf.enums.WeaponsEnum;
import com.mysql.jdbc.MySQLConnection;

/**
 * Servlet implementation class ActionChartServlet
 */
public class ActionChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MySQLConnection inputConnection;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionChartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("function") != null && request.getParameter("function").equalsIgnoreCase("kaiTrainingRank")) {
			response.getWriter().append(getTrainingRanks());
		} else if (request.getParameter("function") != null && request.getParameter("function").equalsIgnoreCase("getWeapons")) {
			response.getWriter().append(getWeapons());
		}  else if (request.getParameter("function") != null && request.getParameter("function").equalsIgnoreCase("getKaiDisciplines")) {
			response.getWriter().append(getKaiDisciplines());
	   }
	}

	
	private String getKaiDisciplines() {
		StringBuffer kaiDisciplineBuffer = new StringBuffer();
		for (KaiDisciplinesEnum rank : KaiDisciplinesEnum.values()) {
			String name = rank.name();
			kaiDisciplineBuffer.append(name); 
			kaiDisciplineBuffer.append(":"); 
		}
		return kaiDisciplineBuffer.toString();
	}

	private String getTrainingRanks() {
		StringBuffer trainingRankBuffer = new StringBuffer();
		for (KaiRankEnum rank : KaiRankEnum.values()) {
			String name = rank.name();
			trainingRankBuffer.append(name); 
			trainingRankBuffer.append(":"); 
		}
		return trainingRankBuffer.toString();
	}

	private String getWeapons(){
		StringBuffer weaponsBuffer = new StringBuffer();
		for (WeaponsEnum weaponCode : WeaponsEnum.values()){
			String name = weaponCode.name();
			weaponsBuffer.append(name); 
			weaponsBuffer.append(":"); 
		}
		return weaponsBuffer.toString();
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
