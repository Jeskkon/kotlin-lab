package main.experiments.shopSystem

class OrderHistory(
    val history: MutableList<Order> = emptyList<Order>().toMutableList(),
) {
    fun newLog(order: Order) {

    }
}