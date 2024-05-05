package tn.ensit.product.princing

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Pricing(
    @Id
    @GeneratedValue
    val pricingId: Long = 0,
    val productId: Long = 0,
    val basePrice: Double = 0.0,
    val discount: Double = 0.0
)
