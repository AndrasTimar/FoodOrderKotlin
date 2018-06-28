package me.andrastimar.FoodOrderKotlin.controller

import me.andrastimar.FoodOrderKotlin.model.Food
import me.andrastimar.FoodOrderKotlin.repository.FoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController("food")
class FoodController {

    @Autowired
    lateinit var foodRepository: FoodRepository

    @GetMapping
    fun getFood() = foodRepository.findAll().take(10)

    @PostMapping
    fun createFood(@RequestBody food: Food) = foodRepository.save(food)
}