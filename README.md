# Manuel d'installation de Projet-socialVenture

## Prérequis
- NetBeans IDE installé sur votre machine
- Java Development Kit (JDK) installé
- Une connexion Internet pour télécharger les fichiers nécessaires

## 1. Récupération du projet

### Option 1 : Téléchargement du ZIP
1. Rendez-vous sur https://github.com/angePatrickKOUTOU/Projet-socialVenture
2. Cliquez sur le bouton vert "Code"
3. Sélectionnez "Download ZIP"
4. Décompressez le fichier ZIP dans le dossier de votre choix

### Option 2 : Clonage avec Git
1. Ouvrez votre terminal
2. Naviguez vers le dossier où vous souhaitez cloner le projet
3. Exécutez la commande :
   ```
   git clone https://github.com/angePatrickKOUTOU/Projet-socialVenture.git
   ```

## 2. Installation du pilote JDBC SQLite

1. Téléchargez le pilote JDBC SQLite depuis https://sourceforge.net/projects/sqlite-jdbc-driver.mirror/
2. Conservez le fichier .jar téléchargé dans un endroit facilement accessible

## 3. Configuration dans NetBeans

1. Lancez NetBeans
2. Cliquez sur "File" > "Open Project"
3. Naviguez vers le dossier du projet et sélectionnez-le
4. Clic droit sur le projet dans l'explorateur de projets
5. Sélectionnez "Properties"
6. Dans la fenêtre des propriétés :
   - Sélectionnez "Libraries" dans le panneau de gauche
   - Cliquez sur "Add JAR/Folder"
   - Naviguez vers l'emplacement du pilote JDBC SQLite (.jar) précédemment téléchargé
   - Sélectionnez le fichier et cliquez sur "Open"
   - Cliquez sur "OK" pour fermer la fenêtre des propriétés

## 4. Configuration de la base de données

1. Le fichier de base de données SQLite devrait déjà être inclus dans le projet
2. Vérifiez que le fichier de base de données est présent dans le dossier du projet
3. Si nécessaire, vérifiez la configuration de connexion dans les fichiers sources du projet

## 5. Lancement de l'application

1. Dans NetBeans, localisez le fichier principal du projet (main class)
2. Clic droit sur le projet
3. Sélectionnez "Run" ou appuyez sur F6

## Résolution des problèmes courants

### Si la base de données n'est pas trouvée
- Vérifiez que le chemin vers le fichier de base de données dans le code correspond à l'emplacement réel du fichier
- Assurez-vous que vous avez les droits d'accès au fichier de base de données

### Si le pilote JDBC n'est pas reconnu
- Vérifiez que le .jar est correctement ajouté dans les bibliothèques du projet
- Essayez de nettoyer et reconstruire le projet (Clean and Build)

### Si le projet ne se lance pas
- Vérifiez que vous avez bien la dernière version de Java installée
- Assurez-vous que tous les fichiers du projet ont été correctement téléchargés/clonés
- Vérifiez les logs d'erreur dans la console de NetBeans

## Support

Si vous rencontrez des problèmes lors de l'installation, vous pouvez :
- Consulter la documentation du projet sur GitHub
- Ouvrir une issue sur le repository GitHub du projet
- Vérifier les requirements du projet dans le fichier README
