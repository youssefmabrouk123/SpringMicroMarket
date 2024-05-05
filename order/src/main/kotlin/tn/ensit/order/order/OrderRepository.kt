package tn.ensit.order.order

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<Order, Long> {
    fun findByStatus(orderStatus: OrderStatus): List<Order>
}