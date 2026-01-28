# Documentation technique – Projet InfoLine

## 1. Contexte
Le projet InfoLine vise à déployer une plateforme web dédiée aux actualités et produits sportifs connectés.
L’architecture repose sur des principes DevOps, Cloud et microservices afin d’assurer la scalabilité, la disponibilité et l’automatisation des déploiements.

## 2. Objectifs
- Automatiser le déploiement de l’infrastructure
- Mettre en place un pipeline CI/CD
- Déployer des applications conteneurisées sur Kubernetes
- Implémenter une fonction serverless pour l’authentification
- Superviser les services via une solution de monitoring

## 3. Choix techniques
| Composant | Technologie | Justification |
|--------|------------|---------------|
| Cloud | AWS | Scalabilité, services managés |
| IaC | Terraform | Automatisation et reproductibilité |
| Orchestration | Kubernetes (EKS) | Haute disponibilité |
| CI/CD | GitHub Actions | Intégration simple |
| Backend | Spring Boot | Standard Java |
| Frontend | Angular | Framework moderne |
| Serverless | AWS Lambda | Gestion événementielle |
| Monitoring | Elasticsearch / Kibana | Centralisation des logs |

## 4. Environnement de travail
Le projet est réalisé sur une machine virtuelle Debian 11 (bullseye) Server hébergée sur un poste Windows.
Debian a été choisi pour sa stabilité, sa fiabilité et son usage courant dans les environnements serveurs professionnels.

## 5. Installation des outils DevOPS

Les outils suivants ont été installés sur la machine Debian 11 (Bullseye) :

- Docker (depôt officiel Docker)
- Terraform (HashiCorp)
- AWS CLI v2

Les installations ont été réalisées avec un utilisateur non privilégié disposant de droits sudo, conformément aux bonnes pratiques de sécurité.

## 6. Infrastructure as Code – Terraform

Un premier projet Terraform local a été mis en place afin de valider le fonctionnement
du cycle Terraform (init, plan, apply) avant l’utilisation d’un fournisseur Cloud.
La commande terraform destroy a été utilisée afin de supprimer les ressources créées,
illustrant la maîtrise du cycle de vie complet des infrastructures.

Le déploiement d’un bucket S3 a été réalisé via Terraform avec un utilisateur IAM dédié.
La ressource a ensuite été supprimée afin de maîtriser les coûts AWS.

Une phase de nettoyage du dépôt Git a été réalisée afin de supprimer les fichiers générés et sensibles avant la livraison finale.

## 7. Déploiement Kubernetes (maquette)

Le déploiement Kubernetes a été conçu sous forme de manifests YAML afin de démontrer la compréhension des concepts fondamentaux.

- Un Deployment permet de gérer le cycle de vie du conteneur backend
- Un Service de type NodePort expose l’application sur le réseau

Le déploiement n’a pas été exécuté sur un cluster Kubernetes réel afin de limiter la complexité de l’infrastructure dans le cadre de l’ECF.
