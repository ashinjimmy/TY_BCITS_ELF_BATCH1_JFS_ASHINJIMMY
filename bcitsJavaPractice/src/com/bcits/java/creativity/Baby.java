package com.bcits.java.creativity;

public class Baby {

		Icecream flavour;

		public Baby(Icecream flavour) {
			super();
			this.flavour = flavour;
		}

		@Override
		public String toString() {
			return "Baby is getting  " + flavour + " flavoured Icecream";
	}
}
