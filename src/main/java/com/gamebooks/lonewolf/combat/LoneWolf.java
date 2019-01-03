package com.gamebooks.lonewolf.combat;

public class LoneWolf extends GenericCombatant {

	private final String TITLE = "Lone Wolf";
	
	@Override
	public String getTitle() {
		return TITLE;
	}

	private int goldCrowns;
	
	public LoneWolf(int combatSkill, int endurancePoints, int goldCrowns) {
		super(combatSkill, endurancePoints);
		this.goldCrowns = goldCrowns;
	}
	
	public int getGoldCrowns() {
		return goldCrowns;
	}

	public void setGoldCrowns(int goldCrowns) {
		this.goldCrowns = goldCrowns;
	}

	
}
