package tn.ensit.product.product

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Product(
    @Id
    @GeneratedValue
    val productId: Long = 0,
    val name: String = "",
    val description: String? = null,
)
