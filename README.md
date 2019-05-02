# DogFightHugoVictorMehdi
Hugo - Controleur/Victor - Vue/Mehdi - Modele

Composant Modèle : (Mehdi)
il a la charge du stockage de toutes les données du projet, la position de avions, des nuages, des missiles, leur direction, la taille du ciel, ... 

Il est le seul à disposer de ces informations, par contre, il produit une interface (IDogfightModel) permettant aux composants extérieurs de lui poser des questions ou de lui donner des ordres. 

Il produit aussi un élément Observable permettant de savoir s'il a été modifé.

Composant Vue : (Victor)
Il a la charge de l'IHM du jeu. Il est donc le seul à savoir (et pouvoir) communiquer avec l'affichage et récupérer les informations envoyées par les joueurs. Il fournit une intetrface IViewSystem permettant à l'extérieur d'afficher des messages à l'écran.

Composant Contrôleur : (Hugo)
Il a la charge du moteur "réel" du jeu. Il sait traduire les informations envoyées par les joueurs en ordre pour les données du jeu. Il fournit une interface IOrderPerformer permettant aux composants extérieurs de lui transmettre les actions des joueurs.