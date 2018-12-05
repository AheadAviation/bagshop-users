package com.aheadaviation.bagshop.users.persistence

import com.aheadaviation.bagshop.users.model.User
import org.springframework.data.repository.CrudRepository


interface UserRepository : CrudRepository<User, Long> {
  fun findByLastName(name: String): List<User>
}