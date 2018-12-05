package fr.unilim.iut.kebab.ingredients;


import Visitor.VisiteurDeRegimeVegetarien;
import fr.unilim.iut.kebab.Kebab;

public class Agneau extends Ingredient {

    public Agneau(String nom, Kebab kebab) {
        super(nom,kebab);
    }
    
    @Override
    public boolean isVegetarien() {
        return false;
    }

    @Override
    public boolean isPescetarien() {
        return false;
    }
    
    public void accept(VisiteurDeRegimeVegetarien v) {
    	v.visit(this);
    }
}
