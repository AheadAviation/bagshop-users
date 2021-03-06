package com.aheadaviation.bagshop.users.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class User(

  var firstName: String = "",
  var lastName: String = "",
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Long = 0

)