# Programmation Distribuée

## Description
Ce dépôt contient le projet **Programmation Distribuée**, développé dans le cadre d'un cours sur la programmation distribuée. L'objectif est de déployer un service REST en Java avec **Spring Boot**, puis de le conteneuriser avec **Docker** et l'orchestrer avec **Kubernetes et Istio**.

## Technologies
- **Langage principal** : Java 21
- **Frameworks et outils** :
  - **Spring Boot** : API REST et logique applicative
  - **SLF4J** : Gestion des logs
  - **Gradle** : Gestionnaire de build
- **Conteneurisation & Orchestration** :
  - **Docker** : Conteneurisation de l'application
  - **Kubernetes (Minikube)** : Orchestration des services
  - **Istio** : Gestion du trafic et des communications inter-services

## Endpoints disponibles
L'API expose plusieurs endpoints accessibles via HTTP :
- `GET /bonjour` : Retourne un message de bienvenue
- `GET /bonjour_new` : Retourne un message de re-bienvenue
- `GET /cars/rentalNumber` : Renvoie le nombre total de voitures en location
- `GET /cars/{plateNumber}` : Renvoie les détails d'une voiture à partir de son numéro de plaque

## Installation et Exécution

### 1. Cloner le projet
```bash
git clone git@github.com:DebianeTassadit/programmation_distr.git
cd programmation_distr
```

### 2. Configuration de l'environnement
Assurez-vous d'avoir installé les dépendances suivantes :
- **Java 21+**
- **Gradle**
- **Docker** (avec un compte Docker Hub configuré)
- **Minikube** (pour exécuter Kubernetes en local)

### 3. Construire et Exécuter l'Application
Avec Gradle Wrapper :
```bash
./gradlew bootRun
```
L'application est alors accessible sur `http://localhost:8080`.

### 4. Conteneurisation avec Docker
```bash
docker build -t rentalservice .
docker run -p 4000:8080 rentalservice
```
L'API est accessible via `http://localhost:4000/bonjour`.

### 5. Déploiement sur Kubernetes avec Minikube
Démarrer Minikube :
```bash
minikube start --driver=docker
kubectl apply -f deployment.yml
```
Vérifier que le service est bien déployé :
```bash
kubectl get pods
kubectl get services
```
Obtenir l'URL du service exposé :
```bash
minikube service rentalservice --url
```

### 6. Mise en place d'Istio
Installation d'Istio :
```bash
istioctl install --set profile=demo -y
kubectl label namespace default istio-injection=enabled
```
Application de la configuration Istio :
```bash
kubectl apply -f deployment.yml
```
L'application est alors accessible via l'Ingress Gateway Istio.

