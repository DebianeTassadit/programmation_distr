  GNU nano 7.2                                                                                                                       README.md                                                                                                                       Modkkjj
# Programmation Distribuée

## Description
Ce dépôt contient le projet **"Programmation Distribuée"**, développé dans le cadre du cours sur la programmation distribuée. L'objectif est de créer et tester des applications réparties qui exploitent les concepts de programmation distribuée, en mettant en œuvre des services REST à l'aide de **Spring Boot**.

Ce projet inclut des endpoints REST pour gérer et consulter des informations via un serveur Tomcat intégré.

## Technologies utilisées
- **Langage principal** : Java
- **Frameworks et bibliothèques** :
  - **Spring Boot** : Développement rapide de l'application backend.
  - **SLF4J** : Gestion des logs pour tracer les événements et les requêtes.
- **Outils de développement** :
  - **Gradle** : Gestionnaire de build.
  - **Git** : Gestion des versions du code.
  - **Postman** : Test des API REST.
- **Environnement d'exécution** :
  - Serveur Tomcat intégré (port 8080, par défaut).

## Endpoints disponibles
Voici les endpoints actuellement implémentés :
- **GET** `/bonjour` : Retourne un message de bienvenue.
- **GET** `/bonjour_new` : Retourne un message de re-bienvenue.
- **GET** `/cars/rentalNumber` : Log une requête pour obtenir les numéros de location.
- **GET** `/cars/{plateNumber}` : Log une requête pour obtenir les détails d'une voiture via son numéro de plaque.

## Installation et utilisation
1. **Cloner le projet localement** :
   ```bash
   git clone git@github.com:DebianeTassadit/programmation_distr.git
   cd programmation_distr
2. **Configurer l'environnement** :

- Installez **Java 21+**.
- Installez **Gradle** (si ce n'est pas déjà fait).

3. **Démarrer l'application** :

- Avec Gradle Wrapper :
  ```bash
  ./gradlew bootRun

4. **Tester les endpoints** :
- Utilisez curl, Postman, ou un navigateur
