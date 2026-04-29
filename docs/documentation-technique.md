# Documentation technique — ECF DevOps InfoLine

## 1. Contexte
Le projet InfoLine vise à mettre en place une architecture DevOps permettant de supporter une application orientée actualités et produits sportifs connectés.

## 2. Objectifs
- automatiser l’infrastructure
- conteneuriser les services
- préparer le déploiement Kubernetes
- mettre en place une logique CI/CD
- documenter les choix techniques

## 3. Environnement
- VM Debian 11
- accès SSH
- utilisateur non privilégié avec sudo
- Git et GitHub

## 4. Structure du projet
- `backend/` : service backend
- `frontend/` : maquettes frontend
- `terraform/` : infrastructure as code
- `k8s/` : manifests Kubernetes
- `cicd/` : pipeline CI/CD
- `monitoring/` : supervision
- `docs/` : documentation technique

## 5. Choix techniques initiaux
- Git / GitHub pour le versionnement
- Terraform pour l’IaC
- Docker pour la conteneurisation
- Kubernetes pour l’orchestration
- AWS comme fournisseur cloud

## Déploiement Kubernetes

Le backend est prévu pour être déployé sur Kubernetes via un Deployment.
Un Service de type NodePort permet d’exposer l’application.

Le déploiement est fourni sous forme de manifests YAML afin de démontrer la compréhension des concepts sans dépendre d’un cluster local.

## Authentification serverless

Une fonction Java a été développée pour simuler un service d’authentification serverless.

- Fonction stateless
- Différenciation entre utilisateur et administrateur
- Compatible avec AWS Lambda

Le déploiement réel n’est pas effectué afin de limiter la complexité dans le cadre de l’ECF.

## Frontend

Deux applications frontend sont prévues :
- une application principale
- une interface backoffice

Dans le cadre de l’ECF, ces applications sont simulées afin de se concentrer sur les aspects DevOps (déploiement, conteneurisation, CI/CD).

## CI/CD

Un pipeline GitHub Actions est mis en place afin d’automatiser certaines vérifications du projet.

Le pipeline réalise :
- la récupération du code
- le build de l’image Docker du backend
- la vérification de la présence des manifests Kubernetes

Ce pipeline constitue une base d’intégration continue adaptée au contexte de l’ECF.
