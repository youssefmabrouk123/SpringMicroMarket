## Spring MicroMarket



Conception et développement d'une architecture de microservices avec Spring Boot, incluant un projet de configuration centralisée (Spring Cloud Config), un registre de services (Spring Cloud Netflix Eureka), et des microservices dédiés à la gestion des commandes et des produits. Ce projet démontre les principes clés de la conception de microservices dans l'écosystème Spring.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)



## Fonctionnalités

- **Architecture Microservices :** Démonstration d'une architecture basée sur les microservices.
- **Configuration Centralisée :** Utilisation de Spring Cloud Config pour gérer la configuration de manière centralisée.
- **Registre de Services :** Intégration de Spring Cloud Netflix Eureka pour la découverte et l'enregistrement des services.
- **Gestion des Produits :** Microservice dédié à la gestion du catalogue de produits.
- **Gestion des Commandes :** Microservice dédié au traitement et à la gestion des commandes clients.
- **Communication Inter-services :** Mise en place de la communication entre les microservices (potentiellement via REST ou un bus de messages).

## Technologies Utilisées

- Java
- Spring Boot
- Spring Cloud:
  - Spring Cloud Config (Serveur de configuration)
  - Spring Cloud Netflix Eureka (Registre de services)
- Maven ou Gradle
- Git
- (Potentiellement) Base de données (ex: H2, MySQL, PostgreSQL)
- (Potentiellement) Outils de communication (ex: Feign, RestTemplate, Kafka, RabbitMQ)
## Mise en Route

Instructions pour configurer et lancer le projet localement.

### Prérequis

Assurez-vous d'avoir installé les éléments suivants :

- Java Development Kit (JDK) 11 ou supérieur
- Apache Maven ou Gradle
- Git
- (Optionnel) Docker si des images sont fournies

```bash
# Vérifier la version de Java
java -version
# Vérifier la version de Maven (si utilisé)
mvn -version
# Vérifier la version de Gradle (si utilisé)
gradle -v
```

### Installation

L'architecture microservices nécessite de démarrer plusieurs composants dans un ordre spécifique (généralement Config Server, puis Eureka Server, puis les autres microservices).

1.  **Cloner le dépôt**
    ```bash
    git clone https://github.com/youssefmabrouk123/SpringMicroMarket.git
    cd SpringMicroMarket
    ```

2.  **Démarrer le Serveur de Configuration (Config Server)**
    - Naviguez vers le répertoire du Config Server (ex: `cd config-server`).
    - Configurez les sources de configuration (ex: dépôt Git local ou distant).
    - Compilez et lancez le service :
      ```bash
      # Exemple avec Maven
      mvn spring-boot:run
      ```

3.  **Démarrer le Registre de Services (Eureka Server)**
    - Naviguez vers le répertoire d'Eureka Server (ex: `cd eureka-server`).
    - Compilez et lancez le service :
      ```bash
      # Exemple avec Maven
      mvn spring-boot:run
      ```
    - Vérifiez que le serveur Eureka est accessible (généralement sur `http://localhost:8761`).

4.  **Démarrer les Microservices (Produits, Commandes, etc.)**
    - Pour chaque microservice (ex: `product-service`, `order-service`) :
      - Naviguez vers le répertoire du microservice.
      - Assurez-vous que la configuration (via Config Server) et l'enregistrement Eureka sont corrects.
      - Compilez et lancez le service :
        ```bash
        # Exemple avec Maven
        mvn spring-boot:run
        ```
    - Vérifiez dans l'interface Eureka que les services s'enregistrent correctement.

## Utilisation

Une fois tous les services démarrés et enregistrés auprès d'Eureka :

1.  Accédez aux différents microservices via leurs ports respectifs ou via une passerelle API (si configurée).
2.  Utilisez un outil comme Postman ou `curl` pour interagir avec les API REST exposées par les microservices (ex: ajouter un produit, passer une commande).

### Exemples d'Appels API (Illustratif)

**Obtenir la liste des produits :**
```bash
curl http://localhost:<port_product_service>/api/products
```

**Créer une commande :**
```bash
curl -X POST -H "Content-Type: application/json" -d 
{
  "productId": 1,
  "quantity": 2
} http://localhost:<port_order_service>/api/orders
```

*(Remplacez `<port_product_service>` et `<port_order_service>` par les ports réels des microservices)*


## Contribution

Les contributions sont les bienvenues ! Si vous avez des suggestions ou trouvez des bugs, veuillez ouvrir une issue ou soumettre une pull request.

1. Forkez le Projet
2. Créez votre branche de fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Committez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Pushez vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request

## Licence

Ce projet n'a actuellement pas de licence. Envisagez d'en ajouter une (par exemple, Licence MIT) en créant un fichier `LICENSE` à la racine du dépôt.
## Contact

Youssef Mabrouk - [Profil GitHub](https://github.com/youssefmabrouk123)

Lien du Projet : [https://github.com/youssefmabrouk123/SpringMicroMarket](https://github.com/youssefmabrouk123/SpringMicroMarket)
## Remerciements

*   Je tiens à remercier chaleureusement Ala BEN KHALIFA, Lead Software Engineer | Spring Enthusiast | MicroServices Architect | ISAQB® Certified | PSM1® chez MaibornWolff GmbH, qui a été notre formateur et nous a transmis son expertise précieuse en architecture microservices avec Spring Boot tout au long de ce projet.

