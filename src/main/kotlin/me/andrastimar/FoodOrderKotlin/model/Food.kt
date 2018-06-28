package me.andrastimar.FoodOrderKotlin.model

import javax.persistence.*

@Entity
@Table(name = "food")
data class Food(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val name: String,
        val price: Int
) {
    constructor() : this(name = "", price = 0)
}
