package fr.unilim.iut.kebab.ingredients;

import Visitor.VisiteurDeRegimeVegetarien;
import fr.unilim.iut.kebab.Kebab;

public class Tomate extends Ingredient {

	public Tomate(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return super.isVegetarien();
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}

	@Override
	public void accept(VisiteurDeRegimeVegetarien v) {
		v.visit(this);
	}

}
