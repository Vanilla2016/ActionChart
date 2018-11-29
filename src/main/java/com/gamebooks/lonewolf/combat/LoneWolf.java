package com.gamebooks.lonewolf.combat;

public class LoneWolf implements Combatant {

	private int combatSkill;
	private int endurancePoints;
	
	public LoneWolf(int combatSkill, int endurancePoints) {
		super();
		this.combatSkill = combatSkill;
		this.endurancePoints = endurancePoints;
	}

	public void setCombatSkill(int combatSkill) {
		this.combatSkill = combatSkill;
	}

	public void setEndurancePoints(int endurancePoints) {
		this.endurancePoints = endurancePoints;
	}

	@Override
	public int getCombatSkill() {
		return combatSkill;
	}

	@Override
	public int getEndurancePoints() {
		return endurancePoints;
	}
}
