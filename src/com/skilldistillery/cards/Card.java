package com.skilldistillery.cards;

import java.util.Objects;

public class Card {
// has -a 
	private Rank rank;
	private Suit suit;
	public Card(Rank r, Suit s) {
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	@Override
	public String toString() {
		return "Card of " + rank + " of" + suit + ".";
	}
	public Rank getValue() {
		return rank;
	}
	public void setValue(Rank rank) {
		this.rank = rank;
	}
	
}
