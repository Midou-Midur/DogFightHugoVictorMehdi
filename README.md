# DogFightHugoVictorMehdi
Hugo - Controleur/Victor - Vue/Mehdi - Modele

Composant Mod�le : (Mehdi)
il a la charge du stockage de toutes les donn�es du projet, la position de avions, des nuages, des missiles, leur direction, la taille du ciel, ... 

Il est le seul � disposer de ces informations, par contre, il produit une interface (IDogfightModel) permettant aux composants ext�rieurs de lui poser des questions ou de lui donner des ordres. 

Il produit aussi un �l�ment Observable permettant de savoir s'il a �t� modif�.

Composant Vue : (Victor)
Il a la charge de l'IHM du jeu. Il est donc le seul � savoir (et pouvoir) communiquer avec l'affichage et r�cup�rer les informations envoy�es par les joueurs. Il fournit une intetrface IViewSystem permettant � l'ext�rieur d'afficher des messages � l'�cran.

Composant Contr�leur : (Hugo)
Il a la charge du moteur "r�el" du jeu. Il sait traduire les informations envoy�es par les joueurs en ordre pour les donn�es du jeu. Il fournit une interface IOrderPerformer permettant aux composants ext�rieurs de lui transmettre les actions des joueurs.