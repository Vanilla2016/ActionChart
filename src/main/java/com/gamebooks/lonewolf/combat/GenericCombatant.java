package com.gamebooks.lonewolf.combat;

public class GenericCombatant implements Combatant {

	private String title;
	private int combatSkill;
	private int endurancePoints;
	
	public GenericCombatant(int combatSkill, int endurancePoints) {
		this.combatSkill = combatSkill;
		this.endurancePoints = endurancePoints;
	}
	
	public GenericCombatant(String title, int combatSkill, int endurancePoints) {
		this(combatSkill, endurancePoints);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCombatSkill() {
			return combatSkill;
		}
	
	public void setCombatSkill(int combatSkill) {
		this.combatSkill = combatSkill;
	}
	
	public int getEndurancePoints() {
			return endurancePoints;
		}
	
	public void setEndurancePoints(int endurancePoints) {
		this.endurancePoints = endurancePoints;
	}

	public int getGoldCrowns() {
		return 0;
	}

	
}
