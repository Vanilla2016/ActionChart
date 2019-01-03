package com.gamebooks.lonewolf.enums;

public enum WeaponsEnum {
	
	DAGGER(0),
	SPEAR(1),
	MACE(2),
	SHORTSWORD(3),	
	WARHAMMER(4),
	SWORD(5),
	AXE(6),
	QUARTERSTAFF(7),
	BROADSWORD(8);
	
	private final int weaponCode;
	
	private WeaponsEnum(int weaponCode) {
		this.weaponCode = weaponCode;
	}
}
