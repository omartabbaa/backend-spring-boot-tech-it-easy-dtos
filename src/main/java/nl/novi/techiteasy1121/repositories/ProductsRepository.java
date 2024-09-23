package nl.novi.techiteasy1121.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.novi.techiteasy1121.models.Television;

// We gebruiken hier een JpaRepository. Vergeet niet tussen de diamandjes "<>" als eerst het type van je entiteit
// mee te geven en vervolgens het type van het @Id-geannoteerde veld in die entiteit.import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Television, Long> {



}

