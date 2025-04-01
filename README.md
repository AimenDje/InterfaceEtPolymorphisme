📌 Gestion de Polynômes en Java
🎯 Objectif du Projet
Ce mini-projet illustre les concepts de l'héritage, des exceptions et des structures de données en programmation orientée objet. 
Il met en œuvre une hiérarchie de classes pour manipuler des polynômes et introduit des exceptions personnalisées pour garantir l’intégrité des données.

🔢 Classe Term (Représentation d’un Terme)
La classe Term représente un terme dans un polynôme avec les attributs suivants :

coefficient : (double) Coefficient du terme (ex : 3.0, -2.5).

variable : (char) Nom de la variable (ex : ‘x’, ‘y’). Une variable indéterminée est représentée par ' '.

exponent : (int) Exposant du terme (ex : 0, 1, 2).

Caractéristiques :
✔️ Classe immuable avec accesseurs (getters).
✔️ Vérification des coefficients nuls via une exception personnalisée.
✔️ Redéfinition de la méthode toString() pour afficher les termes sous forme lisible ("3.0x^2", "4.0x", "8.0").

⚖️ Gestion des Exceptions
Deux exceptions personnalisées sont utilisées dans ce projet :

ZeroCoefficientException : Hérite de IllegalArgumentException, levée lorsqu’un terme avec un coefficient de 0 est créé ("Terms with a zero coefficient are invalid").

🧮 Interface Polynomial
L’interface Polynomial définit les opérations fondamentales sur les polynômes, notamment :

addTerm(Term t) : Ajoute un terme au polynôme.

removeTerm(Term t) : Supprime un terme du polynôme.

getTermCount() : Retourne le nombre total de termes.

getVariables() : Retourne une liste des variables utilisées dans le polynôme.

getExponents() : Retourne une liste des exposants uniques.

getTerms(char variable, int exponent) : Récupère les termes avec une variable et un exposant spécifiques.

getAllTerms() : Retourne tous les termes du polynôme.

🔗 Classe LLPolynomial (Implémentation avec une Liste Chaînée)
La classe LLPolynomial implémente l’interface Polynomial en utilisant LinkedList<Term>.

Caractéristiques :
✔️ Ajout et suppression de termes dans une liste chaînée.
✔️ Gestion des variables et des exposants uniques.
✔️ Tri des termes avec TermComparator.
✔️ Redéfinition de toString() pour afficher l’ensemble du polynôme sous forme lisible ("3.0x^2 + 4.0x + 8.0 - 2.0y^3").

📊 Classe TermComparator (Comparateur de Termes)
La classe TermComparator implémente Comparator<Term> pour trier les termes selon :
1️⃣ L’ordre lexicographique des variables (x < y < z < ' ').
2️⃣ L’exposant (ordre décroissant si les variables sont identiques).

🔢 Classe VectorPolynomial (Implémentation avec un Vecteur)
La classe VectorPolynomial propose une implémentation alternative en utilisant Vector<Term>.

Caractéristiques :
✔️ Même logique que LLPolynomial, mais avec Vector.
✔️ Redéfinition de toString() identique à LLPolynomial.

🔄 Classe PolynomialToolbox (Outils pour Polynômes)
Cette classe contient des méthodes de manipulation avancées :

simplify(Polynomial p) : Fusionne les termes ayant la même variable et le même exposant.

sum(Polynomial p1, Polynomial p2) : Additionne deux polynômes et retourne le polynôme résultant.

sort(Polynomial p) : Trie les termes avec TermComparator.

🛠️ Classe Driver (Classe de Test)
La classe Driver permet de tester toutes les fonctionnalités du projet :

✅ Création et manipulation d’objets Term, LLPolynomial et VectorPolynomial.
✅ Ajout, suppression et récupération de termes.
✅ Déclenchement et gestion des exceptions (ZeroCoefficientException).
✅ Affichage des polynômes sous différentes formes.
