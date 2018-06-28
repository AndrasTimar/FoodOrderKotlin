package me.andrastimar.FoodOrderKotlin.repository

import me.andrastimar.FoodOrderKotlin.model.Food
import org.springframework.data.repository.CrudRepository

interface FoodRepository : CrudRepository<Food, Long>