package Visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;

public interface VisiteurDeRegime {
	boolean visit(Agneau a);
}
