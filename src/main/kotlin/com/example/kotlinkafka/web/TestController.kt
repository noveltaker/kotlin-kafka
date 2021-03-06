package com.example.kotlinkafka.web

import com.example.kotlinkafka.action.producer.dto.TestDTO
import com.example.kotlinkafka.action.producer.TestProducer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController constructor(private val testProducer: TestProducer) {

    @PostMapping("test")
    @ResponseStatus(HttpStatus.CREATED)
    fun testMethod(@RequestBody dto: TestDTO): TestDTO? = testProducer.save(dto)
}
