package com.gamebooks.lonewolf.actionchart;

import java.util.ArrayList;

import com.gamebooks.lonewolf.combat.Combatant;
import com.gamebooks.lonewolf.items.Item;

public interface ActionChart {


	public int getMeals();
	public int getGoldCrowns();
	
	public ArrayList<Item> getBackpackItems();
	
	public ArrayList<Combatant> getEnemies();

	public enum Rank {
		ACOLYTE("acolyte"),
		DOAN("doan"),
		INTUIT("intuit"),
		NOVICE("novice");
		
		private Rank (String description){
			this.description = description;
		}
		private String description;

		public String getDescription() {
			return description;
		}
	}

	public enum KaiDiscipline {
		CAMOUFLAGE("camouflage"),
		HUNTING("hunting"),
		TRACKING("tracking"),
		HEALING("healing"),
		WEAPONSKILL("weaponskill"),
		MINDSHIELD("mindshield"),
		MINDBLAST("mindblast"),
		ANIMALKINSHIP("animalkinship"),
		MINDOVERMATTER("mindovermatter");
		
		private KaiDiscipline (String description){
			this.description = description;
		}
		private String description;
		
		public String getDescription() {
			return description;
		}
	}

	public enum Weapon {
		DAGGER("DAGGER"),
		SPEAR("SPEAR"),
		MACE("MACE"),
		HEALING("healing"),
		SHORTSWORD("SHORTSWORD"),
		WARHAMMER("WARHAMMER"),
		MINDBLAST("mindblast"),
		SWORD("SWORD"),
		AXE("AXE"),
		QUARTERSTAFF("QUARTERSTAFF"),
		BROADSWORD("BROADSWORD");
		
		private Weapon (String description){
			this.description = description;
		}
		private String description;
		
		public String getDescription() {
			return description;
		}
	}
}
