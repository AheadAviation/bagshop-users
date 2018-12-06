package com.aheadaviation.bagshop.users.controller

import com.aheadaviation.bagshop.users.model.User
import com.aheadaviation.bagshop.users.persistence.UserRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/users")
class UserController(val repository: UserRepository) {

  @GetMapping
  fun findAll() = repository.findAll()

  @PostMapping
  fun addUser(@RequestBody user: User) = repository.save(user)

  @GetMapping("/{id}")
  fun getById(@PathVariable id: Long) = repository.findById(id)

  @PutMapping("/{id}")
  fun updateUser(@PathVariable id: Long, @RequestBody user: User) {
    assert(user.id == id)
    repository.save(user)
  }

  @DeleteMapping("/{id}")
  fun removeUser(@PathVariable id: Long) = repository.deleteById(id)

}