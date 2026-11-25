package main.experiments.shopSystem

import main.experiments.shopSystem.products.Item
import java.util.Date

enum class Status{
    PENDING, IN_PROGRESS, CONFIRMED, COMPLETED;

    fun next():Status = when(this){
        PENDING -> IN_PROGRESS
        IN_PROGRESS -> CONFIRMED
        CONFIRMED -> COMPLETED
        else -> error("Already completed")
    }
}

data class Event(
    val type: Status,
    val date: Date,
)

data class Order(
    val id: Int,
    var status: Status = Status.PENDING,
    val item: Item,
    private val history: MutableList<Event> = mutableListOf(),
){
    fun changeStatus(status: Status){
        this.status.next()
        this.history += Event(type = status, date = Date())
    }
}

class OrderManager(
    storage: StorageManager,
    val orders: MutableList<Order> = mutableListOf(),
){

    fun newOrder(order: Order) { //удалить из склада, добавить в orders
        //storage.remove(order.id)
        orders += order
    }

    fun cancelOrder(id: Int) {
        //удалить из orders, добавить в склад
        //storage.new(order)
        //orders -= order.id
    }

    fun getStatus(order: Order): Status {
        return order.status
    }
}