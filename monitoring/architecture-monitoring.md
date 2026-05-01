# Monitoring - Stack ELK

## Objectif
Mettre en place une supervision des applications déployées.

## Architecture

- Les logs des conteneurs (Docker/Kubernetes) sont collectés
- Elasticsearch stocke les logs
- Kibana permet la visualisation

## Fonctionnement

1. Les applications génèrent des logs
2. Les logs sont envoyés vers Elasticsearch
3. Kibana permet d'effectuer des recherches et visualisations

## Exemple de requête Kibana

- rechercher les erreurs :
  status: "error"

- logs backend :
  app: "backend"
